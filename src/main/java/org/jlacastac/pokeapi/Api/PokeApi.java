package org.jlacastac.pokeapi.Api;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.jlacastac.pokeapi.Api.Model.Ability;
import org.jlacastac.pokeapi.Api.Model.Pokemon;

import java.awt.*;

import static io.restassured.RestAssured.*;

public class PokeApi {

        private static final String URL =  "https://pokeapi.co/api/v2";

        private ObjectMapper objectMapper;

        private static String endPoint;
        private static String uri;

        public PokeApi () {
            objectMapper = new ObjectMapper();
        }

        public Pokemon pokemon (String nombre) throws JsonProcessingException {
            buildUri("/pokemon/" + nombre);

            return objectMapper.readValue(get(uri).body().asString(), Pokemon.class);
        }

        public Ability getAbility (String nombre) throws JsonProcessingException {
            buildUri("/ability/" + nombre);

            return objectMapper.readValue(get(uri).body().asString(), Ability.class);
        }

        public void buildUri (String endPoint) {
            uri =  URL + endPoint;
        }
}

