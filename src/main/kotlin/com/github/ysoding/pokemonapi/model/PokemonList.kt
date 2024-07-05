package com.github.ysoding.pokemonapi.model

import com.fasterxml.jackson.annotation.JsonProperty
import org.bson.types.ObjectId
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import org.springframework.data.mongodb.core.mapping.Field


@Document(collection = "pokemon_list")
data class PokemonList(
    @Id val id: ObjectId? = null,

    @Field("Form") val form: String = "",

    @Field("Generation") val generation: Int = 0,

    @Field("Index") val index: Int = 0,

    @Field("NameEn") val nameEn: String = "",

    @Field("NameJa") val nameJa: String = "",

    @Field("NameZh") val nameZh: String = "",

    @Field("Type1") val type1: String = "",

    @Field("Type2") val type2: String? = null
)
