fun main(args: Array<String>) {
    //declearing type of var is optional
    var name : String = "sriparna saha" //var refers changable variable
    val lang :String = "kotlin" //val refers unchangable variable
    println("Hello World! $name destroying " + lang)

    if(!name.isEmpty()) {
        name = "Malware: the virus"
    }else{
        name = "Zocomon"
    }
    //String interpolation: $string print the value of the string or any data type.
    println("Hello World! $name destroying " + lang)

    /*now everything in kotlin is an object.
     *variables and objects will be created with same 'val' keyword
     * every datatypes will be declared as its wrapper class
     * let's see in examples
     */
    val numByte: Byte = 8 //8bit signed Interger
    val numShort: Short = 16 //16bit signed Interger
    val numInt: Int = 32 //32bit signed Interger
    val numLong: Long = 64 //64bit signed Interger
    val decnumFloat: Float = 32.00F //32bit floating number
    val decnumDouble: Double = 64.00 //64bit floating number
    var res = numByte.toInt()+numShort.toInt()+numInt+numLong.toInt()+decnumFloat.toInt()+decnumDouble.toInt()
    println("Total result: $res")
    /*So each data types belongs to the number class
     * all extended from the same class
     * and if we see the number we can see that it is like an interface having many methods
     */
    val myLong: Long = 1_000_000_000 // readablility in kotlin
    println(myLong)

    val greet: String = "Hi kotlin" //Strings in kotlin must be defined in double quotes
    val c: Char = 'x' // But the character must be defined inside single quote. it is  a 16bit unicode character
    println(" $greet, the chracter var is : $c")
}