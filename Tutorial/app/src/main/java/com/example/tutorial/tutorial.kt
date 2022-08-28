
var greeting:String ?=null

fun main(){

    greeting = "Welcome"
    val greetingToPrint = when(greeting){
        null ->  "Hi"
        else -> greeting
    }
    println(greetingToPrint)

    


}