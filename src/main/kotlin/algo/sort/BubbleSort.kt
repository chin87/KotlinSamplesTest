
fun bubbleSort(arr: Array<Int>):Array<Int>{
    for (a in 0 until arr.size) {
        println("a "+a+" -> "+arr.contentToString())
        for(b in 0 until arr.size){
            println("b "+b+" -> "+arr.contentToString())
            if(b+1 < arr.size && arr[b] > arr[b+1]){
                val element = arr[b]
                arr[b] = arr[b+1]
                arr[b+1] = element
            }
        }
    }
    return arr
}