fun main(args: Array<String>) {
    //immutable array
    var villanArr = arrayOf("Don","Mogambo","GabbarSingh","Sakal")
    villanArr.forEach { println(it) }
    println("************")
    villanArr.reversedArray().forEach { println(it) }
    println("************")
    val updatedVillainArr = villanArr.plus("Duryodhan")
    villanArr.forEach { println(it) }
    println("************")
    updatedVillainArr.forEach { println(it) }
    //immutable list
    var horrorMovieList = listOf<String>("Conjuring", "Evil dead", "The NUN")
    println("************")
    horrorMovieList.forEach { println(it) }
    println("************")
    println(horrorMovieList.first())
    println("************")
    println(horrorMovieList.last())
    /*funny stuff:
    * you can create list of your list
    * same goes for arrays
    * you can create arrays of your arrays as well*/
    //mutable list
    val allDarkList = mutableListOf(horrorMovieList,villanArr.toList())
    println("************")
    allDarkList.forEach(){ println(it) }
    //flat your list
    println("************")
    println(allDarkList.flatten())
    allDarkList.add(0, listOf("It"))
    println("************")
    println(allDarkList.flatten())
    val darkMap = allDarkList.flatten().map {
        var words = it.split(',')
        words[0].substring(0, 2)
    }
    println("************")
    println(darkMap)
    val darkMapFiltered = allDarkList.flatten().map {
        var words = it.split(',')
        words[0].substring(0,2)
    }.filter { it -> it.equals("Sa") }
    println("************")
    println(darkMapFiltered)
}