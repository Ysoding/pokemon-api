package com.github.ysoding.pokemonapi.model

import org.bson.types.ObjectId
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import org.springframework.data.mongodb.core.mapping.Field

@Document(collection = "pokemon_ability_list")
data class PokemonAbility(
    @Id
    val id: ObjectId? = null,

    @Field("Ability1")
    val ability1: String?,

    @Field("Form")
    val form: String?,

    @Field("Generation")
    val generation: Int?,

    @Field("HideAbility")
    val hideAbility: String?,

    @Field("Index")
    val index: Int?,

    @Field("NameZh")
    val nameZh: String?,

    @Field("Type1")
    val type1: String?,

    @Field("Type2")
    val type2: String?,

    @Field("Ability2")
    val ability2: String?
)
