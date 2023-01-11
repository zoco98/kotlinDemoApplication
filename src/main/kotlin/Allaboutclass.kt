//constants can be floating on their own like globals
const val SKY = "infinite"
fun main(args: Array<String>) {

    //we do not need to create any object to access any companion object
    var s = Student.createStudent("Sriparna Saha",12,1011)
    println("$s admitted")

    var p = Student.Parent("Sankar Saha",64)
    println(p.toString())
    var st = Student("Sriparna Saha",12,1011)
    var pr = st.Parentrelation("Sankar Saha","Father")
    println(pr.toString())
    /*you can not access DEPT_NAME with any object like s.DEPT_NAME
     *it use safe use to declare constant inside companion object
     *otherwise you can use val but it will not be static*/
     println(Student.DEPT_NAME)
    //understanding sigleton class in kotlin
    /*Here in kotlin the object class may have a number of value but
     *every object will have same memory reference
     *so as we can see here we can not create a constructor
     *to initialize individual objects
     *but instead we use the object itself
     */
    println(StudentList.name)
    var s1 = StudentList
    s1.name = "Ayantika Chatterjee"
    println(s1.name)
    println(s1===StudentList)
    var s2 = StudentList
    s2.name = "Kushal Lahiri"
    println(s1.name)
    println(s1===s2)
    println(s2===StudentList)
    /*s1 & s2 are not different objects
     *they are rather a variable of already created object of StudentList class
     */
    println(StudentList.LIMIT_OF_DEPT)
    println(SKY)

    var color = Color.valueOf("WHITE")
    println(st.name+" has a uniform with color code: "+color.RGBCode)
    println(st.name+"\'s uniform color is "+color.chooseUniformColor(999999))

    Color.values().forEach { println("$it->${it.RGBCode}->"+it.chooseUniformColor(it.RGBCode)) }

    //when statement it can be used as switch case
    when(st.name){
        "Sriparna Saha"->{
            println("This is our 1st student")
        }
        else->{
            println("others")
        }
    }

    var opr1 = operator("+","-","*","/")
    var opr2 = operator("&&","||","*","/")
    println(opr1.toString())
    println(opr1.hashCode())
    println(opr1.equals(opr2))

    println(opr1.component1())
    println(opr1.component2())
    println(opr1.component3())
    println(opr1.component4())

    val opr3 = opr2.copy("+","-")
    println(opr1==opr3)
    //destructuring data class
    val(c1,c2,c3,c4) = opr3
    println("$c1,$c2,$c3,$c4")

    //some inbuilt data classes in kotlin--pair and triple
    var pair1 = Pair<String,String>("Sriparna","Ayantika")
    var pair2 = "Sriparna" to "Ayantika"
    println(pair1===pair2)
    println("${pair1.first} and ${pair1.second}")
    var triple = Triple(1,false,100_00_00)
    println("${triple.first} , ${triple.second} and ${triple.third}")
}
class Student(
    var name: String,
    var age: Int,
    var rollno: Long
){
    lateinit var lazy: String
    /*companion object can be treated as a static method
     *where we can call the method without creating object of class
     *companion object is a type of singleton object*/
    companion object{
        //syntax to declare a const
        const val DEPT_NAME = "Matric"
        fun createStudent(name: String, age: Int, rollno: Long): String{
            return "name = $name age = $age Roll No = $rollno"
        }
    }
    //nested class
    class Parent(var pName:String, var pAge:Int){
        //nested class can only access the local variables
        override fun toString(): String {
            return "Parent info: $pName is $pAge years old"
        }
    }
    //inner class
    inner class Parentrelation(var pName:String, var relationship: String){
        //inner class can access the variables outside it or vars of outer class
        override fun toString(): String {
            return "Parent relation: $pName is $relationship of $name"
        }
    }
}
    /*singleton class in java created with private constructor, static instance and a getinstance() method
     *but in kotlin we can define the class with keyword 'object'
     *then it would behave like a singleton class
     */
object StudentList {
    const val LIMIT_OF_DEPT= 60
    var name: String = "Debojyoti Sarkar"
    //var sNameList: MutableList<String> = mutableListOf<String>()
}

//enums
enum class Color(var RGBCode: Long) {
    RED(547789) {
        override fun chooseUniformColor(code: Long): String {
            if (RGBCode == code) return "Red" else return "Not applicable"
        }
    },
    GREEN(76423) {
        override fun chooseUniformColor(code: Long): String {
            if (RGBCode == code) return "Green" else return "Not applicable"
        }
    },
    BLUE(110028) {
        override fun chooseUniformColor(code: Long): String {
            if (RGBCode == code) return "Blue" else return "Not applicable"
        }
    },
    BLACK(884976) {
        override fun chooseUniformColor(code: Long): String {
            if (RGBCode == code) return "Black" else return "Not applicable"
        }
    },
    WHITE(999999) {
        override fun chooseUniformColor(code: Long): String {
            if (RGBCode == code) return "White" else return "Not applicable"
        }
    };

    abstract fun chooseUniformColor(code: Long):String
    //can also have a companion obejct inside enums. it will act as a static method
    companion object{
        //body
    }
}

//a class does not have a body, only holds data structures
//data class have default methods like toString(),hashcode(),equals()
data class operator(
    var plus: String,
    var minus: String,
    var into: String,
    var by: String
    )