package net.krishlogic.agencies.response.model_1;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by kvenkat on 5/18/16.
 */
@XmlRootElement (name="Agency")
public class Agency {

    private String name;

    private String hasDirection;

    private String mode;

    private RouteList routeList;

    public String getName() {
        return name;
    }

    @XmlAttribute(name="Name")
    public void setName(String name) {
        this.name = name;
    }

    public String getHasDirection() {
        return hasDirection;
    }

    @XmlAttribute(name="HasDirection")
    public void setHasDirection(String hasDirection) {
        this.hasDirection = hasDirection;
    }

    public String getMode() {
        return mode;
    }

    @XmlAttribute(name = "Mode")
    public void setMode(String mode) {
        this.mode = mode;
    }

    public RouteList getRouteList() {
        return routeList;
    }

    public void setRouteList(RouteList routeList) {
        this.routeList = routeList;
    }

    public boolean isHasDirection() {
        return Boolean.getBoolean(hasDirection);
    }
}
