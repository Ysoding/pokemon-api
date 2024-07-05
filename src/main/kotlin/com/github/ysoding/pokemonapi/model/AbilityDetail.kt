package com.github.ysoding.pokemonapi.model

import org.bson.types.ObjectId
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import org.springframework.data.mongodb.core.mapping.Field

@Document(collection = "ability_detail")
data class AbilityDetail(
    @Id val id: ObjectId?,
    @Field("Desc") val description: String?,
    @Field("Effect") val effect: String?,
    @Field("Index") val index: Int?,
    @Field("NameZh") val nameZh: String?,
    @Field("Owners") val owners: Array<String>?
)
