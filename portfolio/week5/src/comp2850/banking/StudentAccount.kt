// COMP2850 Portfolio: Week 5
// StudentAccount class

package comp2850.banking

class StudentAccount(holder : String) : BankAccount(holder) {

    // Custom setting allows checking of value between 0 and 100 whenever its changed
    var overdraft: Int = 0
        set(value) {
            require(value > -1 && value < 101)
            field = value
        }
    
    override fun toString() = "Account for $holder, balance = $balance (overdraft = $overdraft)"

    // withdrawals chould be allowed till -overdraft
    // (overdraft of 80 means your account can be at -80)
    fun withdrawalsAllowed() = balance > -overdraft

    override fun withdraw(amount: Int) {
        require(amount > 0) { throw IllegalArgumentException("Withdrawal amount must be greater than 0") }
        require(withdrawalsAllowed())
        require(balance - amount >= -overdraft) { throw IllegalArgumentException("Insufficient funds for withdrawal") }

        balance -= amount
    }
}
