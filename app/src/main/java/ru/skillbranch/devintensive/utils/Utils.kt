package ru.skillbranch.devintensive.utils

object Utils {
    fun parseFullName(fullName:String?):Pair<String?, String?>{
        var firstName:String?
        var lastName:String?
        if (fullName.equals(null)||fullName.equals("")||fullName.equals(" ")) {
            firstName = null
            lastName = null
        } else {
            val parts: List<String>? = fullName?.split(" ")
            firstName = parts?.getOrNull(0)

            if (firstName.equals("")) firstName = null
            lastName = parts?.getOrNull(1)
            if (lastName.equals("")) lastName = null
        }
        return firstName to lastName
    }

    fun transliteration(payload: String, divider:String = " "): String {
        var resultString: String = ""
        var temp: String = ""
        val parts: List<String>? = payload?.split(" ")

        val chars: MutableMap<Char, String> = mutableMapOf( 'а' to "a", 'б' to "b", 'в' to "v", 'г' to "g", 'д' to "d", 'е' to "e",
            'ё' to "e", 'ж' to "zh", 'з' to "z", 'и' to "i", 'й' to "i", 'к' to "k", 'л' to "l", 'м' to "m", 'н' to "n", 'о' to "o", 'п' to "p", 'р' to "r",
            'с' to "s", 'т' to "t", 'у' to "u", 'ф' to "f", 'х' to "h", 'ц' to "c", 'ч' to "ch", 'ш' to "sh", 'щ' to "sh'", 'ъ' to "",
            'ы' to "i",'ь' to "", 'э' to "e", 'ю' to "yu",'я' to "ya"
        )
       for(i in 0..1) {
           temp = ""
           for (charPayload in parts?.getOrNull(i).toString().toLowerCase()) {
               if (chars.containsKey(charPayload)) {
                   temp = temp + chars.get(charPayload).toString()
               } else {
                   temp = temp + charPayload.toString()
               }


           }

           if(i==0){ resultString = firstUpperCase(temp) +divider
           }else{
               resultString = resultString + firstUpperCase(temp)
           }


       }
        return resultString
    }

    fun toInitials(firstName: String?, lastName: String?): String? {
        var firstInitial:Char=' '
        var lastInitial:Char=' '
        var temp1:String?=""
        var temp2:String?=""
        //firstInitial = firstName ?: null
        //return l.toString()


        if (firstName.equals("")||firstName.equals(" ")||firstName==null) {
            temp1 = null}
        else{
          firstInitial = firstName.capitalize().toString()[0]

        }
        if(lastName.equals(null)||lastName.equals("")||lastName.equals(" ")||lastName==null){
            temp2 = null
            if (temp1==null) return null

        }
        else{
            lastInitial = lastName.capitalize().toString()[0]
        }

        if(temp1==null&&temp2!=null){
         return lastInitial.toString()
        }else if (temp1!=null&&temp2==null){
         return firstInitial.toString()
        }
        else
            return "$firstInitial$lastInitial"

    }
    fun firstUpperCase(word: String?): String? {
        return if (word == null || word.isEmpty()) "" else word.substring(0,1).toUpperCase() + word.substring(1)
    }
}