package com.github.ysoding.pokemonapi.repository

import com.github.ysoding.pokemonapi.model.PokemonList
import org.bson.types.ObjectId
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface PokemonListRepository : MongoRepository<PokemonList, ObjectId> {
}