import com.example.tutorial.BasicInfoProvider
import com.example.tutorial.Person
import com.example.tutorial.PersonInfoProvider
import com.example.tutorial.SessionInfoProvider

fun main(){
    val person = Person("Sum","Özugur")
    val provider = BasicInfoProvider()
    provider.printInfo(person)
    provider.getSessionId()

    checTypes(provider)

    /*
    Output:

printInfo
the returned values is null
Sum, no nickname,Özugur
Additional print statement
is a session info provider


     */



}

fun checTypes(provider: PersonInfoProvider) {
    if(provider is SessionInfoProvider){
        println("is a session info provider")

    }else{
        println("not a session info provider")
    }


 }


    


