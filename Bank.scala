

object Bank extends App {
  
    var bank:List[Account]=List(new Account("9833V",169001,-20000),new Account("9813V",181101,45000),new Account("9543V",991102,15000))
  
//   val find = (n :String, b :List[Account]) => b.filter(x => x.accNo.equals(n))
  
   // get all Accounts with negative balances
   val overdraft=(b :List[Account]) => b.filter(x =>x.balance<0)
   
   //sum of all account balances
   //val totBalance=(b :List[Account])=>b.reduce((x=>x.balance,y=>y.balance)=>x+y)
   
//    val interest = (b:List[Account])=>b.map(x=>{
//        x.balance match {
//            case a if a >= 0 => x deposit x.balance * 0.05
//            case _ => x withdraw Math.abs(x.balance) * 0.1
//        }
//      })
//   
//  // println(overdraft(bank))
//     
  

}

