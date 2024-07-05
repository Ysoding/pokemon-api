package com.github.ysoding.pokemonapi.controller

import com.github.ysoding.pokemonapi.model.PokemonList
import com.github.ysoding.pokemonapi.model.PokemonDetail
import com.github.ysoding.pokemonapi.repository.PokemonDetailRepository
import com.github.ysoding.pokemonapi.repository.PokemonRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/pokemons")
class PokemonController(
    @Autowired val pokemonRepo: PokemonRepository, @Autowired val detailRepo: PokemonDetailRepository
) {
    //    TODO: 做个分页
    @GetMapping
    fun getAllPokemonList(): List<PokemonList> = pokemonRepo.findAll();

    @GetMapping("/name/{nameZh}")
    fun getPokemonByName(@PathVariable nameZh: String): PokemonDetail = detailRepo.findByNameZh(nameZh)
}