package basics

class Rectangle(var height : Int, width : Int) {
    var perimeter = 2 * (height+width)
}

fun main(){
    var rectangle = Rectangle(5,6)
    println("perimeter of rectangle is ${rectangle.perimeter}")
    println("hello world")
    var c = add(10, 20);
    print(c)
}

fun add(a : Int, b : Int) : Int {
    return a+b
}