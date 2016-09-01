package net.krishlogic.agencies.response.model;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;

import java.util.List;

/**
 * Created by kvenkat on 8/19/16.
 */

@Element(name="etd")
public class ETD {

    @Element(name="destination")
    private String destination;

    @Element(name="abbreviation")
    private String abbreviation;

    @Element(name="limited")
    private String limited;

    @ElementList(name="estimate", inline = true)
    private List<Estimate> estimate;

    public List<Estimate> getEstimate() {
        return estimate;
    }

    public void setEstimate(List<Estimate> estimate) {
        this.estimate = estimate;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public void setAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    public String getLimited() {
        return limited;
    }

    public void setLimited(String limited) {
        this.limited = limited;
    }
}
