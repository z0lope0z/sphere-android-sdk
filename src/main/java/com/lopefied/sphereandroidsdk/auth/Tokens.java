package com.lopefied.sphereandroidsdk.auth;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by lope on 4/27/15.
 */
public class Tokens {
    @Expose
    @SerializedName("access_token")
    String accessToken;
    @Expose
    @SerializedName("token_type")
    String tokenType;
    @Expose
    @SerializedName("scope")
    String scope;
    @Expose
    @SerializedName("expires_in")
    Long expiresIn;

    public Tokens() {
    }

    public Tokens(String accessToken, String tokenType, String scope, Long expiresIn) {
        this.accessToken = accessToken;
        this.tokenType = tokenType;
        this.scope = scope;
        this.expiresIn = expiresIn;
    }

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public Long getExpiresIn() {
        return expiresIn;
    }

    public void setExpiresIn(Long expiresIn) {
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