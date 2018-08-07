
class BankAccount { 

    private var balance_ = 0
    
	def deposit(amount: Int) { balance_ += amount }
	def withdraw(amount: Int) { balance_ -= amount } 
	def balance() = balance_
	
	}
