/**
 * program1: sum two numbers
print("Enter number 1: ");
val num1 = readln().toIntOrNull()
print("Enter number 2: ")
val num2 = readln().toIntOrNull()
if(num1 == null || num2 == null)
{
print("null or char is not allowed")
}
else {
val sum = num1.plus(num2)
print("Sum is $sum")
}

// program2: multiply two floating numbers
val num1 = 5.4f
val num2 = 2.4f
val product = num1 * num2
println(num1)
print("Product: $product")

// program3: To find ASCII value
print("Enter a character: ")
val character = readln()
val alphabet = character.toCharArray()
for (i in alphabet)
{
println("ASCII values of $i is ${i.code}")
}

// Program4: To swap number x and y with another var
var num1 = 10
var num2= 20
println("before swapping num1 = ${num1} & num2 =  ${num2}")
var temp = num1 // temp = 10
num1 = num2 // num1 = 20
num2 = temp //num2 = 10
println("After swapping num1 = $num1 & num2 = $num2")

//Program5: Find Frequency of Character
var str = "this website is awesome"
var ch = 'i'
var frequency = 0
for (i in 0..str.length-1)
{
if (str[i] == ch)
{
++frequency
}
}
println("frequency of $ch is $frequency")

Program6:Check whether an alphabet is vowel or consonant using if..else
print("Enter a character from alphabets: ")
val input = readlnOrNull()?.trim()
if (input.isNullOrBlank() || input.length != 1) {
println("please enter exactly one character")
return
}
val char = input[0].lowercaseChar()
if (char !in 'a'..'z')
println("please enter only a-z/A-Z")
else if (char in listOf('a', 'e', 'i', 'o', 'u'))
println("$char is vowel")
else
println("$char is consonant")


 **/