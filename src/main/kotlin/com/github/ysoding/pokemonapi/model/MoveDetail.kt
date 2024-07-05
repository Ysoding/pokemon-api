package com.github.ysoding.pokemonapi.model

import org.bson.types.ObjectId
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import org.springframework.data.mongodb.core.mapping.Field

@Document(collection = "move_detail")
data class MoveDetail(
    @Id
    val id: ObjectId? = null,

    @Field("Desc")
    val desc: String? = null,

    @Field("Effect")
    val effect: String? = null,

    @Field("ImgUrl")
    val imgUrl: String? = null,

    @Field("Index")
    val index: Int? = null,

    @Field("NameZh")
    val nameZh: String? = null,

    @Field("Notes")
    val notes: String? = null,

    @Field("Scope")
    val scope: String? = null
)
