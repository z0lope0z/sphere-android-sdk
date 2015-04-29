package com.lopefied.sphereandroidsdk.client;

import com.google.gson.Gson;
import com.squareup.okhttp.OkHttpClient;

import retrofit.RequestInterceptor;
import retrofit.RestAdapter;
import retrofit.client.Client;
import retrofit.client.OkClient;
import retrofit.converter.GsonConverter;

/**
 * Created by lope on 4/27/15.
 */
public class SphereClient {
    SphereApiConfig sphereApiConfig;
    Client client;

    public SphereClient(SphereApiConfig sphereApiConfig) {
        this(sphereApiConfig, new OkClient(new OkHttpClient()));
    }

    public SphereClient(SphereApiConfig sphereApiConfig, Client client) {
        this.sphereApiConfig = sphereApiConfig;
        this.client = client;
    }

    public SphereApiConfig getSphereApiConfig() {
        return sphereApiConfig;
    }

    public void setSphereApiConfig(SphereApiConfig sphereApiConfig) {
        this.sphereApiConfig = sphereApiConfig;
    }

    protected RestAdapter.Builder createBuilder() {
        Gson gson = new Gson();
        return new RestAdapter.Builder()
                .setClient(client)
                .setConverter(new GsonConverter(gson))
                .setRequestInterceptor(new RequestInterceptor() {
                    @Override
                    public void intercept(RequestFacade request) {
                        request.addHeader("Authorization", "Bearer " + sphereApiConfig.getTokens().getAccessToken());
                    }
                })
                .setEndpoint(buildApiEndpoint());
    }

    public String buildApiEndpoint() {
        return sphereApiConfig.getApiUrl() + "/" + sphereApiConfig.getProjectKey();
    }

    public RestAdapter buildRestAdapter() {
        return createBuilder().build();
    }
}
