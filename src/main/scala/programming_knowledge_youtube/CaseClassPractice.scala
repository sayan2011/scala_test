package programming_knowledge_youtube

case class Student ( name:String,  age:Int)

object Main
{
  // Main method
  def main(args: Array[String])
  {
    val s1 = Student("Nidhi", 23)

    // Display parameter
    println("Name is " + s1.name);
    println("Age is " + s1.age);
    val s2 = s1.copy()

    // Display copied data
    println("Copy Name " + s2.name);
    println("Copy Age " + s2.age);
  }
}


/*

Note :
    1. The Case class has a default apply() method which manages the construction of object.
      A case object has some more features than a regular object.

    2. Below two are important features of case object:
      It is serializable.
      It has a by default hashCode implementation.

  3. The one of the topmost benefit of Case Class is that Scala Compiler affix a method with the name of the class
  having identical number of parameters as defined in the class definition,
  because of that you can create objects of the Case Class even in the absence of the keyword new.

  4. Reassignment of variables are not possible as all the variables are by default val and not var, unless you by
  default
   define it as var in the case class definition like this -
   case class Student (var name:String, var age:Int)

  5. To create a duplicate of same object with changing attributes. Here, you need to pass the value in the copy method.

  6. By default Scala Compiler adds toString, equals methods, companion object with apply and unapply methods,
   for that reason you don’t need new keyword to construct object of a Case class.

   --> It was not practicable to use more than 22 parameters in scala case classes but
   now you can use any number of parameters in case classes using Scala Version 2.11.1.
   This limitation was eliminated from this version of scala.

  */
