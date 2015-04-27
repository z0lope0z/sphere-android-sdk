package com.lopefied.sphereandroidsdk.auth;

import android.util.Base64;

import rx.Observable;
import rx.functions.Func1;

/**
 * Created by lope on 4/27/15.
 */
public class AuthServiceImpl implements AuthService {

    AuthAPIService authAPIService;

    @Override
    public Observable<String> getAccessTokenObs(SphereAuthConfig sphereAuthConfig) {
        return authAPIService
                .getAccessTokensObs(
                        buildGrantType(),
                        buildScope(sphereAuthConfig.getProjectKey()),
                        buildBasicAuth(sphereAuthConfig.getClientId(), sphereAuthConfig.getClientSecret())
                )
                .map(new Func1<Tokens, String>() {
                    @Override
                    public String call(Tokens tokens) {
                        return tokens.getAccessToken();
                    }
                });
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