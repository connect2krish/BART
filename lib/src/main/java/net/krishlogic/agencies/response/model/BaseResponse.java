package net.krishlogic.agencies.response.model;

import okhttp3.OkHttpClient;

/**
 * Created by kvenkat on 5/11/16.
 */
public class BaseResponse<T> {

    public static OkHttpClient client;

    static {
        client = new OkHttpClient();
    }
}
