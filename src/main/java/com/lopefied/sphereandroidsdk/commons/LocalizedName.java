package com.lopefied.sphereandroidsdk.commons;

/**
 * Created by lope on 4/28/15.
 */
public class LocalizedName {
    String locale;
    String name;

    public LocalizedName(String locale, String name) {
        this.locale = locale;
        this.name = name;
    }

    public String getLocale() {
        return locale;
    }

    public void setLocale(String locale) {
        this.locale = locale;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
