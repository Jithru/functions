object person extends App{
  var p1=new Account("9920v",1001,1000)
  var p2=new Account("96430v",10201,5000)
  
  println(p1)
  println(p1.withdraw(100))
  println(p1.deposit(500))
  println(p1.transfer(1000,p2))
  

}

class Account(x:String,y: Int,z:Double) {
  
    val NIC :String = x
    val accNo:Int = y
    var balance:Double = z

    def withdraw( amount: Double ) = {
      if(balance>0){
        this.balance -= amount
        println("New balance is:"+this.balance)
      }else
        println("No sufficent balance in your account")
    }

    def deposit ( amount : Double ) = {
      this.balance += amount
      println("New balance is:"+this.balance)
    }

    def transfer(amount:Double , reciever:Account )= {
       if(balance>0){
         this.balance =  this.balance - amount
          reciever.balance = reciever.balance + amount
          println("New balance of your account is:"+this.balance)
       }else
        println("No sufficent balance in your account")
        

    }


    override def toString()= "NIC : " + this.NIC + "\nAccount Number : " + this.accNo + "\nBalance : " + this.balance
}