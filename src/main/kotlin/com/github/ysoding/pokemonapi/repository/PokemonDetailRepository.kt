package com.github.ysoding.pokemonapi.repository

import com.github.ysoding.pokemonapi.model.PokemonDetail
import org.bson.types.ObjectId
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface PokemonDetailRepository : MongoRepository<PokemonDetail, ObjectId> {
    @Override
    fun findByNameZh(nameZh: String): PokemonDetail
}