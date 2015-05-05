package com.lopefied.sphereandroidsdk.auth;

/**
 * Contains the configuration to fetch access keys for SPHERE.IO.
 */
public class SphereAuthConfig {
    private String projectKey;
    private String clientId;
    private String clientSecret;
    private String authUrl;

    private SphereAuthConfig(Builder builder) {
        this.projectKey = builder.projectKey;
        this.clientId = builder.clientId;
        this.clientSecret = builder.clientSecret;
        this.authUrl = builder.authUrl;
    }

    public String getProjectKey() {
        return projectKey;
    }

    public String getClientId() {
        return clientId;
    }

    public String getClientSecret() {
        return clientSecret;
    }

    public String getAuthUrl() {
        return authUrl;
    }

    public static class Builder {
        private String authUrl;
        private String clientId;
        private String clientSecret;
        private String projectKey;

        public Builder authUrl(String authUrl) {
            this.authUrl = authUrl;
            return this;
        }

        public Builder clientId(String clientId) {
            this.clientId = clientId;
            return this;
        }

        public Builder clientSecret(String clientSecret) {
            this.clientSecret = clientSecret;
            return this;
        }

        public Builder projectKey(String projectKey) {
            this.projectKey = projectKey;
            return this;
        }

        public SphereAuthConfig build() {
            return new SphereAuthConfig(this);
        }
    }
}