package com.lopefied.sphereandroidsdk.auth;

import com.google.common.base.Optional;
import com.google.gson.annotations.SerializedName;

/**
 * Created by lope on 4/27/15.
 */
public class Tokens {
    @SerializedName("access_token")
    String accessToken;
    @SerializedName("token_type")
    String tokenType;
    @SerializedName("scope")
    String scope;
    @SerializedName("expires_in")
    Optional<Long> expiresIn;
    @SerializedName("refresh_token")
    String refreshToken;

    public Tokens() {
    }

    public Tokens(String accessToken, String tokenType, String scope, Optional<Long> expiresIn, String refreshToken) {
        this.accessToken = accessToken;
        this.tokenType = tokenType;
        this.scope = scope;
        this.expiresIn = expiresIn;
        this.refreshToken = refreshToken;
    }

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public String getRefreshToken() {
        return refreshToken;
    }

    public void setRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
    }

    public Optional<Long> getExpiresIn() {
        return expiresIn;
    }

    public void setExpiresIn(Optional<Long> expiresIn) {
        this.expiresIn = expiresIn;
    }

    public String getTokenType() {
        return tokenType;
    }

    public void setTokenType(String tokenType) {
        this.tokenType = tokenType;
    }

    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }
}