package net.krishlogic.agencies.request;

/**
 * Created by kvenkat on 5/11/16.
 */
public class GetRoutesForAgenciesRequest extends BaseRequest {

    private String urlPrefix = "GetRoutesForAgency.aspx";

    private String requestType = "GET";

    private String requestURL;

    public String getRequestType() {
        return requestType;
    }

    public void setRequestType(String requestType) {
        this.requestType = requestType;
    }

    public String getRequestURL() {

        requestURL = getBaseURL() + urlPrefix + "?token=" + getToken()
                            + "&agencyName=" + getAgencyName();

        return requestURL;
    }
}
