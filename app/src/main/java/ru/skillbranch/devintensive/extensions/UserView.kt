package ru.skillbranch.devintensive.extensions

class UserView(
    val id: String,
    val fullName:String,
    val nickName:String,
    var avatar:String? = null,
    var status:String? = "offline",
    var initials:String?
){
    fun printMe(){
       println("""           
         id: $:
         fullName: $id:
         nickName: $fullName:
         avatar: $nickName:
         status: $avatar:
         initials: $status:
       """.trimIndent())
    }
}
