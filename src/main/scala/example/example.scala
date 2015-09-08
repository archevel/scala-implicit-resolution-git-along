package example

case class Hay[T](n:Int)
object Hay {
    implicit def h = new Hay[Biz](1)
}

trait Biz
object Biz {
    implicit def bizHay = new Hay[Biz](2)
}

object Example {
    def notWar[T](implicit h:Hay[T]) = println(h)
    def printHay = notWar[Biz]
}
