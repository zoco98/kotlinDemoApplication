fun main(args: Array<String>) {
    var sq = Sqaure(20,20)
    sq.calPerimeter(sq.length,sq.breath)
    sq.getPerimeter()
}
abstract class Shape(var length: Int, var breath: Int){
    abstract fun calPerimeter(length: Int,breath: Int)
}

class Sqaure(length: Int,breath: Int) : Shape(length,breath){
    var perimeter: Double?= null
    override fun calPerimeter(length: Int, breath: Int) {
        if (length==breath) {
             perimeter = Math.pow(length.toDouble(),2.0)
        }else{
            perimeter = (length * breath).toDouble()
        }
    }
    fun getPerimeter(){
        println("$perimeter")
    }
}