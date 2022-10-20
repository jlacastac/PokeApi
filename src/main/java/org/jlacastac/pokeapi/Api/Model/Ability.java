
package org.jlacastac.pokeapi.Api.Model;

import java.util.HashMap;
import java.util.List;
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
        "id",
        "name",
        "accuracy",
        "effect_chance",
        "pp",
        "priority",
        "power",
        "is_main_series",
        "generation",
        "names",
        "effect_entries",
        "effect_changes",
        "flavor_text_entries",
        "pokemon"
})
@Generated("jsonschema2pojo")
public class Ability {

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("is_main_series")
    private Boolean isMainSeries;
    @JsonProperty("generation")
    private Generation generation;
    @JsonProperty("names")
    private List<Name> names = null;
    @JsonProperty("effect_entries")
    private List<VerboseEffect> effectEntries = null;
    @JsonProperty("effect_changes")
    private List<AbilityEffectChange> effectChanges = null;
    @JsonProperty("flavor_text_entries")
    private List<AbilityFlavorText> flavorTextEntries = null;
    @JsonProperty("pokemon")
    private List<AbilityPokemon> pokemon = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     */
    public Ability() {
    }

    /**
     * @param generation
     * @param names
     * @param effectEntries
     * @param pokemon
     * @param isMainSeries
     * @param effectChanges
     * @param name
     * @param flavorTextEntries
     * @param id
     */
    public Ability(Integer id, String name, Boolean isMainSeries, Generation generation, List<Name> names, List<VerboseEffect> effectEntries, List<AbilityEffectChange> effectChanges, List<AbilityFlavorText> flavorTextEntries, List<AbilityPokemon> pokemon) {
        super();
        this.id = id;
        this.name = name;
        this.isMainSeries = isMainSeries;
        this.generation = generation;
        this.names = names;
        this.effectEntries = effectEntries;
        this.effectChanges = effectChanges;
        this.flavorTextEntries = flavorTextEntries;
        this.pokemon = pokemon;
    }

    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("is_main_series")
    public Boolean getIsMainSeries() {
        return isMainSeries;
    }

    @JsonProperty("is_main_series")
    public void setIsMainSeries(Boolean isMainSeries) {
        this.isMainSeries = isMainSeries;
    }

    @JsonProperty("generation")
    public Generation getGeneration() {
        return generation;
    }

    @JsonProperty("generation")
    public void setGeneration(Generation generation) {
        this.generation = generation;
    }

    @JsonProperty("names")
    public List<Name> getNames() {
        return names;
    }

    @JsonProperty("names")
    public void setNames(List<Name> names) {
        this.names = names;
    }

    @JsonProperty("effect_entries")
    public List<VerboseEffect> getEffectEntries() {
        return effectEntries;
    }

    @JsonProperty("effect_entries")
    public void setEffectEntries(List<VerboseEffect> effectEntries) {
        this.effectEntries = effectEntries;
    }

    @JsonProperty("effect_changes")
    public List<AbilityEffectChange> getEffectChanges() {
        return effectChanges;
    }

    @JsonProperty("effect_changes")
    public void setEffectChanges(List<AbilityEffectChange> effectChanges) {
        this.effectChanges = effectChanges;
    }

    @JsonProperty("flavor_text_entries")
    public List<AbilityFlavorText> getFlavorTextEntries() {
        return flavorTextEntries;
    }

    @JsonProperty("flavor_text_entries")
    public void setFlavorTextEntries(List<AbilityFlavorText> flavorTextEntries) {
        this.flavorTextEntries = flavorTextEntries;
    }

    @JsonProperty("pokemon")
    public List<AbilityPokemon> getPokemon() {
        return pokemon;
    }

    @JsonProperty("pokemon")
    public void setPokemon(List<AbilityPokemon> pokemon) {
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

    @Override
    public String toString() {
        return "Pokemon{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
