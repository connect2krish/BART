package net.krishlogic.agencies.response.model;

import okhttp3.Response;

/**
 * Created by kvenkat on 8/19/16.
 */

public class BaseModel {

    private Response response;

    public Response getResponse() {
        return response;
    }

    public void setResponse(Response response) {
        this.response = response;
    }
}
