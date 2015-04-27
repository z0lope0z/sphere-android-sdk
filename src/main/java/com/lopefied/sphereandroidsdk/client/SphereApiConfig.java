package com.lopefied.sphereandroidsdk.client;

/**
 * Contains the configuration to fetch access keys for SPHERE.IO.
 */
public class SphereApiConfig {
    private String projectKey;
    private String apiUrl;

    private SphereApiConfig(Builder builder) {
        this.projectKey = builder.projectKey;
        this.apiUrl = builder.apiUrl;
    }

    public String getProjectKey() {
        return projectKey;
    }

    public String getApiUrl() {
        return apiUrl;
    }

    public static class Builder {
        private String apiUrl;
        private String projectKey;

        public Builder apiUrl(String apiUrl) {
            this.apiUrl = apiUrl;
            return this;
        }

        public Builder projectKey(String projectKey) {
            this.projectKey = projectKey;
            return this;
        }

        public SphereApiConfig build() {
            return new SphereApiConfig(this);
        }
    }
}