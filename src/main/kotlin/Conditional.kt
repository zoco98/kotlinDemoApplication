fun main(args: Array<String>){
    /*the if-else blocks are same as java in kotlin also
    * if we want to use nested if else it will same as java in syntax
    * but kotlin gives the conciseness when it comes to one line if block
    * let's see with examples
    */

    //if-else blocks
    val totMarks: Int = 70
    if (totMarks<40){
        println("fail")
    }else if (totMarks<=60 && totMarks>=40){
        println("passed")
    }
    else if (totMarks<=80 && totMarks>=60){
        println("ranked first")
    }else{
        println("not found 404 error")
    }

    //single line if-- we can write in one line called one-liner which is more readable
    val num: Double = Math.random();
    if (num.toString().isNotEmpty()) println("$num is random number") else println("that's impossible")

    /*unlike java string having same value in kotlin also
    * holds same address or refrencial value
    * as well as different for different value
    * == or .equal() for structural equality -- != structural inequality
    * and === used for referencial equality -- !== referencial inequality
    */
    val str1: String = "madam"
    val str2: String = "madam"

    if(str1 == str2) println("Same value") else println("Different value")
    if(str1 === str2) println("Same address") else println("Different address")

    val str3: String = "Heavy"
    val str4: String = "Low"

    if(str3 == str4) println("Same value") else println("Different value")
    if(str3 === str4) println("Same address") else println("Different address")

    val i: Int = 11
    val j: Int = 11

    if(i == j) println("Same value") else println("Different value")
    if(i === j) println("Same address") else println("Different address")

    /*But lets see obj creation
    * so exceptions see...
    * whatever the value would be the objects has
    * distinct refernce for each */
    val frstP = Person("Sriparna")
    val scndP = Person("Sriparna")
    val thrdP = Person("Ayantika")
    println(frstP===scndP)
    println(frstP==scndP)
    println(frstP===thrdP)
    println(frstP==thrdP)
}
class Person(
    var name: String
)