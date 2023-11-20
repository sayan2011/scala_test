package programming_knowledge_youtube

object OptionPractice {
    def main(args: Array[String]): Unit = {
      val employee = Map("Java" -> "OOP language", "Scala" -> "FP Language")

      val a= employee.get("Java")
      val b= employee.get("Scala")
      val c= employee.get("C")

      println(a.getOrElse("Java Not Found"))
      println(b.getOrElse("Scala Not Found"))
      println(c.getOrElse("C Not Found"))
    }

}
