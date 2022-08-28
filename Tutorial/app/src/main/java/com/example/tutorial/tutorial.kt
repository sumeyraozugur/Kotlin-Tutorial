fun main(){

    val interestingThings = arrayOf("kotlin","java","python")
    println(interestingThings.size) //3
    println(interestingThings[0]) //kotlin
    println(interestingThings.get(0)) // kotlin


    for (interestingThings in interestingThings){
        println(interestingThings) // kotlin, java,python
    }

    //Best way
    interestingThings.forEach {
        println(it) // kotlin, java, python
    }

}


    


