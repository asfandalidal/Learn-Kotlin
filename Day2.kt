//Program1 To find the largest num among three
fun findLargestNumber(num1: Int, num2: Int, num3: Int) {
    if (num1 == num2 && num1 == num3)
        print("All numbers are equal")
    else {
        if (num1 > num2 && num1 > num3)
            print("$num1 is the largest")
        else if (num2 > num1 && num2 > num3)
            print("$num2 is the largest")
        else
            println("$num3 is the largest")
    }
}
 // Program2 To check leap year
fun checkLeapYear(year: Int): Boolean {
    return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)
}