package programming_knowledge_youtube

//Higher order function is a function that either takes a
// function as argument or returns a function.
// In other words we can say a function which works with function
// is called higher order function.

object Higher_Order_Functions {

  def passingFunction(x:Int, innerFunction:Int=> Int): Int = innerFunction(x)


  def main(args: Array[String])= {
    var result = passingFunction(12, x=>x*x);
    println(result)
  }
}
