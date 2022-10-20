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
        "effect",
        "short_effect",
        "language"
})
@Generated("jsonschema2pojo")
public class VerboseEffect {

    @JsonProperty("effect")
    private String effect;
    @JsonProperty("short_effect")
    private String shortEffect;
    @JsonProperty("language")
    private Language language;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     */
    public VerboseEffect() {
    }

    /**
     * @param effect
     * @param language
     * @param shortEffect
     */
    public VerboseEffect(String effect, String shortEffect, Language language) {
        super();
        this.effect = effect;
        this.shortEffect = shortEffect;
        this.language = language;
    }

    @JsonProperty("effect")
    public String getEffect() {
        return effect;
    }

    @JsonProperty("effect")
    public void setEffect(String effect) {
        this.effect = effect;
    }

    @JsonProperty("short_effect")
    public String getShortEffect() {
        return shortEffect;
    }

    @JsonProperty("short_effect")
    public void setShortEffect(String shortEffect) {
        this.shortEffect = shortEffect;
    }

    @JsonProperty("language")
    public Language getLanguage() {
        return language;
    }

    @JsonProperty("language")
    public void setLanguage(Language language) {
        this.language = language;
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