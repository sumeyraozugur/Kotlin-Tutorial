fun main(){

    val interestingThings = listOf("kotlin","java","python") // you dont add anythings
    val interestingThings1 = mutableListOf("kotlin","java","python") // you can add somethings
    interestingThings1.add("Go")


    val map= mapOf(1 to "a", 2 to "b",3 to "c")// you dont add anythings
    map.forEach{(key, value) -> println("$key -> $value")}

    val map1= mutableMapOf(1 to "a", 2 to "b",3 to "c")// you dont add anythings
    map1.put(4,"d")// you can add somethings
    map1.forEach{(key, value) -> println("$key -> $value")}

}


    


