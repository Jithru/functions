

object getNeg extends App{
  
  val r1=new Rational(3,4)
  val r2=new Rational(1,3)
  
  println(r1.neg)
  println(r2.neg+"\n--------")
  
  val x=r1.sub(r2)
  println(x)
  

}

class Rational(n:Int,d:Int){
  
  require(d>0,"d must be greater than 0")

   private def gcd(a:Int,b:Int):Int=if (b==0) a else gcd(b,a%b)
   
   private val x=gcd(Math.abs(n),d)
   
  def numer:Int=n/x
  def denom:Int=d/x
  
  def this(n:Int)=this(n,1);
  
   def neg=new Rational(-this.numer,this.denom)

   def sub(r:Rational)= new Rational(this.numer*r.denom-this.denom*r.numer ,this.denom * r.denom )
  
  override def toString="("+numer+"/"+denom+")"  
}

