//1.Factorial Calculation
//Write a function to compute the factorial of a given number n using both recursion and iteration.
fun factorial( number: Int): Int{
    var fact = 1
    for(i in 1..number){
        fact = fact*i
    }
    return fact
}

fun factorialRecursive( number: Int): Int{
    if(number < 0){
    	return 1
    }else if(number == 0 || number == 1){
        return 1
    }else{
		return number * factorial(number - 1)   
    }
}

//2.Fibonacci Series
//Implement a function to generate the nth Fibonacci number using recursion and dynamic programming (memoization).
fun fibonacci(number: Int): Int{
    var prev = 0
    var curr = 1

    for(i in 2..number){
        val temp = curr
        curr = curr + prev
        prev = temp
    }

    return curr
}

//3.Palindrome Check
//Write a function that checks if a given string or number is a palindrome (reads the same forward and backward).
fun searchPalindrome(palindrome:String):Boolean{
    var start = 0
    var end = palindrome.length - 1
    while(start < end){
        if(palindrome[start] == palindrome[end]){ 
            start++
            end--
        }else{
            return false
        }
    }
    return true
}

//4.Prime Number Check
//Implement a function to check if a number is prime. Optimize it using the square root method.
fun isPrime(n:Int):Boolean{
    if( n <= 1 ) return false
    if( n == 2 ) return true
    if( n % 2 == 0) return false

    var i = 3
    while( i * i <= n){
    println("in while $i")
        if(n % i == 0) return false
        i =  i + 2
    }
    println("after while")
    return true
}

//5. Reverse a String
//Write a function that reverses a string using recursion and iteration.
fun reverseString(str: String):String{
    var result = ""
    val max = str.length-1
    for(i in max downTo 0){
        result = result+str[i]
    }
    return result
}

//6.Greatest Common Divisor (GCD)
//Implement the Euclidean algorithm to find the GCD of two numbers.

fun commonDivisorRecursive(one: Int, two: Int):Int{
    if(two == 0) return one
    return commonDivisorRecursive(two, one%two)
}

fun commonDivisor(one: Int, two: Int):Int{
    var a = one
    var b = two
    while(b != 0){
        val temp = b
        b = a % b
        a = temp
    }
    return a
}

//7.Power of a Number
//Write a function to calculate x^y using recursion and an optimized method (exponentiation by squaring).

fun powerOf(a:Int, b:Int):Int{
    /*var power = a
    for(i in 1..b-1){
        power = power*power
    }*/
    if(b==0) return 1
    else return a*powerOf(a, b-1)
}

//8.Array Rotation
//Implement a function to rotate an array by k positions to the right without using extra space.
fun rotateArray(arr: IntArray, k: Int): IntArray {
    var arrRotate = arr
    val n = arr.size
    if (n == 0) return arr
    val steps = k % n
    // Step 1: Reverse the whole array
    reverseArrayInPlace(arrRotate, 0, n - 1)
    // Step 2: Reverse the first k elements
    reverseArrayInPlace(arrRotate, 0, steps - 1)
    // Step 3: Reverse the remaining elements
    reverseArrayInPlace(arrRotate, steps, n - 1)
    return arrRotate
}

fun reverseArrayInPlace(arr: IntArray, a:Int, b: Int): IntArray {
    var start = a
    var end = b
    while (start < end) {
        val temp = arr[start]
        arr[start] = arr[end]
        arr[end] = temp
        start++
        end--
    }
    return arr
}

//9.Merge Two Sorted Arrays
//Given two sorted arrays, merge them into one sorted array without using extra space.
//TODO


//10.Find the Missing Number
//Given an array containing n-1 numbers from 1 to n, find the missing number using mathematical summation or XOR.
fun findMissingNumber(arr: IntArray):Int{
    val sizeOf = arr.size
    val sumOfAll = sizeOf*(sizeOf+1)/2
    var add = 0
    for(i in 0..sizeOf-1){
        add +=arr[i]
    }
    return sumOfAll-add
}