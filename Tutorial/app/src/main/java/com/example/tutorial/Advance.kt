fun printFilteredStrings(list:List<String>,predicate:(String) ->Boolean){
    list.forEach {
        if(predicate(it)){
            println(it)
         
        }
    }
}


fun main(){
    val list = listOf<String>("Sum","ey","ra")
    printFilteredStrings(list){
        it.startsWith("r")
    }

}