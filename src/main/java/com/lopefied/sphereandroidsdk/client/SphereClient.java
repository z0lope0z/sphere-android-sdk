package com.lopefied.sphereandroidsdk.client;

import retrofit.RestAdapter;

/**
 * Created by lope on 4/27/15.
 */
public class SphereClient {
    SphereApiConfig sphereApiConfig;

    public SphereClient(SphereApiConfig sphereApiConfig) {
        this.sphereApiConfig = sphereApiConfig;
    }

    public SphereApiConfig getSphereApiConfig() {
        return sphereApiConfig;
    }

    public void setSphereApiConfig(SphereApiConfig sphereApiConfig) {
        this.sphereApiConfig = sphereApiConfig;
    }

    protected RestAdapter.Builder createBuilder() {
        return new RestAdapter.Builder().setEndpoint(sphereApiConfig.getApiUrl());
    }

    public RestAdapter buildRestAdapter() {
        return createBuilder().build();
    }
}
