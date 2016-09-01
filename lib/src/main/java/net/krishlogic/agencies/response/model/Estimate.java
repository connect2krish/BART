package net.krishlogic.agencies.response.model;

import org.simpleframework.xml.Element;

/**
 * Created by kvenkat on 8/19/16.
 */
@Element(name = "estimate")
public class Estimate {

    @Element(name="minutes")
    private String minutes;

    @Element(name="platform")
    private String platform;

    @Element(name="direction")
    private String direction;

    @Element(name="length")
    private String length;

    @Element(name="color")
    private String color;

    @Element(name="hexcolor")
    private String hexcolor;

    @Element(name="bikeflag")
    public String bikeflag;

    public String getMinutes() {
        return minutes;
    }

    public void setMinutes(String minutes) {
        this.minutes = minutes;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public String getLength() {
        return length;
    }

    public void setLength(String length) {
        this.length = length;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getHexcolor() {
        return hexcolor;
    }

    public void setHexcolor(String hexcolor) {
        this.hexcolor = hexcolor;
    }

    public String getBikeflag() {
        return bikeflag;
    }

    public void setBikeflag(String bikeflag) {
        this.bikeflag = bikeflag;
    }
}
