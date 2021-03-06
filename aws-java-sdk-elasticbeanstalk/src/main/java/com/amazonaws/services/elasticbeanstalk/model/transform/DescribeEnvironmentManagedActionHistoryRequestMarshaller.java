/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not
 * use this file except in compliance with the License. A copy of the License is
 * located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.elasticbeanstalk.model.transform;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.elasticbeanstalk.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;

/**
 * DescribeEnvironmentManagedActionHistoryRequest Marshaller
 */

public class DescribeEnvironmentManagedActionHistoryRequestMarshaller
        implements
        Marshaller<Request<DescribeEnvironmentManagedActionHistoryRequest>, DescribeEnvironmentManagedActionHistoryRequest> {

    public Request<DescribeEnvironmentManagedActionHistoryRequest> marshall(
            DescribeEnvironmentManagedActionHistoryRequest describeEnvironmentManagedActionHistoryRequest) {

        if (describeEnvironmentManagedActionHistoryRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        Request<DescribeEnvironmentManagedActionHistoryRequest> request = new DefaultRequest<DescribeEnvironmentManagedActionHistoryRequest>(
                describeEnvironmentManagedActionHistoryRequest,
                "AWSElasticBeanstalk");
        request.addParameter("Action",
                "DescribeEnvironmentManagedActionHistory");
        request.addParameter("Version", "2010-12-01");
        request.setHttpMethod(HttpMethodName.POST);

        if (describeEnvironmentManagedActionHistoryRequest.getEnvironmentId() != null) {
            request.addParameter("EnvironmentId", StringUtils
                    .fromString(describeEnvironmentManagedActionHistoryRequest
                            .getEnvironmentId()));
        }

        if (describeEnvironmentManagedActionHistoryRequest.getEnvironmentName() != null) {
            request.addParameter("EnvironmentName", StringUtils
                    .fromString(describeEnvironmentManagedActionHistoryRequest
                            .getEnvironmentName()));
        }

        if (describeEnvironmentManagedActionHistoryRequest.getNextToken() != null) {
            request.addParameter("NextToken", StringUtils
                    .fromString(describeEnvironmentManagedActionHistoryRequest
                            .getNextToken()));
        }

        if (describeEnvironmentManagedActionHistoryRequest.getMaxItems() != null) {
            request.addParameter("MaxItems", StringUtils
                    .fromInteger(describeEnvironmentManagedActionHistoryRequest
                            .getMaxItems()));
        }

        return request;
    }

}
