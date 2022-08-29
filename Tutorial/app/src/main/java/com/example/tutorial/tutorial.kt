import com.example.tutorial.*

fun main(){
    val person = Person("Sum","Özugur")
    val provider = object :PersonInfoProvider{
        override val providerInfo: String
            get() = "New Info Object Provider"

        fun getSessionId()= "id"
    }


    println(provider.providerInfo)
    println(provider.getSessionId())




    /*
    Output:
New Info Object Provider
id



     */



}

fun checTypes(provider: PersonInfoProvider) {
    if(provider is SessionInfoProvider){
        println("is a session info provider")

    }else{
        println("not a session info provider")

    }


 }


    


