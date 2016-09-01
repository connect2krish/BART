package net.krishlogic.agencies.request;

/**
 * Created by kvenkat on 5/12/16.
 */

/**
 *
 * http://services.my511.org/Transit2.0/GetNextDeparturesByStopName.aspx?token=123-456-789&agencyName&stopName
 */
public class GetNextDeparturesByStopName extends BaseRequest {

    private String urlPrefix = "GetNextDeparturesByStopName.aspx";

    private String requestType = "GET";

    private String requestURL;

    private String stopName;

    public String getStopName() {
        return stopName;
    }

    public void setStopName(String stopName) {
        this.stopName = stopName;
    }

    public String getRequestType() {
        return requestType;
    }

    public void setRequestType(String requestType) {
        this.requestType = requestType;
    }

    public String getRequestURL() {

        requestURL = getBaseURL() + urlPrefix + "?token=" + getToken()
                + "&agencyName=" + getAgencyName() + "&stopName=" + stopName;

        return requestURL;
    }
}
