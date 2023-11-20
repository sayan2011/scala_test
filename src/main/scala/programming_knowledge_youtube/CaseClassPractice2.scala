package programming_knowledge_youtube

case class employee(id: Int, employee_name: String)

object CaseClassPractice2 {
  
  def main(args: Array[String]) {
    val a = new employee(1,"abc")
    val b  = new employee(2,"abc")
    val c  = new employee(3,"abc")

    for (emp <- List(a, b, c)) {
      emp match {
        case employee(1, "abc") => println("Hello abc")
        case employee(2, "abc") => println("Hello xyz")
        case employee(id, employee_name) => println("ID: " +id + ", Employee:" + employee_name)
      }
    }
  }
 // case class
}