
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
    "level_learned_at",
    "version_group",
    "move_learn_method"
})
@Generated("jsonschema2pojo")
public class VersionGroupDetail {

    @JsonProperty("level_learned_at")
    private Integer levelLearnedAt;
    @JsonProperty("version_group")
    private VersionGroup versionGroup;
    @JsonProperty("move_learn_method")
    private MoveLearnMethod moveLearnMethod;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public VersionGroupDetail() {
    }

    /**
     * 
     * @param versionGroup
     * @param levelLearnedAt
     * @param moveLearnMethod
     */
    public VersionGroupDetail(Integer levelLearnedAt, VersionGroup versionGroup, MoveLearnMethod moveLearnMethod) {
        super();
        this.levelLearnedAt = levelLearnedAt;
        this.versionGroup = versionGroup;
        this.moveLearnMethod = moveLearnMethod;
    }

    @JsonProperty("level_learned_at")
    public Integer getLevelLearnedAt() {
        return levelLearnedAt;
    }

    @JsonProperty("level_learned_at")
    public void setLevelLearnedAt(Integer levelLearnedAt) {
        this.levelLearnedAt = levelLearnedAt;
    }

    @JsonProperty("version_group")
    public VersionGroup getVersionGroup() {
        return versionGroup;
    }

    @JsonProperty("version_group")
    public void setVersionGroup(VersionGroup versionGroup) {
        this.versionGroup = versionGroup;
    }

    @JsonProperty("move_learn_method")
    public MoveLearnMethod getMoveLearnMethod() {
        return moveLearnMethod;
    }

    @JsonProperty("move_learn_method")
    public void setMoveLearnMethod(MoveLearnMethod moveLearnMethod) {
        this.moveLearnMethod = moveLearnMethod;
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
