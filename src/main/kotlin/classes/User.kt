package classes

data class User (var name : String, val id : Int)

fun main(){
    val user = User("Praveen", 1)
    val secondUser = User("Pavan", 2)

    println(user)
    println(user.name)
    println(user==secondUser)
    println(user.hashCode())
    println(secondUser.hashCode())
}