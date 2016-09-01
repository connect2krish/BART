package net.krishlogic.agencies.response.model;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

/**
 * Created by kvenkat on 8/19/16.
 */

@Root(name="root")
public class RealtimeEstimateModel {

    @Element(name="station")
    private Station station;

    public Station getStation() {
        return station;
    }

    public void setStation(Station station) {
        this.station = station;
    }
}
