package com.github.ysoding.pokemonapi.repository

import com.github.ysoding.pokemonapi.model.NatureList
import com.github.ysoding.pokemonapi.model.PokemonList
import org.bson.types.ObjectId
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface NatureListRepository : MongoRepository<NatureList, ObjectId> {
}