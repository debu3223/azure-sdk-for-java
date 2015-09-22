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
* IPConfiguration in a NetworkInterface
*/
public class NetworkInterfaceIpConfiguration extends ChildResource {
    private ArrayList<ResourceId> loadBalancerBackendAddressPools;
    
    /**
    * Optional. Gets or sets the reference of LoadBalancerBackendAddressPool
    * resource
    * @return The LoadBalancerBackendAddressPools value.
    */
    public ArrayList<ResourceId> getLoadBalancerBackendAddressPools() {
        return this.loadBalancerBackendAddressPools;
    }
    
    /**
    * Optional. Gets or sets the reference of LoadBalancerBackendAddressPool
    * resource
    * @param loadBalancerBackendAddressPoolsValue The
    * LoadBalancerBackendAddressPools value.
    */
    public void setLoadBalancerBackendAddressPools(final ArrayList<ResourceId> loadBalancerBackendAddressPoolsValue) {
        this.loadBalancerBackendAddressPools = loadBalancerBackendAddressPoolsValue;
    }
    
    private ArrayList<ResourceId> loadBalancerInboundNatRules;
    
    /**
    * Optional. Gets or sets list of references of LoadBalancerInboundNatRules
    * @return The LoadBalancerInboundNatRules value.
    */
    public ArrayList<ResourceId> getLoadBalancerInboundNatRules() {
        return this.loadBalancerInboundNatRules;
    }
    
    /**
    * Optional. Gets or sets list of references of LoadBalancerInboundNatRules
    * @param loadBalancerInboundNatRulesValue The LoadBalancerInboundNatRules
    * value.
    */
    public void setLoadBalancerInboundNatRules(final ArrayList<ResourceId> loadBalancerInboundNatRulesValue) {
        this.loadBalancerInboundNatRules = loadBalancerInboundNatRulesValue;
    }
    
    private String privateIpAddress;
    
    /**
    * Optional. Gets or sets the privateIPAddress of the Network Interface IP
    * Configuration
    * @return The PrivateIpAddress value.
    */
    public String getPrivateIpAddress() {
        return this.privateIpAddress;
    }
    
    /**
    * Optional. Gets or sets the privateIPAddress of the Network Interface IP
    * Configuration
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
    * Optional. Gets or sets the reference of the subnet resource
    * @return The Subnet value.
    */
    public ResourceId getSubnet() {
        return this.subnet;
    }
    
    /**
    * Optional. Gets or sets the reference of the subnet resource
    * @param subnetValue The Subnet value.
    */
    public void setSubnet(final ResourceId subnetValue) {
        this.subnet = subnetValue;
    }
    
    /**
    * Initializes a new instance of the NetworkInterfaceIpConfiguration class.
    *
    */
    public NetworkInterfaceIpConfiguration() {
        super();
        this.setLoadBalancerBackendAddressPools(new LazyArrayList<ResourceId>());
        this.setLoadBalancerInboundNatRules(new LazyArrayList<ResourceId>());
    }
}
