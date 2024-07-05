package com.github.ysoding.pokemonapi.model

import org.bson.types.ObjectId
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import org.springframework.data.mongodb.core.mapping.Field

@Document(collection = "nature_list")
data class NatureList(
    @Id
    val id: ObjectId? = null,

    @Field("DislikedTaste")
    val dislikedTaste: String?,

    @Field("FavoriteTaste")
    val favoriteTaste: String?,

    @Field("HardGrowthAbility")
    val hardGrowthAbility: String?,

    @Field("NameEn")
    val nameEn: String?,

    @Field("NameJa")
    val nameJa: String?,

    @Field("NameZh")
    val nameZh: String?,

    @Field("EasyGrowthAbility")
    val easyGrowthAbility: String?
)