// Determine if a string is an anagram of another string.

fun isAnagram(str1: String, str2: String) :Boolean
{
    val trimmedStr1 = str1.replace(" ","").toLowerCase()
    val trimmedStr2 = str2.replace(" ","").toLowerCase()
    val letters: MutableMap<Char, Int> = hashMapOf()
    trimmedStr1.forEach {
       letters[it] = letters[it]?.let { v ->v+1 } ?: 1
    }
    trimmedStr2.forEach {c->
        letters[c]?.let {
            v ->
            letters[c] = v - 1
            if(letters[c] == 0) letters.remove(c)
        } ?: return false
    }
    return letters.isEmpty()
}

fun main(args: Array<String>) {
    var first = "funeral"
    var second = "real fun"

    println(isAnagram(first,second))

     first = "playground"
     second = "real fun"

    println(isAnagram(first,second))
}
