package programming_knowledge_youtube

object GfG extends App
{

  // Defining a method and applying
  // Either
  def Name(name: String): Either[String, String] =
  {

    if (name.isEmpty)
      Left("There is no name.")
    else
      Right(name)
  }


  // Displays this if name is
  // not empty
  println(Name("GeeksforGeeks").toString)

  // Displays the String present
  // in the Left child
  println(Name(""))
}