fun insertionSort(array: Array<Int>):Array<Int>{
    for (first in 1 until array.size) {
        println("first "+first+" -> "+array.contentToString())
        val element = array[first]
        var reverse = first-1
        while (reverse >= 0 && array[reverse] > element) {
            println("reverse "+reverse+" -> "+array.contentToString())
            array[reverse + 1] = array[reverse]
            --reverse
        }
        array[reverse + 1] = element;
    }
    return array
}