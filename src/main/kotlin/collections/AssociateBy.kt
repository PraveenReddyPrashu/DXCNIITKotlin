package collections

class AssociateBy {
}
data class Person(val name : String, val city : String, val phone : Int)

val people = listOf<Person>(
    Person("Praveen","Kadapa",123456),
    Person("Pavan","Khajipet",456515),
    Person("Mohan","Hyderabad",484551),
    Person("Vinay","Bangalore",556552)
)
fun main() {
    val phoneBook = people.associateBy { it.city }
    println(phoneBook)
}