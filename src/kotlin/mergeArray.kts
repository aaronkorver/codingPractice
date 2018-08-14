

fun merge(first: Array<Int>, second: Array<Int>) : Array<Int>
{
    val final : Array<Int?> = arrayOfNulls<Int?>(first.size + second.size)
    var i = 0
    var j = 0
    var k = 0
    while (i < first.size && j < second.size)
    {
        final[k++] = if(first[i] < second[j]) first[i++] else second[j++]
    }
    while (i < first.size)
    {
        final[k++] = first[i++]
    }
    while (i < second.size)
    {
        final[k++] = second[i++]
    }

    return final as Array<Int>

}// = (first + second).sortedArray()


            var x = arrayOf(1, 5, 9)
            var y = arrayOf(3, 4, 7, 10)

            merge(x,y).forEach { println(it) }
