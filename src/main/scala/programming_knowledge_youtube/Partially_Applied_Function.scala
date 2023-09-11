package programming_knowledge_youtube
import java.util.Date;

object Partially_Applied_Function {

  def log(date: Date, message:String): Unit ={
     println(date+" - "+message)
  }

  def main(args: Array[String]): Unit = {
    //sum() is normal function
    var sum= (a:Int,b:Int,c:Int)=> a+b+c
    println(sum(10,5,7))

    // sub() is partially applied func
    var sub= (a:Int,b:Int,c:Int)=> a-b-c
    var partial_func= sub(10,5,_)
    var final_val = partial_func(7)
    println(final_val)

    var date= new Date;
    var custom_log=log(date , _);
    var create_log =custom_log("Error")
  }
}
