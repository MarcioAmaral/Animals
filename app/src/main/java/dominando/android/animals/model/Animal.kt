package dominando.android.animals.model

import com.google.gson.annotations.SerializedName

data class Apikey(
    val message: String?,
    val key: String?
)

data class Animal(
    val name: String?,
    val taxonomy: Taxonomy?,
    val location: String?,
    val speed: Speed?,

    @SerializedName("lifespan")
    val lifeSpan: String?,

    @SerializedName("image")
    val imageUrl: String?
)

data class Taxonomy(
    val kingdom: String?,
    val order: String?,
    val family: String?
)

data class Speed(
    val metric: String?,
    val imperial: String?
)