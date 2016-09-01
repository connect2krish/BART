package net.krishlogic.agencies.request;

/**
 * Created by kvenkat on 5/12/16.
 */

public class GetRealTimeEstimateRequest extends BaseRequest {

    private String urlPrefix = "etd.aspx";

    private String requestType = "GET";

    private String requestURL;

    private String originAbbr;

    public String getRequestType() {
        return requestType;
    }

    public void setRequestType(String requestType) {
        this.requestType = requestType;
    }

    public String getOriginAbbr() {
        return originAbbr;
    }

    public void setOriginAbbr(String originAbbr) {
        this.originAbbr = originAbbr;
    }

    public String getRequestURL() {

        requestURL = getBaseURL() + urlPrefix + "?cmd=etd&orig=" + originAbbr + "&key=" + getToken();

        return requestURL;
    }
}
