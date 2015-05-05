package com.lopefied.sphereandroidsdk.attribute;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;

/**
 * Created by lope on 4/27/15.
 */
public class AttributeTypeAdapter extends TypeAdapter<AttributeType> {

    @Override
    public void write(final JsonWriter out, final AttributeType attributeType) throws IOException {
        out.beginObject();
        out.name("name").value(attributeType.getType());
        out.endObject();
    }

    @Override
    public AttributeType read(final JsonReader in) throws IOException {
        // TODO
//        final AttributeTypeBase attributeType = new AttributeTypeBase();
//        in.beginObject();
//        while (in.hasNext()) {
//            switch (in.nextName()) {
//                case "isbn":
//                    attributeType.setIsbn(in.nextString());
//                    break;
//                case "title":
//                    attributeType.setTitle(in.nextString());
//                    break;
//                case "authors":
//                    attributeType.setAuthors(in.nextString().split(";"));
//                    break;
//            }
//        }
//        in.endObject();
//        return attributeType;
        return null;
    }

}
