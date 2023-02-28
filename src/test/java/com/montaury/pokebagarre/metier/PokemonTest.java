package com.montaury.pokebagarre.metier;

import com.montaury.pokebagarre.fixtures.ConstructeurDePokemon;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class PokemonTest {

    @Test
    // test si le pokemon 1 a le plus d'attaque gagne
    void pokemon1GagneAttaque() {
        var pokemon1 = ConstructeurDePokemon.unPokemon().avecAttaque(10).construire();
        var pokemon2 = ConstructeurDePokemon.unPokemon().avecAttaque(5).construire();
        assertThat(pokemon1.estVainqueurContre(pokemon2)).isTrue();
    }
    @Test
    // test si le pokemon 2 a le plus d'attaque gagne
    void pokemon2GagneAttaque() {
        var pokemon1 = ConstructeurDePokemon.unPokemon().avecAttaque(5).construire();
        var pokemon2 = ConstructeurDePokemon.unPokemon().avecAttaque(10).construire();
        assertThat(pokemon2.estVainqueurContre(pokemon1)).isTrue();
    }
    @Test
    // test si les pokemons on la meme attaque alors si le pokemon 1 a le plus de defense gagne
    void pokemon1Gagnedefense() {
        var pokemon1 = ConstructeurDePokemon.unPokemon().avecAttaque(5).avecDefense(10).construire();
        var pokemon2 = ConstructeurDePokemon.unPokemon().avecAttaque(5).avecDefense(5).construire();
        assertThat(pokemon1.estVainqueurContre(pokemon2)).isTrue();
    }
    @Test
    // test si les pokemons on la meme attaque alors si le pokemon 2 a le plus de defense gagne
    void pokemon2Gagnedefense() {
        var pokemon1 = ConstructeurDePokemon.unPokemon().avecAttaque(5).avecDefense(5).construire();
        var pokemon2 = ConstructeurDePokemon.unPokemon().avecAttaque(5).avecDefense(10).construire();
        assertThat(pokemon1.estVainqueurContre(pokemon2)).isFalse();
    }
    @Test
    // test si les pokemons on la meme attaque et la meme defense alors le pokemon 1 qui est le premier a etre construit gagne
    void pokemon1Gagnedraw() {
        var pokemon1 = ConstructeurDePokemon.unPokemon().avecAttaque(5).avecDefense(5).construire();
        var pokemon2 = ConstructeurDePokemon.unPokemon().avecAttaque(5).avecDefense(5).construire();
        assertThat(pokemon1.estVainqueurContre(pokemon2)).isTrue();
    }
}
