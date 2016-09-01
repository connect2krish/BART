package net.krishlogic.agencies.response.model;

import org.simpleframework.xml.Element;

/**
 * Created by kvenkat on 8/18/16.
 */
@Element(name="station")
public class Station {

    @Element(name="name", required = false)
    private String name;

    @Element(name="abbr", required = false)
    private String abbr;

    @Element(name="gtfs_latitude", required = false)
    private String latitude;

    @Element(name="gtfs_longitude", required = false)
    private String longitude;

    @Element(name="address", required = false)
    private String address;

    @Element(name="city", required = false)
    private String city;

    @Element(name="state", required = false)
    private String state;

    @Element(name="zipcode", required = false)
    private String zipCode;

    @Element(name = "etd", required=false)
    private ETD etd;

    public ETD getEtd() {
        return etd;
    }

    public void setEtd(ETD etd) {
        this.etd = etd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAbbr() {
        return abbr;
    }

    public void setAbbr(String abbr) {
        this.abbr = abbr;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }
}
