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

package com.microsoft.windowsazure.management.websites.models;

/**
* The runtime availability of a website.
*/
public enum WebSiteRuntimeAvailabilityState {
    /**
    * The web site is running correctly.
    */
    Normal,
    
    /**
    * The web site is running temporarily in a degraded mode (typically with
    * less memory and a shared instance).
    */
    Degraded,
    
    /**
    * Due to an unexpected issue, the site has been excluded from provisioning.
    * This typically occurs only for free sites.
    */
    NotAvailable,
}
