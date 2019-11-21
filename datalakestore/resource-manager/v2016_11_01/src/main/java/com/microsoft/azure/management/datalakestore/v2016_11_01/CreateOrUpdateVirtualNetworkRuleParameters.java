/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datalakestore.v2016_11_01;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * The parameters used to create a new virtual network rule.
 */
@JsonFlatten
public class CreateOrUpdateVirtualNetworkRuleParameters {
    /**
     * The resource identifier for the subnet.
     */
    @JsonProperty(value = "properties.subnetId", required = true)
    private String subnetId;

    /**
     * Get the resource identifier for the subnet.
     *
     * @return the subnetId value
     */
    public String subnetId() {
        return this.subnetId;
    }

    /**
     * Set the resource identifier for the subnet.
     *
     * @param subnetId the subnetId value to set
     * @return the CreateOrUpdateVirtualNetworkRuleParameters object itself.
     */
    public CreateOrUpdateVirtualNetworkRuleParameters withSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

}