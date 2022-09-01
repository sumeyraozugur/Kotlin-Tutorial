package com.example.tutorial

import java.util.*

enum class EntityType{
    EASY,HELP,MEDIUM,HARD;

    fun getFormattedToName()= name.toLowerCase().capitalize()
}

object EntityFactory{
    fun create(type: EntityType):Entity{
        val id = UUID.randomUUID().toString()
        val name = when(type){
            EntityType.EASY -> "Easy"
            EntityType.MEDIUM->type.name
            EntityType.HARD -> type.getFormattedToName()
            EntityType.HELP ->type.getFormattedToName()
        }
        return when(type){
            EntityType.EASY -> Entity.Easy(id,name)
            EntityType.MEDIUM->Entity.Medium(id, name)
            EntityType.HARD -> Entity.Hard(id,name, multiplier = 2f)
            EntityType.HELP ->Entity.Help

        }
    }
}

sealed class Entity(){

    object Help:Entity(){
        val name ="Help"
    }

    data class Easy(val id:String, val name:String):Entity()
    data class Medium(val id:String, val name:String):Entity()
    data class Hard(val id:String, val name:String,val multiplier:Float):Entity()

}

class Entityy(val id:String,val name:String) {
    override fun toString(): String {
        return "id:$id,name:$name"
    }
}

fun main(){
    val entity = EntityFactory.create(EntityType.EASY)
    val msg = when(entity){
        is Entity.Help -> "help class"
        is Entity.Easy -> "easy class"
        is Entity.Medium -> "medium class"
        is Entity.Hard -> "hard class"
    }
    println(msg)


    /*
    Output
id:ad51cbc8-2067-45f9-ab26-15f7ab483b71,name:Easy
id:58820094-bd81-4427-b647-dfb6b0357d05,name:MEDIUM
id:02b57d69-78c7-49f1-86da-6a38a394d1ad,name:Hard
     */
}