package net.krishlogic.agencies.response.model_1;

import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by kvenkat on 5/18/16.
 */
@XmlRootElement (name="RouteList")
public class RouteList {

    private List<Route> route;

    public List<Route> getRoute() {
        return route;
    }

    @XmlElement (name="Route")
    public void setRoute(List<Route> route) {
        this.route = route;
    }
}
