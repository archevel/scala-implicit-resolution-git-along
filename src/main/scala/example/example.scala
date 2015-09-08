package example

case class Hay(n:Int) 

object Hay {
    implicit def g = Hay(1)
}

class Foo {
    implicit val fooHay = Hay(2)
}

class Bar extends Foo {
    implicit val barHay = Hay(3)
}

object Example extends Bar {
    def notWar(implicit h:Hay) = println(h)
    def printHay = notWar
}
