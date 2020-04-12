package ru.skillbranch.devintensive.models

import ru.skillbranch.devintensive.utils.Utils

data class Profile(

    var firstName: String,
    var lastName: String,
    var about: String,
    var repository: String,
    var rating: Int = 0,
    var respect: Int = 0
) {
    val nickName: String = Utils.transliteration("$firstName $lastName", "_")
    var rank: String = "Junior Android Developer!"
    fun toMap(): Map<String, Any> = mapOf(
        "nickName" to nickName,
        "rank" to rank,
        "firstname" to firstName,
        "lastname" to lastName,
        "about" to about,
        "repository" to repository,
        "rating" to rating,
        "respect" to respect
    )
}