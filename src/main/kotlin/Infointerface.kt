fun main(args: Array<String>) {
    var menu = mutableListOf<String>("Potato","Tofu","Rohu Fish")
    var chef = Chef(menu)
    chef.getOrder(menu)
    chef.serveFood()
}
interface Kitchen{
    fun getOrder(menu: List<String>)
    fun serveFood()
}

interface Stock : Kitchen{
    fun getFoodStock(food: String): Boolean
}
class Chef(
    var menu: List<String>
): Stock{
    private var orderList:MutableList<String> = mutableListOf()
    override fun getFoodStock(food: String): Boolean{
        var ingredientList = mutableListOf<String>("Potato","Corriander","Soya","Tofu","Rohu Fish")
        for (item in ingredientList) {
            if (food.equals(item)) {
                return true
            }
        }
        return false
    }

    override fun getOrder(menu: List<String>) {

        for (order in menu){
            if(getFoodStock(order)){
                orderList?.add(order)
            }else{
                orderList?.add("Not Found in Stock")
            }
        }
    }

    override fun serveFood() {
        if (orderList?.isNotEmpty() == true){
            println("$orderList is served")
        }else{
            println("Khel Katam Paisa Hazam")
        }
    }

}
