package de.orome.mvvmrecipeapp.domain.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Recipe(
    val id: Int? = null,
    val title: String? = null,
    val publisher: String? = null,
    val featured_image: String? = null,
    val rating: Int = 0,
    val source_url: String? = null,
    val description: String? = null,
    val cooking_instructions: String? = null,
    val ingredients: String? = null,
    val date_added: String? = null,
    val date_updated: String? = null,
    val long_date_added: Long? = null,
    val long_date_updated: Long? = null

) : Parcelable
