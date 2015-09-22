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

import com.microsoft.windowsazure.core.ServiceOperations;
import com.microsoft.windowsazure.core.utils.BOMInputStream;
import com.microsoft.windowsazure.core.utils.XmlUtility;
import com.microsoft.windowsazure.exception.ServiceException;
import com.microsoft.windowsazure.management.sql.models.RestoreDatabaseOperation;
import com.microsoft.windowsazure.management.sql.models.RestoreDatabaseOperationCreateParameters;
import com.microsoft.windowsazure.management.sql.models.RestoreDatabaseOperationCreateResponse;
import com.microsoft.windowsazure.tracing.CloudTracing;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.xml.sax.SAXException;

import javax.xml.bind.DatatypeConverter;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringWriter;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.HashMap;
import java.util.TimeZone;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;

/**
* Contains the operation to create restore requests for Azure SQL Databases.
*/
public class RestoreDatabaseOperationsImpl implements ServiceOperations<SqlManagementClientImpl>, RestoreDatabaseOperations {
    /**
    * Initializes a new instance of the RestoreDatabaseOperationsImpl class.
    *
    * @param client Reference to the service client.
    */
    RestoreDatabaseOperationsImpl(SqlManagementClientImpl client) {
        this.client = client;
    }
    
    private SqlManagementClientImpl client;
    
    /**
    * Gets a reference to the
    * microsoft.windowsazure.management.sql.SqlManagementClientImpl.
    * @return The Client value.
    */
    public SqlManagementClientImpl getClient() {
        return this.client;
    }
    
    /**
    * Issues a restore request for an Azure SQL Database.
    *
    * @param sourceServerName Required. The name of the Azure SQL Database
    * Server where the source database is, or was, hosted.
    * @param parameters Required. Additional parameters for the Create Restore
    * Database Operation request.
    * @return Contains the response to the Create Restore Database Operation
    * request.
    */
    @Override
    public Future<RestoreDatabaseOperationCreateResponse> createAsync(final String sourceServerName, final RestoreDatabaseOperationCreateParameters parameters) {
        return this.getClient().getExecutorService().submit(new Callable<RestoreDatabaseOperationCreateResponse>() { 
            @Override
            public RestoreDatabaseOperationCreateResponse call() throws Exception {
                return create(sourceServerName, parameters);
            }
         });
    }
    
    /**
    * Issues a restore request for an Azure SQL Database.
    *
    * @param sourceServerName Required. The name of the Azure SQL Database
    * Server where the source database is, or was, hosted.
    * @param parameters Required. Additional parameters for the Create Restore
    * Database Operation request.
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
    * @return Contains the response to the Create Restore Database Operation
    * request.
    */
    @Override
    public RestoreDatabaseOperationCreateResponse create(String sourceServerName, RestoreDatabaseOperationCreateParameters parameters) throws ParserConfigurationException, SAXException, TransformerException, IOException, ServiceException {
        // Validate
        if (sourceServerName == null) {
            throw new NullPointerException("sourceServerName");
        }
        if (parameters == null) {
            throw new NullPointerException("parameters");
        }
        if (parameters.getSourceDatabaseName() == null) {
            throw new NullPointerException("parameters.SourceDatabaseName");
        }
        if (parameters.getTargetDatabaseName() == null) {
            throw new NullPointerException("parameters.TargetDatabaseName");
        }
        
        // Tracing
        boolean shouldTrace = CloudTracing.getIsEnabled();
        String invocationId = null;
        if (shouldTrace) {
            invocationId = Long.toString(CloudTracing.getNextInvocationId());
            HashMap<String, Object> tracingParameters = new HashMap<String, Object>();
            tracingParameters.put("sourceServerName", sourceServerName);
            tracingParameters.put("parameters", parameters);
            CloudTracing.enter(invocationId, this, "createAsync", tracingParameters);
        }
        
        // Construct URL
        String url = "";
        url = url + "/";
        if (this.getClient().getCredentials().getSubscriptionId() != null) {
            url = url + URLEncoder.encode(this.getClient().getCredentials().getSubscriptionId(), "UTF-8");
        }
        url = url + "/services/sqlservers/servers/";
        url = url + URLEncoder.encode(sourceServerName, "UTF-8");
        url = url + "/restoredatabaseoperations";
        String baseUrl = this.getClient().getBaseUri().toString();
        // Trim '/' character from the end of baseUrl and beginning of url.
        if (baseUrl.charAt(baseUrl.length() - 1) == '/') {
            baseUrl = baseUrl.substring(0, (baseUrl.length() - 1) + 0);
        }
        if (url.charAt(0) == '/') {
            url = url.substring(1);
        }
        url = baseUrl + "/" + url;
        url = url.replace(" ", "%20");
        
        // Create HTTP transport objects
        HttpPost httpRequest = new HttpPost(url);
        
        // Set Headers
        httpRequest.setHeader("Content-Type", "application/xml");
        httpRequest.setHeader("x-ms-version", "2012-03-01");
        
        // Serialize Request
        String requestContent = null;
        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
        Document requestDoc = documentBuilder.newDocument();
        
        Element serviceResourceElement = requestDoc.createElementNS("http://schemas.microsoft.com/windowsazure", "ServiceResource");
        requestDoc.appendChild(serviceResourceElement);
        
        Element sourceDatabaseNameElement = requestDoc.createElementNS("http://schemas.microsoft.com/windowsazure", "SourceDatabaseName");
        sourceDatabaseNameElement.appendChild(requestDoc.createTextNode(parameters.getSourceDatabaseName()));
        serviceResourceElement.appendChild(sourceDatabaseNameElement);
        
        if (parameters.getSourceDatabaseDeletionDate() != null) {
            Element sourceDatabaseDeletionDateElement = requestDoc.createElementNS("http://schemas.microsoft.com/windowsazure", "SourceDatabaseDeletionDate");
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSSSSS'Z'");
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
            sourceDatabaseDeletionDateElement.appendChild(requestDoc.createTextNode(simpleDateFormat.format(parameters.getSourceDatabaseDeletionDate().getTime())));
            serviceResourceElement.appendChild(sourceDatabaseDeletionDateElement);
        }
        
        if (parameters.getTargetServerName() != null) {
            Element targetServerNameElement = requestDoc.createElementNS("http://schemas.microsoft.com/windowsazure", "TargetServerName");
            targetServerNameElement.appendChild(requestDoc.createTextNode(parameters.getTargetServerName()));
            serviceResourceElement.appendChild(targetServerNameElement);
        }
        
        Element targetDatabaseNameElement = requestDoc.createElementNS("http://schemas.microsoft.com/windowsazure", "TargetDatabaseName");
        targetDatabaseNameElement.appendChild(requestDoc.createTextNode(parameters.getTargetDatabaseName()));
        serviceResourceElement.appendChild(targetDatabaseNameElement);
        
        if (parameters.getPointInTime() != null) {
            Element targetUtcPointInTimeElement = requestDoc.createElementNS("http://schemas.microsoft.com/windowsazure", "TargetUtcPointInTime");
            SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSSSSS'Z'");
            simpleDateFormat2.setTimeZone(TimeZone.getTimeZone("UTC"));
            targetUtcPointInTimeElement.appendChild(requestDoc.createTextNode(simpleDateFormat2.format(parameters.getPointInTime().getTime())));
            serviceResourceElement.appendChild(targetUtcPointInTimeElement);
        }
        
        DOMSource domSource = new DOMSource(requestDoc);
        StringWriter stringWriter = new StringWriter();
        StreamResult streamResult = new StreamResult(stringWriter);
        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transformer = transformerFactory.newTransformer();
        transformer.transform(domSource, streamResult);
        requestContent = stringWriter.toString();
        StringEntity entity = new StringEntity(requestContent);
        httpRequest.setEntity(entity);
        httpRequest.setHeader("Content-Type", "application/xml");
        
        // Send Request
        HttpResponse httpResponse = null;
        try {
            if (shouldTrace) {
                CloudTracing.sendRequest(invocationId, httpRequest);
            }
            httpResponse = this.getClient().getHttpClient().execute(httpRequest);
            if (shouldTrace) {
                CloudTracing.receiveResponse(invocationId, httpResponse);
            }
            int statusCode = httpResponse.getStatusLine().getStatusCode();
            if (statusCode != HttpStatus.SC_CREATED) {
                ServiceException ex = ServiceException.createFromXml(httpRequest, requestContent, httpResponse, httpResponse.getEntity());
                if (shouldTrace) {
                    CloudTracing.error(invocationId, ex);
                }
                throw ex;
            }
            
            // Create Result
            RestoreDatabaseOperationCreateResponse result = null;
            // Deserialize Response
            if (statusCode == HttpStatus.SC_CREATED) {
                InputStream responseContent = httpResponse.getEntity().getContent();
                result = new RestoreDatabaseOperationCreateResponse();
                DocumentBuilderFactory documentBuilderFactory2 = DocumentBuilderFactory.newInstance();
                documentBuilderFactory2.setNamespaceAware(true);
                DocumentBuilder documentBuilder2 = documentBuilderFactory2.newDocumentBuilder();
                Document responseDoc = documentBuilder2.parse(new BOMInputStream(responseContent));
                
                Element serviceResourceElement2 = XmlUtility.getElementByTagNameNS(responseDoc, "http://schemas.microsoft.com/windowsazure", "ServiceResource");
                if (serviceResourceElement2 != null) {
                    RestoreDatabaseOperation serviceResourceInstance = new RestoreDatabaseOperation();
                    result.setOperation(serviceResourceInstance);
                    
                    Element requestIDElement = XmlUtility.getElementByTagNameNS(serviceResourceElement2, "http://schemas.microsoft.com/windowsazure", "RequestID");
                    if (requestIDElement != null) {
                        String requestIDInstance;
                        requestIDInstance = requestIDElement.getTextContent();
                        serviceResourceInstance.setId(requestIDInstance);
                    }
                    
                    Element sourceDatabaseNameElement2 = XmlUtility.getElementByTagNameNS(serviceResourceElement2, "http://schemas.microsoft.com/windowsazure", "SourceDatabaseName");
                    if (sourceDatabaseNameElement2 != null) {
                        String sourceDatabaseNameInstance;
                        sourceDatabaseNameInstance = sourceDatabaseNameElement2.getTextContent();
                        serviceResourceInstance.setSourceDatabaseName(sourceDatabaseNameInstance);
                    }
                    
                    Element sourceDatabaseDeletionDateElement2 = XmlUtility.getElementByTagNameNS(serviceResourceElement2, "http://schemas.microsoft.com/windowsazure", "SourceDatabaseDeletionDate");
                    if (sourceDatabaseDeletionDateElement2 != null && sourceDatabaseDeletionDateElement2.getTextContent() != null && !sourceDatabaseDeletionDateElement2.getTextContent().isEmpty()) {
                        Calendar sourceDatabaseDeletionDateInstance;
                        sourceDatabaseDeletionDateInstance = DatatypeConverter.parseDateTime(sourceDatabaseDeletionDateElement2.getTextContent());
                        serviceResourceInstance.setSourceDatabaseDeletionDate(sourceDatabaseDeletionDateInstance);
                    }
                    
                    Element targetServerNameElement2 = XmlUtility.getElementByTagNameNS(serviceResourceElement2, "http://schemas.microsoft.com/windowsazure", "TargetServerName");
                    if (targetServerNameElement2 != null) {
                        String targetServerNameInstance;
                        targetServerNameInstance = targetServerNameElement2.getTextContent();
                        serviceResourceInstance.setTargetServerName(targetServerNameInstance);
                    }
                    
                    Element targetDatabaseNameElement2 = XmlUtility.getElementByTagNameNS(serviceResourceElement2, "http://schemas.microsoft.com/windowsazure", "TargetDatabaseName");
                    if (targetDatabaseNameElement2 != null) {
                        String targetDatabaseNameInstance;
                        targetDatabaseNameInstance = targetDatabaseNameElement2.getTextContent();
                        serviceResourceInstance.setTargetDatabaseName(targetDatabaseNameInstance);
                    }
                    
                    Element targetUtcPointInTimeElement2 = XmlUtility.getElementByTagNameNS(serviceResourceElement2, "http://schemas.microsoft.com/windowsazure", "TargetUtcPointInTime");
                    if (targetUtcPointInTimeElement2 != null) {
                        Calendar targetUtcPointInTimeInstance;
                        targetUtcPointInTimeInstance = DatatypeConverter.parseDateTime(targetUtcPointInTimeElement2.getTextContent());
                        serviceResourceInstance.setPointInTime(targetUtcPointInTimeInstance);
                    }
                }
                
            }
            result.setStatusCode(statusCode);
            if (httpResponse.getHeaders("x-ms-request-id").length > 0) {
                result.setRequestId(httpResponse.getFirstHeader("x-ms-request-id").getValue());
            }
            
            if (shouldTrace) {
                CloudTracing.exit(invocationId, result);
            }
            return result;
        } finally {
            if (httpResponse != null && httpResponse.getEntity() != null) {
                httpResponse.getEntity().getContent().close();
            }
        }
    }
}
