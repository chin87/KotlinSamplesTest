
fun selectionSort(array: Array<Int>):Array<Int>{
    for (first in array.indices) {
        println("first "+first+" -> "+array.contentToString())
        var minIndex = first
        for (second in first+1 until array.size) {
            if(array[second] <  array[first]){
                minIndex = second
            }
        }
        val element = array[first]
        array[first] =  array[minIndex]
        array[minIndex] = element
    }
    return array
}