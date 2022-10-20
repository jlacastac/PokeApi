
package org.jlacastac.pokeapi.Api.Models;

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
    "emerald",
    "firered-leafgreen",
    "ruby-sapphire"
})
@Generated("jsonschema2pojo")
public class GenerationIii {

    @JsonProperty("emerald")
    private Emerald emerald;
    @JsonProperty("firered-leafgreen")
    private FireredLeafgreen fireredLeafgreen;
    @JsonProperty("ruby-sapphire")
    private RubySapphire rubySapphire;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public GenerationIii() {
    }

    /**
     * 
     * @param fireredLeafgreen
     * @param rubySapphire
     * @param emerald
     */
    public GenerationIii(Emerald emerald, FireredLeafgreen fireredLeafgreen, RubySapphire rubySapphire) {
        super();
        this.emerald = emerald;
        this.fireredLeafgreen = fireredLeafgreen;
        this.rubySapphire = rubySapphire;
    }

    @JsonProperty("emerald")
    public Emerald getEmerald() {
        return emerald;
    }

    @JsonProperty("emerald")
    public void setEmerald(Emerald emerald) {
        this.emerald = emerald;
    }

    @JsonProperty("firered-leafgreen")
    public FireredLeafgreen getFireredLeafgreen() {
        return fireredLeafgreen;
    }

    @JsonProperty("firered-leafgreen")
    public void setFireredLeafgreen(FireredLeafgreen fireredLeafgreen) {
        this.fireredLeafgreen = fireredLeafgreen;
    }

    @JsonProperty("ruby-sapphire")
    public RubySapphire getRubySapphire() {
        return rubySapphire;
    }

    @JsonProperty("ruby-sapphire")
    public void setRubySapphire(RubySapphire rubySapphire) {
        this.rubySapphire = rubySapphire;
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
