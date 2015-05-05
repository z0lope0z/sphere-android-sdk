package com.lopefied.sphereandroidsdk.auth;

import android.util.Base64;

import com.squareup.okhttp.OkHttpClient;

import retrofit.RestAdapter;
import retrofit.client.Client;
import retrofit.client.OkClient;
import rx.Observable;

/**
 * Created by lope on 4/27/15.
 */
public class AuthServiceImpl implements AuthService {

    SphereAuthConfig sphereAuthConfig;
    AuthAPIService authAPIService;

    public AuthServiceImpl(SphereAuthConfig sphereAuthConfig) {
        this(sphereAuthConfig, new OkClient(new OkHttpClient()));
    }

    public AuthServiceImpl(SphereAuthConfig sphereAuthConfig, Client client) {
        this.sphereAuthConfig = sphereAuthConfig;
        RestAdapter restAdapter = new RestAdapter.Builder()
                .setClient(client)
                .setEndpoint(sphereAuthConfig.getAuthUrl()).build();
        this.authAPIService = restAdapter.create(AuthAPIService.class);
    }

    @Override
    public Observable<Tokens> getAccessTokenObs() {
        return authAPIService
                .getAccessTokensObs(
                        buildGrantType(),
                        buildScope(sphereAuthConfig.getProjectKey()),
                        buildBasicAuth(sphereAuthConfig.getClientId(), sphereAuthConfig.getClientSecret())
                );
    }

    private String buildGrantType() {
        return GRANT_TYPE_CLIENT_CREDENTIALS;
    }

    private String buildScope(String projectKey) {
        return SCOPE_MANAGE_PROJECT + ":" + projectKey;
    }

    private String buildBasicAuth(String clientID, String clientSecret) {
        return "Basic " + Base64.encodeToString((clientID + ":" + clientSecret).getBytes(), Base64.NO_WRAP);
    }
}