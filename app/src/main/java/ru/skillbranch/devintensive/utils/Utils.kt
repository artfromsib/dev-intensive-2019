package ru.skillbranch.devintensive.utils

object Utils {
    fun parseFullName(fullName:String?):Pair<String?, String?>{
        // fix if null
        val parts : List<String>? = fullName?.split(" ")
        var firstName =parts?.getOrNull(0)
        var lastName =parts?.getOrNull(1)
        return firstName to lastName
    }

    fun transliteration(payload: String, divider:String = " "): String {
       TODO()
        return "todo"
    }

    fun toInitials(firstName: String?, lastName: String?): String? {
        TODO()
        return "todo"

    }
}