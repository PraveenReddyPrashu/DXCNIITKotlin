package basics

class Nullable {
}


fun main() {
    var name : String = "my name is "
    val s2 : String? = "can be null or not"
    println(s2?.length)
    println(name.length)
}