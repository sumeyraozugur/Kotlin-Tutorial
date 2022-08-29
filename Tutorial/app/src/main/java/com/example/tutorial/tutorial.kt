import com.example.tutorial.*

fun main(){
    val person = Person("Sum","Özugur")
    val provider = FancyInfoProvider()
    provider.printInfo(person)
    provider.getSessionId()

    checTypes(provider)

    /*
    Output:
printInfo
the returned values is null
Sum, no nickname,Özugur
Additional print statement
FancyInfo
is a session info provider



     */



}

fun checTypes(provider: PersonInfoProvider) {
    if(provider is SessionInfoProvider){
        println("is a session info provider")

    }else{
        println("not a session info provider")
        (provider as SessionInfoProvider).getSessionId()
    }


 }


    


