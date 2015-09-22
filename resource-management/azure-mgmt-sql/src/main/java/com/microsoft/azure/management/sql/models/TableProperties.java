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

import java.util.ArrayList;

/**
* Represents the properties of an Azure SQL Database table.
*/
public class TableProperties {
    private ArrayList<Column> columns;
    
    /**
    * Optional. Gets the columns from this table.
    * @return The Columns value.
    */
    public ArrayList<Column> getColumns() {
        return this.columns;
    }
    
    /**
    * Optional. Gets the columns from this table.
    * @param columnsValue The Columns value.
    */
    public void setColumns(final ArrayList<Column> columnsValue) {
        this.columns = columnsValue;
    }
    
    private ArrayList<RecommendedIndex> recommendedIndexes;
    
    /**
    * Optional. Gets the recommended indices for this table.
    * @return The RecommendedIndexes value.
    */
    public ArrayList<RecommendedIndex> getRecommendedIndexes() {
        return this.recommendedIndexes;
    }
    
    /**
    * Optional. Gets the recommended indices for this table.
    * @param recommendedIndexesValue The RecommendedIndexes value.
    */
    public void setRecommendedIndexes(final ArrayList<RecommendedIndex> recommendedIndexesValue) {
        this.recommendedIndexes = recommendedIndexesValue;
    }
    
    private String tableType;
    
    /**
    * Optional. Gets the type of Azure SQL Database table.
    * @return The TableType value.
    */
    public String getTableType() {
        return this.tableType;
    }
    
    /**
    * Optional. Gets the type of Azure SQL Database table.
    * @param tableTypeValue The TableType value.
    */
    public void setTableType(final String tableTypeValue) {
        this.tableType = tableTypeValue;
    }
    
    /**
    * Initializes a new instance of the TableProperties class.
    *
    */
    public TableProperties() {
        this.setColumns(new LazyArrayList<Column>());
        this.setRecommendedIndexes(new LazyArrayList<RecommendedIndex>());
    }
}
