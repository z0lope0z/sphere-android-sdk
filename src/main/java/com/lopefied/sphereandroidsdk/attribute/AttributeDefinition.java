package com.lopefied.sphereandroidsdk.attribute;

import com.google.gson.annotations.SerializedName;

/**
 * Created by lope on 4/27/15.
 */
public class AttributeDefinition {
    private final AttributeTypeBase attributeType;
    @SerializedName("name")
    private final String name;
    @SerializedName("isRequired")
    private final boolean isRequired;
    @SerializedName("isSearchable")
    private final boolean isSearchable;

    AttributeDefinition(AttributeTypeBase attributeType, String name, boolean isRequired,
                        boolean isSearchable) {
        this.attributeType = attributeType;
        this.name = name;
        this.isRequired = isRequired;
        this.isSearchable = isSearchable;
    }

    /**
     * Describes the type of the attribute.
     *
     * @return the type of the attribute
     */
    public AttributeTypeBase getAttributeType() {
        return attributeType;
    }

    /**
     * The unique name of the attribute used in the API.
     *
     * @return name of the attribute
     */
    public String getName() {
        return name;
    }

    /**
     * Whether the attribute is required to have a value.
     *
     * @return true if required else false
     */
    public boolean getIsRequired() {
        return isRequired;
    }

    /**
     * Whether the attribute's values should generally be enabled in product search.
     * The exact features that are enabled/disabled with this flag depend on the concrete attribute type and are described there.
     *
     * @return true if searchable, false if not
     */
    public boolean getIsSearchable() {
        return isSearchable;
    }

}