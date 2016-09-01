package net.krishlogic.agencies.response.model_1;

import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by kvenkat on 5/19/16.
 */
@XmlRootElement(name="AgencyList")
public class AgencyList {

    List<Agency> agency;

    public List<Agency> getAgency() {
        return agency;
    }

    @XmlElement(name="Agency")
    public void setAgency(List<Agency> agency) {
        this.agency = agency;
    }
}
