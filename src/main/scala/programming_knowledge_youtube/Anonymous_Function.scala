package programming_knowledge_youtube

//Anonymous Function
object Anonymous_Function {
  object Math {
    //with default parameter
    def add(x:Int=10, y:Int=67): Int = x+y
    
    //operators can be used as function name
    def +(a:Int,b:Int):Int =a+b;
  }


  def main(args: Array[String]): Unit = {
    //call function without parameter
    println(Math.add())
    //call operator function
    println(Math.+(5,7))

    //anonymous function - function doesn't have any name, value/return gets stored in variable.
    var multiply =(s:Int,g:Int)=> s*g

    //call anonymous function
    println(multiply(6,8))
  }
}
