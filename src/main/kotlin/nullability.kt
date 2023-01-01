fun main(args: Array<String>){
    //val num: Int = null
    val num: Int? = null
    if(num==null) println("Kotlin has nullability") else println("All my friends are toxic")

    val str: String? = "My patience is draining is this entertening"
    /*here the if statement checking whether str is null or not
    * which can be concised with safe call ?.
    *so anywhere for safe use of any null oparand we will use ?
    * after this...
    * no matter what oparation we are going to perform on it */
    val len1 = if(str!=null && str.length>0) str.length else 0
    val len2 = str?.length
    println("\'$str\' length is: $len1 or $len2")
    println(len1===len2)
}