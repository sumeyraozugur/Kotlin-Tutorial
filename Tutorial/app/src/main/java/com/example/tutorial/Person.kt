package com.example.tutorial

class Person(val firstName: String, val lastName: String) {

    var nickName:String ?= null
        set(value) {
            field = value
            println("the new nickname is $value")
        }
        get() {
            println("the returned values is $field")
            return field
        }

    fun println(){
        val nicNameToPrint = nickName ?: "no nickname"
        println("$firstName, $nicNameToPrint,$lastName")
    }


}

interface PersonInfoProvider{
    val providerInfo:String
    fun printInfo(person:Person){
        println("printInfo")
        person.println()
    }
}

interface SessionInfoProvider{
    fun getSessionId():String
}

class BasicInfoProvider:PersonInfoProvider,SessionInfoProvider {

    override val providerInfo: String
        get() = "BasicInfoProvider"

    override fun printInfo(person: Person) {
        super.printInfo(person)
        println("Additional print statement")
    }

    override fun getSessionId(): String {
        return "Session"
    }


}