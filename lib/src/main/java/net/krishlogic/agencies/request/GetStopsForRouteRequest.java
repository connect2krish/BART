package net.krishlogic.agencies.request;

/**
 * Created by kvenkat on 5/11/16.
 */
/**
 *
 *  http://services.my511.org/Transit2.0/GetStopsForRoute.aspx?token=123-456-789&routeIDF=AgencyName~RouteCode~RouteDirectionCode
 *
 */

public class GetStopsForRouteRequest extends BaseRequest {

    private String urlPrefix = "GetStopsForRoute.aspx";

    private String requestType = "GET";

    private String requestURL;

    private String routeCode;

    public String getRouteCode() {
        return routeCode;
    }

    public void setRouteCode(String routeCode) {
        this.routeCode = routeCode;
    }

    public String getRequestType() {
        return requestType;
    }

    public void setRequestType(String requestType) {
        this.requestType = requestType;
    }

    public String getRequestURL() {

        requestURL = getBaseURL() + urlPrefix + "?token=" + getToken()
                + "&routeIDF=" + getAgencyName() + "~" + routeCode;

        return requestURL;
    }
}
