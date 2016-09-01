package net.krishlogic.agencies.response;

import net.krishlogic.agencies.request.GetStationsRequest;
import net.krishlogic.agencies.response.model.BaseResponse;
import net.krishlogic.agencies.response.model.StationsResponseModel;

import org.simpleframework.xml.Serializer;
import org.simpleframework.xml.core.Persister;

import java.io.Reader;
import java.io.StringReader;

import okhttp3.Request;
import okhttp3.Response;

/**
 * Created by kvenkat on 8/18/16.
 */

public class GetStationsResponse extends BaseResponse {

    public StationsResponseModel getResponse(GetStationsRequest stationsRequest) throws Exception {

        Request request = new Request.Builder()
                .url(stationsRequest.getURL())
                .build();

        Response response = client.newCall(request).execute();

        Serializer serializer = new Persister();
        Reader reader = new StringReader(response.body().string());

        StationsResponseModel stationsResponseModel = serializer.read(StationsResponseModel.class, reader, false);

        return stationsResponseModel;
    }
}