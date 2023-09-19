
import org.scalatest.flatspec.AnyFlatSpec
import programming_knowledge_youtube.AdditionObject

class AdditionObjectTest extends AnyFlatSpec {

  val actual:Int=14
  val expected:Int=AdditionObject.add(6,8)

  it should "match" in {
    assert(actual==expected)
    //assert(14==AdditionObject.add(9,8))
    print("tytytyt")
  }



}
