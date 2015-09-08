package example

case class Hay(n:Int)
object Hay {
    implicit def g = Hay(1)
    implicit val h = Hay(2)
}

class Foo {
    implicit val fooHay = Hay(4)
    implicit object Straw extends Hay(5)
}

class Bar extends Foo {
    implicit val barHay = Hay(6)
}

object Example extends Bar {
    def notWar(implicit h:Hay) = println(h)
    def printHay = notWar
}
