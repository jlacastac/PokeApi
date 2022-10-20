
package org.jlacastac.pokeapi.Api.Model;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "black-white"
})
@Generated("jsonschema2pojo")
public class GenerationV {

    @JsonProperty("black-white")
    private BlackWhite blackWhite;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public GenerationV() {
    }

    /**
     * 
     * @param blackWhite
     */
    public GenerationV(BlackWhite blackWhite) {
        super();
        this.blackWhite = blackWhite;
    }

    @JsonProperty("black-white")
    public BlackWhite getBlackWhite() {
        return blackWhite;
    }

    @JsonProperty("black-white")
    public void setBlackWhite(BlackWhite blackWhite) {
        this.blackWhite = blackWhite;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
