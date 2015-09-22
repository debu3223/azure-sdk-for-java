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

package com.microsoft.windowsazure.management.compute.models;

import com.microsoft.windowsazure.core.LazyArrayList;

import java.util.ArrayList;

/**
* The parameters Azure uses to create the vm image for the virtual machine.
*/
public class VMImageInput {
    private ArrayList<DataDiskConfiguration> dataDiskConfigurations;
    
    /**
    * Optional. This corresponds to the DataDiskConfigurations of the VM Image
    * used to create a new role. The DataDiskConfigurations element is only
    * available using version 2014-10-01 or higher.
    * @return The DataDiskConfigurations value.
    */
    public ArrayList<DataDiskConfiguration> getDataDiskConfigurations() {
        return this.dataDiskConfigurations;
    }
    
    /**
    * Optional. This corresponds to the DataDiskConfigurations of the VM Image
    * used to create a new role. The DataDiskConfigurations element is only
    * available using version 2014-10-01 or higher.
    * @param dataDiskConfigurationsValue The DataDiskConfigurations value.
    */
    public void setDataDiskConfigurations(final ArrayList<DataDiskConfiguration> dataDiskConfigurationsValue) {
        this.dataDiskConfigurations = dataDiskConfigurationsValue;
    }
    
    private OSDiskConfiguration oSDiskConfiguration;
    
    /**
    * Optional. This corresponds to the OSDiskConfiguration of the VM Image
    * used to create a new role. The OSDiskConfiguration element is only
    * available using version 2014-10-01 or higher.
    * @return The OSDiskConfiguration value.
    */
    public OSDiskConfiguration getOSDiskConfiguration() {
        return this.oSDiskConfiguration;
    }
    
    /**
    * Optional. This corresponds to the OSDiskConfiguration of the VM Image
    * used to create a new role. The OSDiskConfiguration element is only
    * available using version 2014-10-01 or higher.
    * @param oSDiskConfigurationValue The OSDiskConfiguration value.
    */
    public void setOSDiskConfiguration(final OSDiskConfiguration oSDiskConfigurationValue) {
        this.oSDiskConfiguration = oSDiskConfigurationValue;
    }
    
    /**
    * Initializes a new instance of the VMImageInput class.
    *
    */
    public VMImageInput() {
        this.setDataDiskConfigurations(new LazyArrayList<DataDiskConfiguration>());
    }
}
