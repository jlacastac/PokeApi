package org.jlacastac.pokeapi.Api;

public enum Endpoints {

    POKEMON("/pokemon/"),
    ABILITY("/ability/");

    public final String label;

    private Endpoints(String label) {
        this.label = label;
    }
}
