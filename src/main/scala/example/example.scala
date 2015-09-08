package example

trait Hay {
    def n:Int
    override def toString(): String = getClass.getName + s"($n)"
}

trait Straw extends Hay { override def n = 1 }
trait Fodder extends Straw { override def n = 2 }

trait Swath extends Hay { override def n = 3 }

object Hay {
    implicit val straw = new Straw {}
    implicit val fodder = new Fodder {}
    implicit val swath = new Swath {}
    implicit val swathStraw = new Fodder with Swath with Straw {}
}


object Example {
    def notWar(implicit h:Hay) = println(h)
    def printHay = notWar
}
