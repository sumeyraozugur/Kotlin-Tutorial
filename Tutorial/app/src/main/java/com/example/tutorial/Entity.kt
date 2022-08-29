package com.example.tutorial

import java.util.*

enum class EntityType{
    EASY,MEDIUM,HARD
}

object EntityFactory{
    fun create(type: EntityType):Entity{
        val id = UUID.randomUUID().toString()
        val name = when(type){
            EntityType.EASY -> "Easy"
            EntityType.MEDIUM->type.name
            EntityType.HARD -> "Hard"
        }
        return  Entity(id,name)
    }
}

class Entity(val id:String,val name:String) {
    override fun toString(): String {
        return "id:$id,name:$name"
    }
}

fun main(){
    val entity = EntityFactory.create(EntityType.EASY)
    val entity2 = EntityFactory.create(EntityType.MEDIUM)
    val entity3 = EntityFactory.create(EntityType.HARD)
    println(entity)
    println(entity2)
    println(entity3)

    /*
    Output
id:ad51cbc8-2067-45f9-ab26-15f7ab483b71,name:Easy
id:58820094-bd81-4427-b647-dfb6b0357d05,name:MEDIUM
id:02b57d69-78c7-49f1-86da-6a38a394d1ad,name:Hard
     */
}