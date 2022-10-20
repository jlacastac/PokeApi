package org.jlacastac.pokeapi;

import org.jlacastac.pokeapi.Api.Model.Pokemon;
import org.jlacastac.pokeapi.Api.PokeApi;

public class Main {
    public static void main(String[] args) {

        PokeApi api = new PokeApi();

        Pokemon pokemon;

        pokemon = api.getPokemon("pikachu");

        System.out.println(pokemon);

    }
}