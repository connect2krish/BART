package net.krishlogic.agencies.request;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by kvenkat on 5/11/16.
 */
public class GetStationsRequest extends BaseRequest {

    private String urlPrefix = "stn.aspx";

    private String requestType = "GET";

    private String requestURL;

    public String getRequestType() {
        return requestType;
    }

    public void setRequestType(String requestType) {
        this.requestType = requestType;
    }

    public String getRequestURL() {

        requestURL = getBaseURL() + urlPrefix + "?cmd=stns&key=" + getToken();

        return requestURL;
    }

    public URL getURL() throws MalformedURLException {
        return new URL(getRequestURL());
    }
}