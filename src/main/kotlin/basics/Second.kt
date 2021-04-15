package basics

class Second{

}

fun main() {
    var a = 1;
    var name = "Praveen $a"
    var age = 21
    var sentence = "${name.replace("Praveen","Praveen Reddy")}"
    println(sentence)
    println(maxOfNumbers(a, age))
    println(minOfNumbers(a, age))

    val items = listOf("Praveen", "Pavan", "Mohan")
    for (item in items) {
        println(item)
    }
    for (index in items.indices){
        println("${items[index]} is at $index")
    }
    var index = 0
    while (index < items.size){
        println("${items[index]} is at $index")
    }
}


fun maxOfNumbers(a : Int, b : Int) : Int{
    if(a>b) return a
    else return b
}


fun minOfNumbers(a : Int, b : Int) : Int {
    if(a<b) return a
    else return b
}