package com.github.ysoding.pokemonapi.model

import org.bson.types.ObjectId
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import org.springframework.data.mongodb.core.mapping.Field

@Document("ability_list")
data class AbilityList(
    @Id val id: ObjectId?,
    @Field("CommonCnt") val commonCount: Int?,
    @Field("Description") val description: String?,
    @Field("Generation") val generation: Int?,
    @Field("HiddenCnt") val hiddenCount: Int?,
    @Field("Index") val index: Int?,
    @Field("NameEn") val nameEn: String?,
    @Field("NameJa") val nameJa: String?,
    @Field("NameZh") val nameZh: String?
)

