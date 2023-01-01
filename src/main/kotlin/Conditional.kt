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

    val str1: String = "Madam"
    val str2: String = "Madam"

    if(str1 == str2) println("Same value") else println("Different value")
    if(str1===str2) println("Same address") else println("Different address")
}