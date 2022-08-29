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