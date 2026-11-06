// Task 15.2.3: SavingsAccount class

class SavingsAccount(holder: String) : BankAccount(holder) {

    fun applyInterest(rate: Double) {
        require(rate > 0) {"Cannot create an account if interest or balance is less than 1"}
        val newBalance = balance * (rate/100)
        deposit(newBalance.toInt())
    }
}
