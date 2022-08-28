
fun sayHello(greeting:String, itemsToGreet:List<String>){

    itemsToGreet.forEach{ item ->
        println("$greeting,$item")


    }



}


fun main(){

    val interestingThings = listOf("kotlin","java","python") // you dont add anythings
    sayHello("Hi",interestingThings)





}


    


