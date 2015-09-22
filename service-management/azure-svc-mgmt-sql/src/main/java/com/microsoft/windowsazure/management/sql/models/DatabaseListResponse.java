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

package com.microsoft.windowsazure.management.sql.models;

import com.microsoft.windowsazure.core.LazyArrayList;
import com.microsoft.windowsazure.core.OperationResponse;

import java.util.ArrayList;
import java.util.Iterator;

/**
* Contains a collection of databases for a given Azure SQL Database Server.
*/
public class DatabaseListResponse extends OperationResponse implements Iterable<Database> {
    private ArrayList<Database> databases;
    
    /**
    * Optional. Gets or sets the collection of databases that are hosted on the
    * Azure SQL Database Server.
    * @return The Databases value.
    */
    public ArrayList<Database> getDatabases() {
        return this.databases;
    }
    
    /**
    * Optional. Gets or sets the collection of databases that are hosted on the
    * Azure SQL Database Server.
    * @param databasesValue The Databases value.
    */
    public void setDatabases(final ArrayList<Database> databasesValue) {
        this.databases = databasesValue;
    }
    
    /**
    * Initializes a new instance of the DatabaseListResponse class.
    *
    */
    public DatabaseListResponse() {
        super();
        this.setDatabases(new LazyArrayList<Database>());
    }
    
    /**
    * Gets the sequence of Databases.
    *
    */
    public Iterator<Database> iterator() {
        return this.getDatabases().iterator();
    }
}
