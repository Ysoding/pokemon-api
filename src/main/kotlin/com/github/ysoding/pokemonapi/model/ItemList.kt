package com.github.ysoding.pokemonapi.model

import org.bson.types.ObjectId
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import org.springframework.data.mongodb.core.mapping.Field

@Document("item_list")
data class ItemList(
    @Id val id: ObjectId?,
    @Field("Description") val description: String?,
    @Field("ImageURL") val imageURL: String?,
    @Field("NameEn") val nameEn: String?,
    @Field("NameJa") val nameJa: String?,
    @Field("NameZh") val nameZh: String?,
    @Field("Type") val type: String?
)
