
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
    "generation-i",
    "generation-ii",
    "generation-iii",
    "generation-iv",
    "generation-v",
    "generation-vi",
    "generation-vii",
    "generation-viii"
})
@Generated("jsonschema2pojo")
public class Versions {

    @JsonProperty("generation-i")
    private GenerationI generationI;
    @JsonProperty("generation-ii")
    private GenerationIi generationIi;
    @JsonProperty("generation-iii")
    private GenerationIii generationIii;
    @JsonProperty("generation-iv")
    private GenerationIv generationIv;
    @JsonProperty("generation-v")
    private GenerationV generationV;
    @JsonProperty("generation-vi")
    private GenerationVi generationVi;
    @JsonProperty("generation-vii")
    private GenerationVii generationVii;
    @JsonProperty("generation-viii")
    private GenerationViii generationViii;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Versions() {
    }

    /**
     * 
     * @param generationV
     * @param generationIii
     * @param generationIv
     * @param generationVii
     * @param generationVi
     * @param generationIi
     * @param generationViii
     * @param generationI
     */
    public Versions(GenerationI generationI, GenerationIi generationIi, GenerationIii generationIii, GenerationIv generationIv, GenerationV generationV, GenerationVi generationVi, GenerationVii generationVii, GenerationViii generationViii) {
        super();
        this.generationI = generationI;
        this.generationIi = generationIi;
        this.generationIii = generationIii;
        this.generationIv = generationIv;
        this.generationV = generationV;
        this.generationVi = generationVi;
        this.generationVii = generationVii;
        this.generationViii = generationViii;
    }

    @JsonProperty("generation-i")
    public GenerationI getGenerationI() {
        return generationI;
    }

    @JsonProperty("generation-i")
    public void setGenerationI(GenerationI generationI) {
        this.generationI = generationI;
    }

    @JsonProperty("generation-ii")
    public GenerationIi getGenerationIi() {
        return generationIi;
    }

    @JsonProperty("generation-ii")
    public void setGenerationIi(GenerationIi generationIi) {
        this.generationIi = generationIi;
    }

    @JsonProperty("generation-iii")
    public GenerationIii getGenerationIii() {
        return generationIii;
    }

    @JsonProperty("generation-iii")
    public void setGenerationIii(GenerationIii generationIii) {
        this.generationIii = generationIii;
    }

    @JsonProperty("generation-iv")
    public GenerationIv getGenerationIv() {
        return generationIv;
    }

    @JsonProperty("generation-iv")
    public void setGenerationIv(GenerationIv generationIv) {
        this.generationIv = generationIv;
    }

    @JsonProperty("generation-v")
    public GenerationV getGenerationV() {
        return generationV;
    }

    @JsonProperty("generation-v")
    public void setGenerationV(GenerationV generationV) {
        this.generationV = generationV;
    }

    @JsonProperty("generation-vi")
    public GenerationVi getGenerationVi() {
        return generationVi;
    }

    @JsonProperty("generation-vi")
    public void setGenerationVi(GenerationVi generationVi) {
        this.generationVi = generationVi;
    }

    @JsonProperty("generation-vii")
    public GenerationVii getGenerationVii() {
        return generationVii;
    }

    @JsonProperty("generation-vii")
    public void setGenerationVii(GenerationVii generationVii) {
        this.generationVii = generationVii;
    }

    @JsonProperty("generation-viii")
    public GenerationViii getGenerationViii() {
        return generationViii;
    }

    @JsonProperty("generation-viii")
    public void setGenerationViii(GenerationViii generationViii) {
        this.generationViii = generationViii;
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
