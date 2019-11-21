/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * abc
 */

package com.microsoft.azure.management.cognitiveservices.v2017_04_18.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.cognitiveservices.v2017_04_18.CheckSkuAvailabilitys;
import rx.functions.Func1;
import rx.Observable;
import com.microsoft.azure.management.cognitiveservices.v2017_04_18.CheckSkuAvailabilityResultList;
import java.util.List;
import com.microsoft.azure.management.cognitiveservices.v2017_04_18.SkuName;
import com.microsoft.azure.management.cognitiveservices.v2017_04_18.Kind;

class CheckSkuAvailabilitysImpl extends WrapperImpl<CheckSkuAvailabilitysInner> implements CheckSkuAvailabilitys {
    private final CognitiveServicesManager manager;

    CheckSkuAvailabilitysImpl(CognitiveServicesManager manager) {
        super(manager.inner().checkSkuAvailabilitys());
        this.manager = manager;
    }

    public CognitiveServicesManager manager() {
        return this.manager;
    }

    @Override
    public Observable<CheckSkuAvailabilityResultList> listAsync(String location, List<SkuName> skus, Kind kind, String type) {
        CheckSkuAvailabilitysInner client = this.inner();
        return client.listAsync(location, skus, kind, type)
        .map(new Func1<CheckSkuAvailabilityResultListInner, CheckSkuAvailabilityResultList>() {
            @Override
            public CheckSkuAvailabilityResultList call(CheckSkuAvailabilityResultListInner inner) {
                return new CheckSkuAvailabilityResultListImpl(inner, manager());
            }
        });
    }

}