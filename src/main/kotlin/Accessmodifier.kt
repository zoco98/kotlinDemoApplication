fun main(args: Array<String>) {
    /*All class in kotlin is private by default
     *So when to extend any class need to declare it with open
     *just like a public keyword
     *any var, fun is declared as the protected can only be access by that class or the child class
     *the object can not access it either like st.print()
     *Moreover no getter setter can be overridden --> accidental override*/
    var st = Admin("Sri",105,"Retail")
    st.adminInfo()
    st.setAdminTask("Admin")
    st.getAdminTask()
    var emp = Employee("Ayan",202, "BFSI")
    emp.setAdminTask("Employee")
    emp.getAdminTask()

}
/*internal modifier does not allow to access vars outside the class scope it is like strictly private*/
internal class User(
    var task: String ?= "Unknown"
)
open class Admin(
    var name: String,
    var rollno: Int,
    var dept: String
){
    protected var role: String = "Admin"
    private lateinit var task: MutableList<String>

    init {
        task = arrayListOf("You task will be assigned based your role.")
    }
    fun setAdminTask(role: String){
        if(role.equals("Employee")) task.add("$role -> Set Employee id") else task.add("$role -> restricted action")
    }
    fun getAdminTask(){
        task.forEach{ println(it) }
    }
    fun adminInfo(){
        println("$name has $rollno in $dept as a role of $role")
    }
    protected fun print(){
        println("$name has $rollno in $dept as a role of $role")
    }
}

class Employee(name: String, rollno: Int, dept: String) : Admin(name, rollno, dept) {

    init {
        role = "Employee"
        print()
        //task
        //you can access setAdminTask() but not the task var itself
        setAdminTask(role)
        getAdminTask()
    }

}
