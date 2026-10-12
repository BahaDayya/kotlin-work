// Task 4.2: use of if and ranges

fun main() {
    // Add your code here
    print("PIZZA MENU\n\n(a) Margherita\n(b) Quattro Stagioni\n(c) Seafood\n(d) Hawaiian" + 
    "\nChoose your pizza (a-d): ")
    val pizza = readln().lowercase()
    

    if (pizza.length == 1 && pizza[0] in 'a'..'d') {
        println("Order accepted")
    } else { 
        println("NO!")
    }
}
