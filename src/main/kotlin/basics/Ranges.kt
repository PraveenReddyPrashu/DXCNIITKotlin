package basics

class Ranges {
}


fun main(){
    val z = 2;
    val y = 6
for (x in 10 downTo 1 step 3) println(x)
    if(z in 3..y){
        println("x is in the range")
    }
    else{
        println("Not in the range")
    }

    fun1(z)
}

fun fun1(a : Int){
    when (a){
       in 1..10 -> println("its in 10s")
       in 100..999 -> println("its in 100s")
       in 999..9999 -> println("its in 1000s")
    }
}