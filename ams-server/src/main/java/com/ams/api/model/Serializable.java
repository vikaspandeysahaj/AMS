package com.ams.api.model;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

/**
 * Created by vikas on 24/12/15.
 */
public abstract class Serializable<T> {
    protected static final ObjectMapper mapper = new ObjectMapper();;

    public Serializable() {
    }

    public abstract String serialize() throws IOException;
    public abstract T deserialize(String json) throws IOException;
}
