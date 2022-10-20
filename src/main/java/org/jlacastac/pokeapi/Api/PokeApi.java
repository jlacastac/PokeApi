package org.jlacastac.pokeapi.Api;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.jlacastac.pokeapi.Api.Model.Pokemon;

import java.util.Iterator;

import static io.restassured.RestAssured.*;

public class PokeApi {

        private static final String URL =  "https://pokeapi.co/api/v2";

        private ObjectMapper objectMapper;

        private static String endPoint;
        private static String uri;

        public PokeApi () {
            objectMapper = new ObjectMapper();
        }

        public Pokemon getPokemon (String nombre) {
            buildUri("/pokemon/" + nombre);
            return (Pokemon) sendRequest();
        }

        public void buildUri (String endPoint) {
            uri =  URL + endPoint;
        }

        private Object sendRequest () {
            return get(uri).getBody().as(String.class);
        }
}

