package org.jlacastac.pokeapi.Api;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.jlacastac.pokeapi.Api.Models.Ability;
import org.jlacastac.pokeapi.Api.Models.Pokemon;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import static io.restassured.RestAssured.*;

public class PokeApi {

        private static final String URL =  "https://pokeapi.co/api/v2";

        private ObjectMapper objectMapper;
        private static String uri;

        public PokeApi () {
            objectMapper = new ObjectMapper();
        }

        public Pokemon getPokemon (Object identifier) throws JsonProcessingException {
            buildUri(Endpoints.POKEMON.label, identifier);

            return objectMapper.readValue(get(uri).body().asString(), Pokemon.class);
        }

        public void buildUri (String endPoint, Object identifier) {
            uri =  URL + endPoint + identifier;
        }
}

