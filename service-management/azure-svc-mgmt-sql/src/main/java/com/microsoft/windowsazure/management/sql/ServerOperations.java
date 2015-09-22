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

package com.microsoft.windowsazure.management.sql;

import com.microsoft.windowsazure.core.OperationResponse;
import com.microsoft.windowsazure.exception.ServiceException;
import com.microsoft.windowsazure.management.sql.models.ServerChangeAdministratorPasswordParameters;
import com.microsoft.windowsazure.management.sql.models.ServerCreateParameters;
import com.microsoft.windowsazure.management.sql.models.ServerCreateResponse;
import com.microsoft.windowsazure.management.sql.models.ServerListResponse;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import java.io.IOException;
import java.util.concurrent.Future;

/**
* Contains methods to allow various operations on Azure SQL Database Servers.
*/
public interface ServerOperations {
    /**
    * Changes the administrative password of an existing Azure SQL Database
    * Server for a given subscription.
    *
    * @param serverName Required. The name of the Azure SQL Database Server
    * that will have the administrator password changed.
    * @param parameters Required. The necessary parameters for modifying the
    * adminstrator password for a server.
    * @throws ParserConfigurationException Thrown if there was an error
    * configuring the parser for the response body.
    * @throws SAXException Thrown if there was an error parsing the response
    * body.
    * @throws TransformerException Thrown if there was an error creating the
    * DOM transformer.
    * @throws IOException Signals that an I/O exception of some sort has
    * occurred. This class is the general class of exceptions produced by
    * failed or interrupted I/O operations.
    * @throws ServiceException Thrown if an unexpected response is found.
    * @return A standard service response including an HTTP status code and
    * request ID.
    */
    OperationResponse changeAdministratorPassword(String serverName, ServerChangeAdministratorPasswordParameters parameters) throws ParserConfigurationException, SAXException, TransformerException, IOException, ServiceException;
    
    /**
    * Changes the administrative password of an existing Azure SQL Database
    * Server for a given subscription.
    *
    * @param serverName Required. The name of the Azure SQL Database Server
    * that will have the administrator password changed.
    * @param parameters Required. The necessary parameters for modifying the
    * adminstrator password for a server.
    * @return A standard service response including an HTTP status code and
    * request ID.
    */
    Future<OperationResponse> changeAdministratorPasswordAsync(String serverName, ServerChangeAdministratorPasswordParameters parameters);
    
    /**
    * Provisions a new SQL Database server in a subscription.
    *
    * @param parameters Required. The parameters needed to provision a server.
    * @throws ParserConfigurationException Thrown if there was an error
    * configuring the parser for the response body.
    * @throws SAXException Thrown if there was an error parsing the response
    * body.
    * @throws TransformerException Thrown if there was an error creating the
    * DOM transformer.
    * @throws IOException Signals that an I/O exception of some sort has
    * occurred. This class is the general class of exceptions produced by
    * failed or interrupted I/O operations.
    * @throws ServiceException Thrown if an unexpected response is found.
    * @return The response returned from the Create Server operation.  This
    * contains all the information returned from the service when a server is
    * created.
    */
    ServerCreateResponse create(ServerCreateParameters parameters) throws ParserConfigurationException, SAXException, TransformerException, IOException, ServiceException;
    
    /**
    * Provisions a new SQL Database server in a subscription.
    *
    * @param parameters Required. The parameters needed to provision a server.
    * @return The response returned from the Create Server operation.  This
    * contains all the information returned from the service when a server is
    * created.
    */
    Future<ServerCreateResponse> createAsync(ServerCreateParameters parameters);
    
    /**
    * Deletes the specified Azure SQL Database Server from a subscription.
    *
    * @param serverName Required. The name of the Azure SQL Database Server to
    * be deleted.
    * @throws IOException Signals that an I/O exception of some sort has
    * occurred. This class is the general class of exceptions produced by
    * failed or interrupted I/O operations.
    * @throws ServiceException Thrown if an unexpected response is found.
    * @return A standard service response including an HTTP status code and
    * request ID.
    */
    OperationResponse delete(String serverName) throws IOException, ServiceException;
    
    /**
    * Deletes the specified Azure SQL Database Server from a subscription.
    *
    * @param serverName Required. The name of the Azure SQL Database Server to
    * be deleted.
    * @return A standard service response including an HTTP status code and
    * request ID.
    */
    Future<OperationResponse> deleteAsync(String serverName);
    
    /**
    * Returns all SQL Database Servers that are provisioned for a subscription.
    *
    * @throws IOException Signals that an I/O exception of some sort has
    * occurred. This class is the general class of exceptions produced by
    * failed or interrupted I/O operations.
    * @throws ServiceException Thrown if an unexpected response is found.
    * @throws ParserConfigurationException Thrown if there was a serious
    * configuration error with the document parser.
    * @throws SAXException Thrown if there was an error parsing the XML
    * response.
    * @return The response structure for the Server List operation.  Contains a
    * list of all the servers in a subscription.
    */
    ServerListResponse list() throws IOException, ServiceException, ParserConfigurationException, SAXException;
    
    /**
    * Returns all SQL Database Servers that are provisioned for a subscription.
    *
    * @return The response structure for the Server List operation.  Contains a
    * list of all the servers in a subscription.
    */
    Future<ServerListResponse> listAsync();
}
