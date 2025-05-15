package org.example

import selectionSort

fun main() {
    println("Hello World!")
    //array of non negative integer
    //find
    //input [1,2,3,4,5,5]
    //input n -> 1, 2

    //val array = arrayOf(4,3,1,2,5)
    //val n = 2
    //println(" "+largest(array, n))

    //println(" "+addNumberSolKotlinFunctions(11))
    //println(" addition : "+addNumberSolBasic(1112))
}

fun addNumberSolBasic(n: Int): Int {
    var added = 0
    var inputNumber = n
    while(inputNumber != 0){
        added += inputNumber%10
        inputNumber /= 10
    }
    return added
}

fun addNumberSolKotlinFunctions(n: Int): Int {
    val x = n.toString().toCharArray()
    println(n.toString().toCharArray())
    val returnX = x[0].digitToInt() + x[1].digitToInt()
    return returnX
}


fun largest(arr: Array<Int>, input: Int): Int{
    //return bubbleSort(arr)[arr.size-input]
    return selectionSort(arr)[arr.size-input]
    //return insertionSort(arr)[arr.size-input]
}

/*var largest = 0
var secondLargest = 0
var element = 0
for (a in 0 until arr.size){
    element = arr[a]

    if( element > largest){
    largest = element
     if(secondLargest==0){
        secondLargest = element
     }
    }
    if(element > secondLargest && element < largest ){
    secondLargest = element
    }
}
return secondLargest
*/