package example

case class Hay(n:Int) 

object Hay {
    implicit def g = Hay(1)
    implicit val h = Hay(2)
    implicit object Straw extends Hay(3)
}

object Example {
    def notWar(implicit h:Hay) = println(h)
    def printHay = notWar
}
