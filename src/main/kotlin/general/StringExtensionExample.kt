package org.example.general

class StringExtensionExample {

    fun stringExtensionSample() {
        // Convert to uppercase
        var text = "Hello World"
        println(text.uppercase()) // "HELLO WORLD"

        // Convert to lowercase
        text = "HELLO WORLD"
        println(text.lowercase()) // "hello world"

        // Deprecated: Use uppercase() instead
        text = "hello"
        println(text.uppercase()) // "HELLO"

        // Deprecated: Use lowercase() instead
        text = "HELLO"
        println(text.lowercase()) // "hello"

        text = "hello world"
        println(text.capitalize()) // "Hello world"

        text = "Hello World"
        println(text.decapitalize()) // "hello World"

        // Remove leading and trailing whitespace
        text = "  Hello World  "
        println(text.trim()) // "Hello World"

        // Remove characters matching condition
        text = "###Hello World###"
        println(text.trim { it == '#' }) // "Hello World"

        // Remove specific characters
        text = "...Hello World..."
        println(text.trim('.')) // "Hello World"

        // Remove leading whitespace
        text = "  Hello World  "
        println(text.trimStart()) // "Hello World  "

        // Remove leading characters matching condition
        text = "###Hello World###"
        println(text.trimStart { it == '#' }) // "Hello World###"

        // Remove specific leading characters
        text = "...Hello World..."
        println(text.trimStart('.')) // "Hello World..."

        // Remove trailing whitespace
        text = "  Hello World  "
        println(text.trimEnd()) // "  Hello World"

        // Remove trailing characters matching condition
        text = "###Hello World###"
        println(text.trimEnd { it == '#' }) // "###Hello World"

        // Remove specific trailing characters
        text = "...Hello World..."
        println(text.trimEnd('.')) // "...Hello World"

        // Pad at the beginning
        text = "123"
        println(text.padStart(6)) // "   123"

        // Pad at the end
        text = "123"
        println(text.padEnd(6)) // "123   "

        // Check if null or empty
        var nullString: String? = null
        println(nullString.isNullOrEmpty()) // true

        // Check if empty
        var empty = ""
        println(empty.isEmpty()) // true

        // Check if not empty
        text = "Hello"
        println(text.isNotEmpty()) // true

        // Check if blank
        var spaces = "   "
        println(spaces.isBlank()) // true

        // Check if not blank
        text = "Hello"
        println(text.isNotBlank()) // true

        // Check if null or blank
        nullString  = null
        println(nullString.isNullOrBlank()) // true

        // Get string or empty if null
        nullString = null
        println(nullString.orEmpty()) // ""

        // Provide default if empty
        empty = ""
        println(empty.ifEmpty { "Default" }) // "Default"

        // Provide default if blank
        spaces = "   "
        println(spaces.ifBlank { "Default" }) // "Default"

        // Get substring by range
        text = "Hello World"
        println(text.substring(0..4)) // "Hello"

        // Get substring by indices
        println(text.substring(0, 5)) // "Hello"

        // Get subsequence by range
        val sub = text.subSequence(0..4)
        println(sub) // "Hello"

        // Get text before first occurrence
        var email = "user@example.com"
        println(email.substringBefore('@')) // "user"

        // Get text after first occurrence
        println(email.substringAfter('@')) // "example.com"

        // Get text before last occurrence
        var path = "/home/user/documents/file.txt"
        println(path.substringBeforeLast('/')) // "/home/user/documents"

        // Get text after last occurrence
        println(path.substringAfterLast('/')) // "file.txt"

        // Replace range with text (by indices)
        text = "Hello World"
        println(text.replaceRange(6, 11, "Kotlin")) // "Hello Kotlin"

        // Replace range with text (by range)
        println(text.replaceRange(0..4, "Hi")) // "Hi World"

        // Remove range of characters (by indices)
        println(text.removeRange(5, 6)) // "HelloWorld"

        // Remove range of characters (by range)
        println(text.removeRange(0..5)) // "World"

        // Remove prefix if present
        text = "Hello World"
        println(text.removePrefix("Hello ")) // "World"

        // Remove suffix if present
        val filename = "document.txt"
        println(filename.removeSuffix(".txt")) // "document"

        // Remove prefix and suffix
        text = "[Hello World]"
        println(text.removeSurrounding("[", "]")) // "Hello World"

        // Remove same delimiter from both sides
        val quoted = "'Hello World'"
        println(quoted.removeSurrounding("'")) // "Hello World"

        // Replace before delimiter
        email = "user@example.com"
        println(email.replaceBefore("@", "admin")) // "admin@example.com"

        // Replace after delimiter
        email = "user@old.com"
        println(email.replaceAfter("@", "new.com")) // "user@new.com"

        // Replace after last delimiter
        path = "/home/user/old.txt"
        println(path.replaceAfterLast("/", "new.txt")) // "/home/user/new.txt"

        // Replace before last delimiter
        path = "/old/path/file.txt"
        println(path.replaceBeforeLast("/", "/new/path")) // "/new/path/file.txt"

        // Replace using regex
        text = "Hello 123 World 456"
        println(text.replace(Regex("\\d+"), "XXX")) // "Hello XXX World XXX"

        // Replace using regex with transform function
        val result = text.replace(Regex("\\d+")) { match ->
            "Number(${match.value})"
        }
        println(result) // "Hello Number(123) World Number(456)"

        // Replace first regex match
        println(text.replaceFirst(Regex("\\d+"), "XXX")) // "Hello XXX World 456"

        // Transform first character to Char
        text = "hello world"
        println(text.replaceFirstChar { it.uppercase().first() }) // "Hello world"

        // Transform first character to CharSequence
        text = "hello"
        println(text.replaceFirstChar { "[${it.uppercase()}]" }) // "[H]ello"

        // Split by string delimiters
        text = "apple,banana;orange"
        println(text.split(",", ";")) // ["apple", "banana", "orange"]

        // Split by character delimiters
        text = "a,b;c:d"
        println(text.split(',', ';', ':')) // ["a", "b", "c", "d"]

        // Split by regex
        text = "apple123banana456orange"
        println(text.split(Regex("\\d+"))) // ["apple", "banana", "orange"]

        // Split to sequence by strings
        var sequence = text.splitToSequence(",")
        sequence.forEach { println(it) }

        // Split to sequence by chars
        text = "a,b,c,d,e"
        sequence = text.splitToSequence(',')
        println(sequence.take(3).toList()) // ["a", "b", "c"]

        // Split to sequence by regex
        text = "word1 word2  word3   word4"
        sequence = text.splitToSequence(Regex("\\s+"))
        println(sequence.toList()) // ["word1", "word2", "word3", "word4"]

        // Split into lines as sequence
        var multiline = "Line 1\nLine 2\r\nLine 3\rLine 4"
        multiline.lineSequence().forEach { println("[$it]") }

        // Split into lines as list
        multiline = "Line 1\nLine 2\r\nLine 3"
        val lines = multiline.lines()
        println(lines) // ["Line 1", "Line 2", "Line 3"]

        // Convert to boolean (strict)
        println("true".toBooleanStrict()) // true

        // Convert to boolean or null
        println("yes".toBooleanStrictOrNull()) // null
    }
}