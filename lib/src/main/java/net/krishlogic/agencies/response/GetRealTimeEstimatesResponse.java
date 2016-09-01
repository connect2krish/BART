package net.krishlogic.agencies.response;

/**
 * Created by kvenkat on 5/18/16.
 */

import net.krishlogic.agencies.request.GetRealTimeEstimateRequest;
import net.krishlogic.agencies.response.model.BaseResponse;
import net.krishlogic.agencies.response.model.RealtimeEstimateModel;

import org.simpleframework.xml.Serializer;
import org.simpleframework.xml.core.Persister;

import java.io.Reader;
import java.io.StringReader;

import okhttp3.Request;
import okhttp3.Response;

public class GetRealTimeEstimatesResponse extends BaseResponse {

    public RealtimeEstimateModel getResponse(GetRealTimeEstimateRequest realTimeEstimateRequest) throws Exception {

        Request request = new Request.Builder()
                .url(realTimeEstimateRequest.getRequestURL())
                .build();

        Response response = client.newCall(request).execute();

        Serializer serializer = new Persister();
        Reader reader = new StringReader(response.body().string());

        RealtimeEstimateModel realtimeEstimateModel = serializer.read(RealtimeEstimateModel.class, reader, false);

        return realtimeEstimateModel;
    }
}

