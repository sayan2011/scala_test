package programming_knowledge_youtube

object ScalaTuple {

  def main(args: Array[String]): Unit = {

    var name=(14,15,17)

    println(name._1)

    name.productIterator.foreach{i=>println(i)}
  }

}
