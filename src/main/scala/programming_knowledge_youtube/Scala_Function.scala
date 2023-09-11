package programming_knowledge_youtube

// Function in Scala
object Scala_Function {
  object Physics {
    def speed(dist: Int, time: Int): Int = return dist / time
  }
  //declaring function : 1 , single line without return type and return statement
  def add(x:Int,y:Int) = x+y
  //declaring function : 2
  def subtract(x:Int,y:Int): Int = {
    x - y
  }
  //declaring function : 3
  def multiply(x:Int,y:Int): Int = {
    return x * y
  }
  //declaring function : 4
  def divide(x:Int,y:Int): Int = {
    return y / x
  }
  def square(x:Int)= x*x

    def main(args: Array[String]): Unit = {
      println("Add : "+add(8,2))
      println("Sub : "+subtract(8,2))
      println("Mult : "+multiply(8,2))
      println("Div : "+divide(8,2))
      println(Scala_Function square 7) // call function having one arg by using object name and func name
      println("Speed is : "+Physics.speed(100,5))
    }
}
