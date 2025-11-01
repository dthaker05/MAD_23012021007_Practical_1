fun main(){
    var a:Int=10
    var b:Double=a.toDouble()
    var c:String="10"
    var d:Int=c.toInt()
    var e:String = "10.12"

    println("integer:$a")
    println("double from int:$b")
    println("string:$c")
    println("int from string:$d")
    println("double from string:${e.toDouble()}")
}
