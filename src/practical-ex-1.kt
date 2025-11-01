fun main() {
    var a = 10
    var b = 20

    println("with using third variable:")
    println("Before Swapping:The value of a is:$a and Value of B is:$b")

    var temp = a
    a = b
    b = temp

    println("After swapping:The value of a is:$a and Value of B is:$b")
    println("*****")

    // Without third variable
    a = 10
    b = 20
    println("Without using Third Variable:")
    println("Before Swapping:The value of a is:$a and Value of B is:$b")

    a = a + b
    b = a - b
    a = a - b

    println("After swapping:The value of a is:$a and Value of B is:$b")
}
