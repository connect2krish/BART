package net.krishlogic.agencies.response.model_1;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by kvenkat on 5/18/16.
 */
@XmlRootElement (name="Route")
public class Route {

    private String name;
    private int code;

    public String getName() {
        return name;
    }

    @XmlAttribute(name="Name")
    public void setName(String name) {
        this.name = name;
    }

    public int getCode() {
        return code;
    }

    @XmlAttribute (name = "Code")
    public void setCode(int code) {
        this.code = code;
    }
}
