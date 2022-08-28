
fun sayHello(greeting:String, vararg itemsToGreet:String){

    itemsToGreet.forEach{ item ->
        println("$greeting,$item")

    }
}


fun main(){
    sayHello("Hi","Kotlin","Java","Go")
}


    


