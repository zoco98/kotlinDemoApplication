fun main(args: Array<String>) {
    hello()
    outerFunc()
    singleLineFunc(2)
    //it will print the default value of function
    singleLineFunc()
    //but you can't call innerFunc here as it is out of scope

    //function to call with variable arguments
    variableArg("john","jane","jack","harry","ron","bellatrix","draco")
    //Now let's overload the method if they don't get the value it will print default
    overloadedMethod(2,"Ayantika","Lords")
    overloadedMethod(3,"Kushal")
    overloadedMethod(4)

}
//by default any function has a return type of unit
     fun hello() : Unit{
         println("hello pretty lady")
     }
    /*we can call a function within a function
     *the function should be called within its scope and after declaring
     * otherwise the funtion will cause a scope error
     */

     fun outerFunc() {
         println("I am outer body")
         //you can't call innerFunc here also as it is not declared or defined yet
         fun innerFunc() {
             println("I am inner body")

             /*now you could have declare another function here also
             *which could create a chain of functions
             *but it will create a real nasty thing
             */
         }
         innerFunc()
     }

    //let's try a single line expression functions just like if-else single line statement

    fun singleLineFunc(i: Int = 3) = if(i==2) println("printing single line function") else println("hell yeah")

    /*sometimes you need to add a number of value in one argument inside one parameter
    *but you can't calculate how many value it could be..
    *so that's why we need to use vararg -- variable arguments as type
    *then we can assign a number of value as per our preference for that args
    */
    fun variableArg(vararg str:String) {
        println("printing reference: $str")
        str.forEach { x->println(x) }
    }

    //concise method overloading
    fun overloadedMethod(
        id: Int = 1,
        name: String = "Sri",
        odc: String = "Lords"
    ){
        println("The present employee List: $id - $name - $odc")
    }