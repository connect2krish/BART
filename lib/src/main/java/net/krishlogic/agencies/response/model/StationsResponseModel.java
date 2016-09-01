package net.krishlogic.agencies.response.model;

import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

import java.util.List;

/**
 * Created by kvenkat on 8/19/16.
 */
@Root(name="root")
public class StationsResponseModel {

    @ElementList(name = "stations")
    private List<Station> stations;

    public List<Station> getStations() {
        return stations;
    }

    public void setStations(List<Station> stations) {
        this.stations = stations;
    }
}