package example

case class Hay(n:Int) 

object Hay {
    implicit def g = Hay(1)
    implicit val h = Hay(2)
    implicit object Straw extends Hay(3)
    implicit class Fodder(n:Int) extends Hay(4)
    implicit def impl2Hay(str:String) = Hay(5)
}

object Example {
    def notWar(implicit h:Hay) = println(h)
    def printHay = notWar
}
