package com.lopefied.sphereandroidsdk.auth;

import rx.Observable;

/**
 * Created by lope on 4/27/15.
 */
public interface AuthService {
    public static final String GRANT_TYPE_CLIENT_CREDENTIALS = "client_credentials";
    public static final String SCOPE_MANAGE_PROJECT = "manage_project";

    public Observable<String> getAccessTokenObs(SphereAuthConfig sphereAuthConfig);
}