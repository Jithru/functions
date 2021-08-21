
object Bank extends App {
  
    
    var bank:List[Account]=List(new Account("9833V",169001,-20000),new Account("9813V",181101,45000),new Account("9543V",991102,15000))
  
  // val find = (n :String, b :List[Account]) => b.filter(x => x.accNo.equals(n))
  
   // get all Accounts with negative balances  
   val overdraft=(b :List[Account]) => b.filter(x =>x.balance < 0)
   
   //sum of all account balances
   val totBalance=(b :List[Account])=>b.map((x)=>(x,x.balance)).reduce((y,z)=>(y._1,y._2+z._2))
   
   //add interest for account
   
   val interest=(b:List[Account])=>b.map((x)=>if(x.balance>0) (x.balance+x.balance*0.05) else (x.balance+x.balance*0.1))
   
   println("overdraft accounts:"+overdraft(bank))
   println("Total balance of the bank is :"+totBalance(bank)._2)
   println("New balance of accounts "+interest(bank))
  
}
