package com.example.tutorial

class FancyInfoProvider:BasicInfoProvider() {

    override val providerInfo: String
        get() = "Fancy Info Provider"


    override fun printInfo(person: Person) {
        super.printInfo(person)
        println("FancyInfo")
    }
}