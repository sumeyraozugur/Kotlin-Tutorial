package com.example.tutorial

class Person(val firstName: String, val lastName: String) { //Primary constructor

    init {
        println("init 1")
    }

    //A class has most one primary constructor. and one or more has secondary constructors

    constructor():this("Sum","Öz"){ //Secondary constructor. it should delegate to primary constructor.
        println("Secondary constructor")
    }

    init {
        println("init 2")
    }

    /* Output
    init 1
    init 2
    Secondary constructor
     */

}