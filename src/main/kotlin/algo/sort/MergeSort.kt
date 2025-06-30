package org.example.algo.sort

fun mergeSort(array: Array<Int>):Array<Int>{
    println("mergeSort "+ array.toList())
    if (array.size < 2) return array
    val midLength = array.size/2

    var leftHalf: Array<Int> = Array(midLength) { 0 }
    var rightHalf: Array<Int> = Array(array.size-midLength) { 0 }
    leftHalf = array.slice(0..<midLength).toTypedArray()
    /*for(i in 0..<midLength){
        leftHalf[i] = array[i]
    }*/
    rightHalf = array.slice(midLength..<array.size).toTypedArray()
    /*for(i in midLength..<array.size){
        rightHalf[i-midLength] = array[i]
    }*/
    leftHalf = mergeSort(leftHalf)
    rightHalf = mergeSort(rightHalf)

    return merge(array, leftHalf, rightHalf)
}

private fun merge(array: Array<Int>, leftHalf: Array<Int>, rightHalf: Array<Int>): Array<Int> {
    val leftSize = leftHalf.size
    val rightSize = rightHalf.size
    var leftVar = 0
    var rightVar = 0
    var finalVar = 0

    while (leftVar < leftSize && rightVar < rightSize) {
        if (leftHalf[leftVar] <= rightHalf[rightVar]) {
            array[finalVar] = leftHalf[leftVar]
            leftVar++
        } else {
            array[finalVar] = rightHalf[rightVar]
            rightVar++
        }
        finalVar++
    }
    while (leftVar < leftSize) {
        array[finalVar] = leftHalf[leftVar]
        leftVar++
        finalVar++
    }
    while (rightVar < rightSize) {
        array[finalVar] = rightHalf[rightVar]
        rightVar++
        finalVar++
    }

    println("merge " + array.toList())
    return array
}