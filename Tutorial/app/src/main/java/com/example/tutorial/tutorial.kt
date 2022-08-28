fun main(){

    val interestingThings = arrayOf("kotlin","java","python")
    interestingThings.size //3
    interestingThings[0] //kotlin
    interestingThings.get(0)// kotlin


    interestingThings.forEachIndexed { index, interestingThing ->
        println("$interestingThing is at index $index")  // kotlin is at index 0 ...
    }

}


    


