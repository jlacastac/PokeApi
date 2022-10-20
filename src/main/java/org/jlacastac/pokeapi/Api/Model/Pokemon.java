
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
    "base_experience",
    "height",
    "is_default",
    "order",
    "weight",
    "abilities",
    "forms",
    "game_indices",
    "held_items",
    "location_area_encounters",
    "moves",
    "species",
    "sprites",
    "stats",
    "types",
    "past_types"
})
@Generated("jsonschema2pojo")
public class Pokemon {

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("base_experience")
    private Integer baseExperience;
    @JsonProperty("height")
    private Integer height;
    @JsonProperty("is_default")
    private Boolean isDefault;
    @JsonProperty("order")
    private Integer order;
    @JsonProperty("weight")
    private Integer weight;
    @JsonProperty("abilities")
    private List<Ability> abilities = null;
    @JsonProperty("forms")
    private List<Form> forms = null;
    @JsonProperty("game_indices")
    private List<GameIndex> gameIndices = null;
    @JsonProperty("held_items")
    private List<HeldItem> heldItems = null;
    @JsonProperty("location_area_encounters")
    private String locationAreaEncounters;
    @JsonProperty("moves")
    private List<Move> moves = null;
    @JsonProperty("species")
    private Species species;
    @JsonProperty("sprites")
    private Sprites sprites;
    @JsonProperty("stats")
    private List<Stat> stats = null;
    @JsonProperty("types")
    private List<Type> types = null;
    @JsonProperty("past_types")
    private List<PastType> pastTypes = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Pokemon() {
    }

    /**
     * 
     * @param types
     * @param weight
     * @param sprites
     * @param heldItems
     * @param abilities
     * @param isDefault
     * @param gameIndices
     * @param species
     * @param stats
     * @param moves
     * @param baseExperience
     * @param name
     * @param id
     * @param forms
     * @param pastTypes
     * @param height
     * @param order
     * @param locationAreaEncounters
     */
    public Pokemon(Integer id, String name, Integer baseExperience, Integer height, Boolean isDefault, Integer order, Integer weight, List<Ability> abilities, List<Form> forms, List<GameIndex> gameIndices, List<HeldItem> heldItems, String locationAreaEncounters, List<Move> moves, Species species, Sprites sprites, List<Stat> stats, List<Type> types, List<PastType> pastTypes) {
        super();
        this.id = id;
        this.name = name;
        this.baseExperience = baseExperience;
        this.height = height;
        this.isDefault = isDefault;
        this.order = order;
        this.weight = weight;
        this.abilities = abilities;
        this.forms = forms;
        this.gameIndices = gameIndices;
        this.heldItems = heldItems;
        this.locationAreaEncounters = locationAreaEncounters;
        this.moves = moves;
        this.species = species;
        this.sprites = sprites;
        this.stats = stats;
        this.types = types;
        this.pastTypes = pastTypes;
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

    @JsonProperty("base_experience")
    public Integer getBaseExperience() {
        return baseExperience;
    }

    @JsonProperty("base_experience")
    public void setBaseExperience(Integer baseExperience) {
        this.baseExperience = baseExperience;
    }

    @JsonProperty("height")
    public Integer getHeight() {
        return height;
    }

    @JsonProperty("height")
    public void setHeight(Integer height) {
        this.height = height;
    }

    @JsonProperty("is_default")
    public Boolean getIsDefault() {
        return isDefault;
    }

    @JsonProperty("is_default")
    public void setIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
    }

    @JsonProperty("order")
    public Integer getOrder() {
        return order;
    }

    @JsonProperty("order")
    public void setOrder(Integer order) {
        this.order = order;
    }

    @JsonProperty("weight")
    public Integer getWeight() {
        return weight;
    }

    @JsonProperty("weight")
    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    @JsonProperty("abilities")
    public List<Ability> getAbilities() {
        return abilities;
    }

    @JsonProperty("abilities")
    public void setAbilities(List<Ability> abilities) {
        this.abilities = abilities;
    }

    @JsonProperty("forms")
    public List<Form> getForms() {
        return forms;
    }

    @JsonProperty("forms")
    public void setForms(List<Form> forms) {
        this.forms = forms;
    }

    @JsonProperty("game_indices")
    public List<GameIndex> getGameIndices() {
        return gameIndices;
    }

    @JsonProperty("game_indices")
    public void setGameIndices(List<GameIndex> gameIndices) {
        this.gameIndices = gameIndices;
    }

    @JsonProperty("held_items")
    public List<HeldItem> getHeldItems() {
        return heldItems;
    }

    @JsonProperty("held_items")
    public void setHeldItems(List<HeldItem> heldItems) {
        this.heldItems = heldItems;
    }

    @JsonProperty("location_area_encounters")
    public String getLocationAreaEncounters() {
        return locationAreaEncounters;
    }

    @JsonProperty("location_area_encounters")
    public void setLocationAreaEncounters(String locationAreaEncounters) {
        this.locationAreaEncounters = locationAreaEncounters;
    }

    @JsonProperty("moves")
    public List<Move> getMoves() {
        return moves;
    }

    @JsonProperty("moves")
    public void setMoves(List<Move> moves) {
        this.moves = moves;
    }

    @JsonProperty("species")
    public Species getSpecies() {
        return species;
    }

    @JsonProperty("species")
    public void setSpecies(Species species) {
        this.species = species;
    }

    @JsonProperty("sprites")
    public Sprites getSprites() {
        return sprites;
    }

    @JsonProperty("sprites")
    public void setSprites(Sprites sprites) {
        this.sprites = sprites;
    }

    @JsonProperty("stats")
    public List<Stat> getStats() {
        return stats;
    }

    @JsonProperty("stats")
    public void setStats(List<Stat> stats) {
        this.stats = stats;
    }

    @JsonProperty("types")
    public List<Type> getTypes() {
        return types;
    }

    @JsonProperty("types")
    public void setTypes(List<Type> types) {
        this.types = types;
    }

    @JsonProperty("past_types")
    public List<PastType> getPastTypes() {
        return pastTypes;
    }

    @JsonProperty("past_types")
    public void setPastTypes(List<PastType> pastTypes) {
        this.pastTypes = pastTypes;
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
