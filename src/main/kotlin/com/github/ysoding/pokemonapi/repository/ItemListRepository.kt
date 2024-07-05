package com.github.ysoding.pokemonapi.repository

import com.github.ysoding.pokemonapi.model.*
import org.bson.types.ObjectId
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface ItemListRepository : MongoRepository<ItemList, ObjectId> {
}