import java.lang.Exception

fun main(args: Array<String>) {
        val mock1 = mock()
        println("The sum of 56 and 76: " + mock1.add(56,76))
        //after overiding setters
        println("/----format of \'properties\' two numbers seperated with one comma----/")
        mock1.properties = "98 , 12"
        println(mock1.properties+":---- "+mock1.add(mock1.x,mock1.y))
        mock1.properties = "dog , cat"
    }
    class mock(
        var x: Int = 37,
        var y: Int = 67
    ){
        //overriding the getters and setters
        var properties: String = "$x and $y"
            get() = "The sum of $field"
            set(value) {
                if (value.contains(",")){
                    //it will need a try catch block
                    field = value
                    try {
                        var num = field.split("and")
                        x = num[0].trim().toInt(10)
                        y = num[1].trim().toInt(10)
                    }catch (e: Exception){
                        println(e.toString()+" please check you input string it should contain two number")
                    }

                }else{
                    println("not executed")
                }
            }
        init {
            val sum = add(x,y)
            println("//===Intializer block starts===//")
            println("I am a initializer block")
            println("$properties: $sum")
            println("//===Intializer block ends===//")
        }
        fun add(i: Int, j: Int) : Int{
            return i+j
        }

    }