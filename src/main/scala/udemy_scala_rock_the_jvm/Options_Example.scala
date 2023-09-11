package udemy_scala_rock_the_jvm

object Options_Example extends App{

 val name_map=Map("Police"->100, "Emergency"->911 )

  //val x=name_map.get("Police")
  //val y=name_map.get("Emergency")


 //pattern matching

 def matchData(z:Option[Int])= z match{
  case Some(value) => value
  case None=> None
 }

 print(matchData(name_map.get("Police")))


}
