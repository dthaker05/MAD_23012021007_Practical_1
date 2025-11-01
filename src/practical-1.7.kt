fun fact(a:Int):Int{
    return if (a<=1) 1 else a*fact(a-1)
}
fun main(){
    print("Enter number:")
    var a= readln().toInt()
    print("factorial of $a =")
    print(fact(a))
}
