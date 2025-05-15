package org.example.general

import kotlin.random.Random

class FiftyOneLiners {

// 1. Check if a String is Empty or Blank
    val myString:String = ""
    val isEmpty = myString.isNullOrBlank() 
// Explanation: 
// This one-liner checks if a string is either null, empty, or contains only whitespace. It's a more concise and Kotlin-idiomatic way of checking a string's state than using isNullOrEmpty(). 

// Example:
// val message = "   " 
// println(message.isNullOrBlank()) // true 
    
// 2. Safe Call Operator 
    val length = myString?.length
// Explanation: 
// The ?. operator is a safe call operator. It allows you to call methods or access properties on a nullable object without throwing a NullPointerException. If myString is null, length will be null. 

// Example:
// val message: String? = null 
// println(message?.length) // null

// 3. Elvis Operator
    val length3 = myString?.length ?: 0
// Explanation: 
// The Elvis operator (?:) provides a default value when the result of a nullable expression is null. In this case, if myString is null, the default value 0 is returned. 

// Example:
// val message: String? = null 
// println(message?.length ?: 0) // 0 

// 4. Check if a List is Empty
    val myList:List<Int> = ArrayList(List(10) { Random.nextInt() })
    val isEmptyList = myList.isEmpty()
// Explanation: 
// This is a simple one-liner to check if a list is empty. Kotlin provides built-in functions like isEmpty() to make code more readable. 

// Example:
// val myList = listOf<Int>() 
// println(myList.isEmpty()) // true

// 5. Find the Maximum Element in a List
    val maxElement = myList.maxOrNull()
// Explanation: 
// maxOrNull() returns the maximum element in a list or null if the list is empty. This is a safe and concise way to find the maximum value in a list. 

// Example:
// val numbers = listOf(1, 5, 3, 9) 
// println(numbers.maxOrNull()) // 9

// 6. Find the Minimum Element in a List
    val minElement = myList.minOrNull()
// Explanation: 
// Similar to maxOrNull(), minOrNull() finds the minimum element in a list or returns null if the list is empty. 

// Example:
// val numbers = listOf(4, 1, 7, 0) 
// println(numbers.minOrNull()) // 0 

// 7. Reverse a List
     val reversedList = myList.reversed()
// Explanation: 
// reversed() returns a new list with the elements in reverse order. 

// Example:
// val numbers = listOf(1, 2, 3) 
// println(numbers.reversed()) // [3, 2, 1]

// 8. Sort a List in Ascending Order
    val sortedList = myList.sorted()
// Explanation: 
// sorted() sorts the list in ascending order. It returns a new list with the elements sorted. 

// Example:
// val numbers = listOf(3, 1, 2) 
// println(numbers.sorted()) // [1, 2, 3]

// 9. Sort a List in Descending Order
    val sortedDescendingList = myList.sortedDescending()
// Explanation: 
// sortedDescending() sorts the list in descending order. 

// Example:
// val numbers = listOf(3, 1, 2) 
// println(numbers.sortedDescending()) // [3, 2, 1]

// 10. Sum All Elements in a List
    val sumOfList = myList.sum()
// Explanation: 
// sum() returns the sum of all elements in a list of numbers. 

// Example:
// val numbers = listOf(1, 2, 3, 4) 
// println(numbers.sum()) // 10 

// 11. Filter List for Even Numbers
    val evenNumbers = myList.filter { it % 2 == 0 }
// Explanation: 
// filter is a powerful function that filters the list based on the provided condition. 

// Example:
// val numbers = listOf(1, 2, 3, 4) 
// println(numbers.filter { it % 2 == 0 }) // [2, 4] 

// 12. Map List to Square of Each Element
    val squares = myList.map { it * it }
// Explanation: 
// map transforms each element in the list using the provided lambda expression. 

// Example:
// val numbers = listOf(1, 2, 3) 
// println(numbers.map { it * it }) // [1, 4, 9] 

// 13. Join List Elements into a String
    val joined = myList.joinToString(", ")
// Explanation: 
// joinToString() converts the elements of a list into a string, with a separator between each element. 

// Example:
// val names = listOf("Alice", "Bob", "Charlie") 
// println(names.joinToString(", ")) // "Alice, Bob, Charlie" 

// 14. Check if Any Element in List Satisfies a Condition
    val hasEven = myList.any { it % 2 == 0 }
// Explanation: 
// any() checks if at least one element in the list satisfies the given condition. 

// Example:
// val numbers = listOf(1, 2, 3) 
// println(numbers.any { it % 2 == 0 }) // true 

// 15. Check if All Elements in List Satisfy a Condition
    val allEven = myList.all { it % 2 == 0 }
// Explanation: 
// all() checks if all elements satisfy the given condition. 

// Example:
// val numbers = listOf(2, 4, 6) 
// println(numbers.all { it % 2 == 0 }) // true 

// 16. Convert a List of Strings to Uppercase
    val stringList:List<String> = ArrayList(List(10) { Random.nextInt().toString() })
    val upperCaseList = stringList.map { it.uppercase() }
// Explanation: 
// map() is used here to transform each element in the list into its uppercase version. 

// Example:
// val words = listOf("hello", "world") 
// println(words.map { it.toUpperCase() }) // ["HELLO", "WORLD"] 

// 17. Get the First Element of a List
    val first = myList.firstOrNull()
// Explanation: 
// firstOrNull() returns the first element or null if the list is empty. 

// Example:
// val numbers = listOf(1, 2, 3) 
// println(numbers.firstOrNull()) // 1 

// 18. Get the Last Element of a List
    val last = myList.lastOrNull()
// Explanation: 
// lastOrNull() returns the last element or null if the list is empty. 

// Example:
// val numbers = listOf(1, 2, 3) 
// println(numbers.lastOrNull()) // 3 

// 19. Check if a String is a Valid Email
    val isValidEmail = myString.matches(Regex("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$"))
// Explanation: 
// This uses Kotlin's powerful Regex to match an email pattern in a string. 

// Example:
// val email = "test@example.com" 
// println(email.matches(Regex("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$"))) // true 

// 20. Create a Pair
    val myPair = Pair("Hello", 42)
// Explanation: 
// Pair is a standard Kotlin class for holding two values together. 

// Example:
// val pair = Pair("apple", 10) 
// println(pair.first) // apple 
// println(pair.second) // 10 

// 21. Create a Triple
    val myTriple = Triple("Kotlin", 2024, true)
// Explanation: 
// Triple is similar to Pair, but it can hold three values. 

// Example:
// val triple = Triple("Kotlin", 2024, true) 
// println(triple.first) // Kotlin 
// println(triple.second) // 2024 
// println(triple.third) // true 

// 22. Check if a Value is in a Range
    val value = 11
    val isInRange = value in 1..10
// Explanation: 
// This checks if a value is within a specified range, inclusive of both ends. 

// Example:
// val value = 5 
// println(value in 1..10) // true 

// 23. Shuffle a List
    val shuffledList = myList.shuffled()
// Explanation: 
// shuffled() returns a new list with the elements in a random order. 

// Example:
// val numbers = listOf(1, 2, 3, 4) 
// println(numbers.shuffled()) // Randomized list 

// 24. Remove Duplicates from a List
    val uniqueList = myList.distinct()
// Explanation: 
// distinct() removes duplicate elements from a list. 

// Example:
// val numbers = listOf(1, 2, 2, 3, 3) 
// println(numbers.distinct()) // [1, 2, 3] 

// 25. Count Elements that Satisfy a Condition
    val count = myList.count { it > 10 }
// Explanation: 
// count() returns the number of elements that satisfy the given condition. 

// Example:
// val numbers = listOf(5, 15, 20, 3) 
// println(numbers.count { it > 10 }) // 2 

// 26. FlatMap List of Lists into a Single List
    val nestedList = listOf(listOf(1, 2), listOf(3, 4))
    val flattenedList = nestedList.flatMap { it }
// Explanation: 
// flatMap() transforms a list of lists into a single list by concatenating all the elements. 

// Example:
// val nestedList = listOf(listOf(1, 2), listOf(3, 4)) 
// println(nestedList.flatMap { it }) // [1, 2, 3, 4] 

// 27. Convert List of Integers to List of Strings
    val stringIntList = myList.map { it.toString() }
// Explanation: 
// map() is used here to transform a list of integers into a list of their string representations. 

// Example:
// val numbers = listOf(1, 2, 3) 
// println(numbers.map { it.toString() }) // ["1", "2", "3"] 

// 28. Combine Two Lists into a Map
    val listOfKeys = listOf("a", "b", "c")
    val listOfValues = listOf(1, 2, 3)
    val map = listOfKeys.zip(listOfValues).toMap()
// Explanation: 
// zip() combines two lists element-wise, and toMap() turns the result into a map. 

// Example:
// val keys = listOf("a", "b", "c") 
// val values = listOf(1, 2, 3) 
// println(keys.zip(values).toMap()) // {a=1, b=2, c=3} 

// 29. Get the Index of an Element in a List
    val element = 5
    val index = myList.indexOf(element)
// Explanation: 
// indexOf() returns the first index of an element in a list, or -1 if it's not found. 

// Example:
// val numbers = listOf(5, 10, 15) 
// println(numbers.indexOf(10)) // 1 

// 30. Convert a List to a Set
    val set = myList.toSet()
// Explanation: 
// toSet() converts a list to a set, removing any duplicates. 

// Example:
// val numbers = listOf(1, 2, 2, 3, 4) 
// println(numbers.toSet()) // [1, 2, 3, 4] 

// 31. Find First Matching Element in a List
    val firstMatch = myList.find { it > 10 }
// Explanation: 
// find() returns the first element that satisfies the condition or null if none are found. 

// Example:
// val numbers = listOf(1, 5, 10, 15) 
// println(numbers.find { it > 10 }) // 15 

// 32. Sum of a List with a Custom Condition
    val sum = myList.filter { it % 2 == 0 }.sum()
// Explanation: 
// This combines filter() and sum() to compute the sum of all even numbers in the list. 

// Example:
// val numbers = listOf(1, 2, 3, 4) 
// println(numbers.filter { it % 2 == 0 }.sum()) // 6 

// 33. Group List Elements by a Key
    val grouped = myList.groupBy { it % 2 == 0 }
// Explanation: 
// groupBy() groups elements based on the key returned by the lambda. 

// Example:
// val numbers = listOf(1, 2, 3, 4) 
// println(numbers.groupBy { it % 2 == 0 }) // {false=[1, 3], true=[2, 4]} 

// 34. Repeat an Action a Specific Number of Times
fun repeatExample(){
    repeat(5) { println("Hello, Kotlin!") }
}
// Explanation: 
// repeat() executes the given action a specified number of times. 

// Example:
// repeat(3) { println("Welcome!") } 
// // Output: 
// // Welcome! 
// // Welcome! 
// // Welcome!

// 35. Convert a String to a List of Characters
    val charList = myString.toList()
// Explanation: 
// toList() converts a string to a list of individual characters. 

// Example:
// val str = "Kotlin" 
// println(str.toList()) // ['K', 'o', 't', 'l', 'i', 'n'] 

// 36. Check if a Map Contains a Specific Key
    val myMap = mapOf("a" to 1, "b" to 2)
    val containsKey = myMap.containsKey("key")
// Explanation: 
// containsKey() checks if a map contains a specific key. 

// Example:
// val map = mapOf("a" to 1, "b" to 2) 
// println(map.containsKey("a")) // true 

// 37. Check if a Map Contains a Specific Value
    val containsValue = myMap.containsValue(2)
// Explanation: 
// containsValue() checks if a map contains a specific value. 

// Example:
// val map = mapOf("a" to 1, "b" to 2) 
// println(map.containsValue(2)) // true

// 38. Remove an Element from a Map
    val updatedMap = myMap.minus("key")
// Explanation: 
// minus() creates a new map excluding the specified key-value pair. 

// Example:
// val map = mapOf("a" to 1, "b" to 2) 
// println(map.minus("a")) // {b=2} 

// 39. Create a Singleton List
    val singletonList = listOf(value)
// Explanation: 
// listOf() creates a list containing a single element. 

// Example:
// val singleton = listOf(42) 
// println(singleton) // [42] 

// 40. Create a Range of Numbers
    val range = 1..10
// Explanation: 
// .. creates a range from 1 to 10, inclusive.

// Example:
// val range = 1..10 
// println(range.contains(5)) // true 

// 41. Convert an Object to a String
    val myObject = 42
    val str = myObject.toString()
// Explanation: 
// toString() converts an object to its string representation. 

// Example:
// val obj = 42 
// println(obj.toString()) // "42" 

// 42. Create a Map from Two Lists
    val keys = listOf("a", "b", "c")
    val values = listOf(1, 2, 3)
    val map42 = keys.zip(values).toMap()
// Explanation: 
// zip() combines two lists into pairs, which is then converted to a map. 

// Example:
// val keys = listOf("a", "b", "c") 
// val values = listOf(1, 2, 3) 
// println(keys.zip(values).toMap()) // {a=1, b=2, c=3} 

// 43. Find the First Non-null Element
    val firstNonNull = listOf("a", null, "b").firstNotNullOf { it }
// Explanation: 
// firstNotNullOf() finds the first non-null element in a collection. 

// Example:
// val list = listOf("a", null, "b") 
// println(list.firstNotNullOf { it }) // "a" 

// 44. Create a Set from a List
fun setExample() {
    var setList: ArrayList<Int> = ArrayList(List(10) { Random.nextInt() })
    setList.toSet() //List.toSet()
}

// ### Explanation: 
// `toSet()` converts a list to a set, removing duplicates. 
// ### Example: 
// ```kotlin 
// val numbers = listOf(1, 2, 2, 3, 4) 
// println(numbers.toSet()) // [1, 2, 3, 4] 
// 45. Flatten a List of Lists 
 
// val flattened = listOf(listOf(1, 2), listOf(3, 4)).flatten() 
// Explanation: 
// flatten() combines a list of lists into a single list. 

// Example:
// val nested = listOf(listOf(1, 2), listOf(3, 4)) 
// println(nested.flatten()) // [1, 2, 3, 4]

// 46. Get the Current Time
    val currentTime = System.currentTimeMillis()
// Explanation: 
// System.currentTimeMillis() returns the current system time in milliseconds. 

// Example:
// println(System.currentTimeMillis()) // Prints current time in ms

// 47. Check if List is Not Empty
    val isNotEmpty = myList.isNotEmpty()
// Explanation: 
// isNotEmpty() checks if a list contains at least one element. 

// Example:
// val list = listOf(1, 2, 3) 
// println(list.isNotEmpty()) // true

// 48. Take a Sublist
    val subList = myList.take(3)
// Explanation: 
// take() returns the first n elements from a list. 

// Example:
// val numbers = listOf(1, 2, 3, 4) 
// println(numbers.take(3)) // [1, 2, 3]

// 49. Get a Random Element from a List
    val randomElement = myList.random()
// Explanation: 
// random() returns a random element from a list. 

// Example:
// val numbers = listOf(1, 2, 3, 4) 
// println(numbers.random()) // Random element

// 50. Convert String to Int
    val num = myString.toIntOrNull() ?: 0
// Explanation: 
// toIntOrNull() converts a string to an integer or returns null if it can't be parsed. The Elvis operator ?: handles this case by returning 0 as a fallback. 

// Example:
// val str = "42" 
// println(str.toIntOrNull() ?: 0) // 42

}