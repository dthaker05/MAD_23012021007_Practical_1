fun main(){
    var number = arrayListOf(1,2,3,4,5,6,7,8,9)
    var max=number[0]
    for (num in number){
        if (num>max){
            max=num
        }
    }
    println("Maximum number: $max")
}
