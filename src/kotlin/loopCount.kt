

     fun printunorderedPairs(array: IntArray) {
        for (i in array.indices) {
            for (j in i + 1 until array.size) {
                println(array[i].toString() + "," + array[j])
            }
        }
    }

     fun main(args: Array<String>) {
         var myarray = intArrayOf(1,2,3,4)
         printunorderedPairs(myarray)
     }
