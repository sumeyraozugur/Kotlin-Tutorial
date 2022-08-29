import com.example.tutorial.BasicInfoProvider
import com.example.tutorial.Person

fun main(){
    val person = Person("Sum","Özugur")
    val provider = BasicInfoProvider()
    provider.printInfo(person)

    /*
    Output:
printInfo
the returned values is null
Sum, no nickname,Özugur
Additional print statement
     */



}


    


