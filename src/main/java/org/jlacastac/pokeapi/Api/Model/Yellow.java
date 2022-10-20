
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
    "back_default",
    "back_gray",
    "front_default",
    "front_gray"
})
@Generated("jsonschema2pojo")
public class Yellow {

    @JsonProperty("back_default")
    private String backDefault;
    @JsonProperty("back_gray")
    private String backGray;
    @JsonProperty("front_default")
    private String frontDefault;
    @JsonProperty("front_gray")
    private String frontGray;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Yellow() {
    }

    /**
     * 
     * @param backDefault
     * @param frontDefault
     * @param frontGray
     * @param backGray
     */
    public Yellow(String backDefault, String backGray, String frontDefault, String frontGray) {
        super();
        this.backDefault = backDefault;
        this.backGray = backGray;
        this.frontDefault = frontDefault;
        this.frontGray = frontGray;
    }

    @JsonProperty("back_default")
    public String getBackDefault() {
        return backDefault;
    }

    @JsonProperty("back_default")
    public void setBackDefault(String backDefault) {
        this.backDefault = backDefault;
    }

    @JsonProperty("back_gray")
    public String getBackGray() {
        return backGray;
    }

    @JsonProperty("back_gray")
    public void setBackGray(String backGray) {
        this.backGray = backGray;
    }

    @JsonProperty("front_default")
    public String getFrontDefault() {
        return frontDefault;
    }

    @JsonProperty("front_default")
    public void setFrontDefault(String frontDefault) {
        this.frontDefault = frontDefault;
    }

    @JsonProperty("front_gray")
    public String getFrontGray() {
        return frontGray;
    }

    @JsonProperty("front_gray")
    public void setFrontGray(String frontGray) {
        this.frontGray = frontGray;
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
