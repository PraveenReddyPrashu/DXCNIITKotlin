package collections

class Maps {
}

val passedStudents : MutableMap<Int, String> = mutableMapOf()

fun main(){
    passedStudents.put(1,"Praveen")
    passedStudents.put(2,"Pavan")
    passedStudents.put(3,"Mohan")
    passedStudents.put(4,"Vinay")
    passedStudents.put(5,"Kiran")
    passedStudents.put(6,"Naveen")
    passedStudents.put(7,"Ajay")
    passedStudents.put(8,"Arjun")
    passedStudents.put(9,"Sateesh")

    println(passedStudents)
    println(passedStudents.keys)
    println(passedStudents.filterValues { x -> x.startsWith("A") })
}