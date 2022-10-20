
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
    "flavor_text",
    "language",
    "version_group"
})
@Generated("jsonschema2pojo")
public class FlavorTextEntry {

    @JsonProperty("flavor_text")
    private String flavorText;
    @JsonProperty("language")
    private Language language;
    @JsonProperty("version_group")
    private VersionGroup versionGroup;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public FlavorTextEntry() {
    }

    /**
     * 
     * @param flavorText
     * @param versionGroup
     * @param language
     */
    public FlavorTextEntry(String flavorText, Language language, VersionGroup versionGroup) {
        super();
        this.flavorText = flavorText;
        this.language = language;
        this.versionGroup = versionGroup;
    }

    @JsonProperty("flavor_text")
    public String getFlavorText() {
        return flavorText;
    }

    @JsonProperty("flavor_text")
    public void setFlavorText(String flavorText) {
        this.flavorText = flavorText;
    }

    @JsonProperty("language")
    public Language getLanguage() {
        return language;
    }

    @JsonProperty("language")
    public void setLanguage(Language language) {
        this.language = language;
    }

    @JsonProperty("version_group")
    public VersionGroup getVersionGroup() {
        return versionGroup;
    }

    @JsonProperty("version_group")
    public void setVersionGroup(VersionGroup versionGroup) {
        this.versionGroup = versionGroup;
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
