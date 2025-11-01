fun calculator(a:Int, b:Int, oprator: Char):Int{
    if (oprator=='+') return (a+b).toInt()
    else if (oprator=='-') return (a-b).toInt()
    else if (oprator=='*') return (a*b).toInt()
    else if (oprator=='/') return (a/b).toInt()
    else return 0
}
fun main(){
    print("Enter first value:")
    var a= readln().toInt()
    print("Enter second value:")
    var b= readln().toInt()
    print("Enter opration:")
    var c= readln()[0]
    print("result=")
    print(calculator(a,b,c))
}
