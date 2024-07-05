package com.github.ysoding.pokemonapi.model

import com.fasterxml.jackson.annotation.JsonProperty
import org.bson.types.ObjectId
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import org.springframework.data.mongodb.core.mapping.Field


@Document(collection = "pokemon_detail")
data class PokemonDetail(
    @Id
    val id: ObjectId? = null,

    @Field("Index")
    val index: Int,

    @Field("NameZh")
    val nameZh: String,

    @Field("ImgURL")
    val imgUrl: String?,

    @Field("Type")
    val type: String?,

    @Field("Category")
    val category: String?,

    @Field("Ability")
    val ability: String?,

    @Field("Height")
    val height: String?,

    @Field("Weight")
    val weight: String?,

    @Field("BodyStyle")
    val bodyStyle: String?,

    @Field("CatchRate")
    val catchRate: String?,

    @Field("GenderRatio")
    val genderRatio: String?,

    @Field("EggGroup1")
    val eggGroup1: String?,

    @Field("EggGroup2")
    val eggGroup2: String?,

    @Field("HatchTime")
    val hatchTime: String?,

    @Field("EffortValue")
    val effortValue: String?,

    @Field("BaseStat")
    val baseStat: BaseStat?,

    @Field("LearnableMovesList")
    val learnableMovesList: List<LearnableMove>?,

    @Field("UsableMoveTutorList")
    val usableMoveTutorList: List<UsableMoveTutor>?,

    @Field("EggMoveList")
    val eggMoveList: List<EggMove>?
)

data class BaseStat(
    val hp: Int?,
    val attack: Int?,
    val defense: Int?,
    val spattack: Int?,
    val spdefense: Int?,
    val speed: Int?,
    val total: Int?,
    val average: Float?
)

data class LearnableMove(
    val level: String?,
    val move: String?,
    val type: String?,
    val category: String?,
    val power: String?,
    val accuracy: String?,
    val pp: String?
)

data class UsableMoveTutor(
    val imgUrl: String?,
    val technicalmachine: String?,
    val move: String?,
    val type: String?,
    val category: String?,
    val power: String?,
    val accuracy: String?,
    val pp: String?
)

data class EggMove(
    val parent: String?,
    val move: String?,
    val type: String?,
    val category: String?,
    val power: String?,
    val accuracy: String?,
    val pp: String?
)