package com.lopefied.sphereandroidsdk.commons;

/**
 * Created by lope on 4/28/15.
 */
public class LocalizedSlug {
    String locale;
    String slug;

    public LocalizedSlug() {
    }

    public LocalizedSlug(String locale, String slug) {
        this.locale = locale;
        this.slug = slug;
    }

    public String getLocale() {
        return locale;
    }

    public void setLocale(String locale) {
        this.locale = locale;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }
}
