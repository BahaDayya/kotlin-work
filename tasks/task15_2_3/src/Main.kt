// Task 15.2.3: demo program

fun main() {
    // Write code to demonstrate the classes here
    val moneySmart = SavingsAccount("ayanami")
    moneySmart.deposit(1250)
    println(moneySmart.balance)
    for (n in 1..5) {
       moneySmart.applyInterest(1.5)
    }

    println(moneySmart.balance)
    moneySmart.withdraw(50)
    println(moneySmart.balance)
}
