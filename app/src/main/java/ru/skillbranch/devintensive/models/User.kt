package ru.skillbranch.devintensive.models

import ru.skillbranch.devintensive.utils.Utils
import java.util.*
data class User (
    val id:String,
    var firstName:String?,
    var lastName:String?,
    var avatar:String?,
    var rating:Int = 0,
    var respact:Int = 0,
    val lastVisit:Date? = null,
    val isOnline:Boolean = false

){
        constructor(id:String, firstName:String?, lastName:String?) : this(id, firstName,lastName, null)

    constructor(id:String):this(id,"John", "Doe")

    init {

        println("It's Alive!!!\n${if(lastName==="Doe") "His name $firstName $lastName" else "Not Doe, $firstName $lastName"}\n")
    }

    companion object Factory{
        private var lastId : Int = -1
        fun makeUser(fullName:String?) : User{
            lastId++
            var (firstName, lastName) = Utils.parseFullName(fullName)
            return  User(id= "$lastId", firstName = firstName,lastName = lastName )
        }
    }
    fun printMe()= println("""
        id: $id
        firstName: $firstName
        lastName: $lastName
        avatar: $avatar
        rating: $rating
        respact: $respact
        lastVisiy: $lastVisit
        isOnline: $isOnline            
        """.trimIndent())
}