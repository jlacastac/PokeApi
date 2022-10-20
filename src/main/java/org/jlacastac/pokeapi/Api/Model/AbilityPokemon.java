
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
    "is_hidden",
    "slot",
    "pokemon"
})
@Generated("jsonschema2pojo")
public class AbilityPokemon {

    @JsonProperty("is_hidden")
    private Boolean isHidden;
    @JsonProperty("slot")
    private Integer slot;
    @JsonProperty("pokemon")
    private Ability pokemon;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public AbilityPokemon() {
    }

    /**
     * 
     * @param pokemon
     * @param slot
     * @param isHidden
     */
    public AbilityPokemon(Boolean isHidden, Integer slot, Ability pokemon) {
        super();
        this.isHidden = isHidden;
        this.slot = slot;
        this.pokemon = pokemon;
    }

    @JsonProperty("is_hidden")
    public Boolean getIsHidden() {
        return isHidden;
    }

    @JsonProperty("is_hidden")
    public void setIsHidden(Boolean isHidden) {
        this.isHidden = isHidden;
    }

    @JsonProperty("slot")
    public Integer getSlot() {
        return slot;
    }

    @JsonProperty("slot")
    public void setSlot(Integer slot) {
        this.slot = slot;
    }

    @JsonProperty("pokemon")
    public Ability getPokemon() {
        return pokemon;
    }

    @JsonProperty("pokemon")
    public void setPokemon(Ability pokemon) {
        this.pokemon = pokemon;
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
