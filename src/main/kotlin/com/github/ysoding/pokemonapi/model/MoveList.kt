package com.github.ysoding.pokemonapi.model

import org.bson.types.ObjectId
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import org.springframework.data.mongodb.core.mapping.Field

@Document(collection = "move_list")
data class MoveList(
    @Id
    val id: ObjectId? = null,

    @Field("Accuracy")
    val accuracy: String? = null,

    @Field("Description")
    val description: String? = null,

    @Field("Generation")
    val generation: Int? = null,

    @Field("Index")
    val index: Int? = null,

    @Field("NameEn")
    val nameEn: String? = null,

    @Field("NameJa")
    val nameJa: String? = null,

    @Field("NameZh")
    val nameZh: String? = null,

    @Field("PP")
    val pp: String? = null,

    @Field("Type")
    val type: String? = null,

    @Field("Category")
    val category: String? = null,

    @Field("Power")
    val power: String? = null
)
