package net.krishlogic.agencies.request;

/**
 * Created by kvenkat on 5/11/16.
 */
public class BaseRequest {

    //unique ID from 511.org
    //private String token ="b1a69032-c0e1-4e67-9681-41cccdd63874";
    private String token = "QK4J-PDUG-99UT-DWE9";

    private String agencyName = "BART";

//    private String baseURL = "http://services.my511.org/Transit2.0/";
    private String baseURL = "http://api.bart.gov/api/";

    public String getToken() {
        return token;
    }

    public String getBaseURL() {
        return baseURL;
    }

    public String getAgencyName() {
        return agencyName;
    }
}
