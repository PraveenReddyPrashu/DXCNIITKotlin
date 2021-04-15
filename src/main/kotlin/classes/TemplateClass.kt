package classes

import java.util.*

class TemplateClass {
    fun getNumber(){
        var objRandom = Random()
        println(objRandom.nextInt(90))
    }
}

fun main(){
    val t1 = TemplateClass()
    val t2 = TemplateClass()
    t1.getNumber()
    t2.getNumber()
}