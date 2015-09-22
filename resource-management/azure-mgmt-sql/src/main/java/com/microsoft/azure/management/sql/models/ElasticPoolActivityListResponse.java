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

package com.microsoft.azure.management.sql.models;

import com.microsoft.windowsazure.core.LazyArrayList;
import com.microsoft.windowsazure.core.OperationResponse;

import java.util.ArrayList;
import java.util.Iterator;

/**
* Represents the response to a List Azure Sql Elastic Pool Activity request.
*/
public class ElasticPoolActivityListResponse extends OperationResponse implements Iterable<ElasticPoolActivity> {
    private ArrayList<ElasticPoolActivity> elasticPoolActivities;
    
    /**
    * Optional. Gets or sets the list of Azure Sql Elastic Pool Activities.
    * @return The ElasticPoolActivities value.
    */
    public ArrayList<ElasticPoolActivity> getElasticPoolActivities() {
        return this.elasticPoolActivities;
    }
    
    /**
    * Optional. Gets or sets the list of Azure Sql Elastic Pool Activities.
    * @param elasticPoolActivitiesValue The ElasticPoolActivities value.
    */
    public void setElasticPoolActivities(final ArrayList<ElasticPoolActivity> elasticPoolActivitiesValue) {
        this.elasticPoolActivities = elasticPoolActivitiesValue;
    }
    
    /**
    * Initializes a new instance of the ElasticPoolActivityListResponse class.
    *
    */
    public ElasticPoolActivityListResponse() {
        super();
        this.setElasticPoolActivities(new LazyArrayList<ElasticPoolActivity>());
    }
    
    /**
    * Gets the sequence of ElasticPoolActivities.
    *
    */
    public Iterator<ElasticPoolActivity> iterator() {
        return this.getElasticPoolActivities().iterator();
    }
}
