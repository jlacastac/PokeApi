
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
    "base_stat",
    "effort",
    "stat"
})
@Generated("jsonschema2pojo")
public class Stat {

    @JsonProperty("base_stat")
    private Integer baseStat;
    @JsonProperty("effort")
    private Integer effort;
    @JsonProperty("stat")
    private Stat stat;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Stat() {
    }

    /**
     * 
     * @param stat
     * @param baseStat
     * @param effort
     */
    public Stat(Integer baseStat, Integer effort, Stat stat) {
        super();
        this.baseStat = baseStat;
        this.effort = effort;
        this.stat = stat;
    }

    @JsonProperty("base_stat")
    public Integer getBaseStat() {
        return baseStat;
    }

    @JsonProperty("base_stat")
    public void setBaseStat(Integer baseStat) {
        this.baseStat = baseStat;
    }

    @JsonProperty("effort")
    public Integer getEffort() {
        return effort;
    }

    @JsonProperty("effort")
    public void setEffort(Integer effort) {
        this.effort = effort;
    }

    @JsonProperty("stat")
    public Stat getStat() {
        return stat;
    }

    @JsonProperty("stat")
    public void setStat(Stat stat) {
        this.stat = stat;
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
