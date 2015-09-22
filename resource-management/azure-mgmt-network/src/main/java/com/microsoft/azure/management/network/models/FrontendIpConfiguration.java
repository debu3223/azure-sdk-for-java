/**
 * 
 * Copyright (c) Microsoft and contributors.  All rights reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * 
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 */

// Warning: This code was generated by a tool.
// 
// Changes to this file may cause incorrect behavior and will be lost if the
// code is regenerated.

package com.microsoft.azure.management.network.models;

import com.microsoft.windowsazure.core.LazyArrayList;

import java.util.ArrayList;

/**
* Frontend IP address of the load balancer
*/
public class FrontendIpConfiguration extends ChildResource {
    private ArrayList<ResourceId> inboundNatRules;
    
    /**
    * Optional. Read only.Inbound rules URIs that use this frontend IP
    * @return The InboundNatRules value.
    */
    public ArrayList<ResourceId> getInboundNatRules() {
        return this.inboundNatRules;
    }
    
    /**
    * Optional. Read only.Inbound rules URIs that use this frontend IP
    * @param inboundNatRulesValue The InboundNatRules value.
    */
    public void setInboundNatRules(final ArrayList<ResourceId> inboundNatRulesValue) {
        this.inboundNatRules = inboundNatRulesValue;
    }
    
    private ArrayList<ResourceId> loadBalancingRules;
    
    /**
    * Optional. Gets Load Balancing rules URIs that use this frontend IP
    * @return The LoadBalancingRules value.
    */
    public ArrayList<ResourceId> getLoadBalancingRules() {
        return this.loadBalancingRules;
    }
    
    /**
    * Optional. Gets Load Balancing rules URIs that use this frontend IP
    * @param loadBalancingRulesValue The LoadBalancingRules value.
    */
    public void setLoadBalancingRules(final ArrayList<ResourceId> loadBalancingRulesValue) {
        this.loadBalancingRules = loadBalancingRulesValue;
    }
    
    private String privateIpAddress;
    
    /**
    * Optional. Gets or sets the IP address of the Load Balancer.This is only
    * specified if a specific private IP address shall be allocated from the
    * subnet specified in subnetRef
    * @return The PrivateIpAddress value.
    */
    public String getPrivateIpAddress() {
        return this.privateIpAddress;
    }
    
    /**
    * Optional. Gets or sets the IP address of the Load Balancer.This is only
    * specified if a specific private IP address shall be allocated from the
    * subnet specified in subnetRef
    * @param privateIpAddressValue The PrivateIpAddress value.
    */
    public void setPrivateIpAddress(final String privateIpAddressValue) {
        this.privateIpAddress = privateIpAddressValue;
    }
    
    private String privateIpAllocationMethod;
    
    /**
    * Optional. Gets or sets PrivateIP allocation method (Static/Dynamic)
    * @return The PrivateIpAllocationMethod value.
    */
    public String getPrivateIpAllocationMethod() {
        return this.privateIpAllocationMethod;
    }
    
    /**
    * Optional. Gets or sets PrivateIP allocation method (Static/Dynamic)
    * @param privateIpAllocationMethodValue The PrivateIpAllocationMethod value.
    */
    public void setPrivateIpAllocationMethod(final String privateIpAllocationMethodValue) {
        this.privateIpAllocationMethod = privateIpAllocationMethodValue;
    }
    
    private String provisioningState;
    
    /**
    * Optional. Gets or sets Provisioning state of the PublicIP resource
    * Updating/Deleting/Failed
    * @return The ProvisioningState value.
    */
    public String getProvisioningState() {
        return this.provisioningState;
    }
    
    /**
    * Optional. Gets or sets Provisioning state of the PublicIP resource
    * Updating/Deleting/Failed
    * @param provisioningStateValue The ProvisioningState value.
    */
    public void setProvisioningState(final String provisioningStateValue) {
        this.provisioningState = provisioningStateValue;
    }
    
    private ResourceId publicIpAddress;
    
    /**
    * Optional. Gets or sets the reference of the PublicIP resource
    * @return The PublicIpAddress value.
    */
    public ResourceId getPublicIpAddress() {
        return this.publicIpAddress;
    }
    
    /**
    * Optional. Gets or sets the reference of the PublicIP resource
    * @param publicIpAddressValue The PublicIpAddress value.
    */
    public void setPublicIpAddress(final ResourceId publicIpAddressValue) {
        this.publicIpAddress = publicIpAddressValue;
    }
    
    private ResourceId subnet;
    
    /**
    * Optional. Gets or sets the reference of the subnet resource.A subnet from
    * wher the load balancer gets its private frontend address
    * @return The Subnet value.
    */
    public ResourceId getSubnet() {
        return this.subnet;
    }
    
    /**
    * Optional. Gets or sets the reference of the subnet resource.A subnet from
    * wher the load balancer gets its private frontend address
    * @param subnetValue The Subnet value.
    */
    public void setSubnet(final ResourceId subnetValue) {
        this.subnet = subnetValue;
    }
    
    /**
    * Initializes a new instance of the FrontendIpConfiguration class.
    *
    */
    public FrontendIpConfiguration() {
        super();
        this.setInboundNatRules(new LazyArrayList<ResourceId>());
        this.setLoadBalancingRules(new LazyArrayList<ResourceId>());
    }
}
