package classes

class Company {
    var news : String = "Company is launching a new project"
    companion object Media {
        fun broadcastNews(){//like static method
            println("company news")
        }
    }
}

fun main(){
    Company.broadcastNews()
}