package programming_knowledge_youtube

// A closure is a function that uses one or more variable declared outside of the function.

object Closure {

  var outsideVariable1=100;

  val outsideVariable2=500;


  var add1=(x:Int)=> {
    outsideVariable1=x+outsideVariable1
    outsideVariable1
  };

  var add2=(x:Int)=>x+outsideVariable2;

  def main(args: Array[String]): Unit = {
    println(add1(19))
    println(outsideVariable1 +" : This is the updated variable")
    println(add2(19))
  }

}
