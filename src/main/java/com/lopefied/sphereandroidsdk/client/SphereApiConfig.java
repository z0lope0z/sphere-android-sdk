package com.lopefied.sphereandroidsdk.client;

import com.lopefied.sphereandroidsdk.auth.SphereAuthConfig;
import com.lopefied.sphereandroidsdk.auth.Tokens;

/**
 * Contains the configuration to fetch access keys for SPHERE.IO.
 */
public class SphereApiConfig {
    private String projectKey;
    private String apiUrl;
    private SphereAuthConfig authConfig;
    private Tokens tokens;

    private SphereApiConfig(Builder builder) {
        this.projectKey = builder.projectKey;
        this.apiUrl = builder.apiUrl;
        this.authConfig = builder.authConfig;
        this.tokens = builder.tokens;
    }

    public String getProjectKey() {
        return projectKey;
    }

    public String getApiUrl() {
        return apiUrl;
    }

    public SphereAuthConfig getAuthConfig() {
        return authConfig;
    }

    public Tokens getTokens() {
        return tokens;
    }

    public static class Builder {
        private String apiUrl;
        private String projectKey;
        private SphereAuthConfig authConfig;
        private Tokens tokens;

        public Builder apiUrl(String apiUrl) {
            this.apiUrl = apiUrl;
            return this;
        }

        public Builder projectKey(String projectKey) {
            this.projectKey = projectKey;
            return this;
        }

        public Builder authConfig(SphereAuthConfig authConfig) {
            this.authConfig = authConfig;
            return this;
        }

        public Builder tokens(Tokens tokens) {
            this.tokens = tokens;
            return this;
        }

        public SphereApiConfig build() {
            return new SphereApiConfig(this);
        }
    }
}