package example

case class Hay(n:Int)
object Hay {
    implicit val h = new Hay(1) with Foo
}

trait Foo
object Foo {
    implicit def g = new Hay(2) with Foo
}

object Example {
    def notWar(implicit h:Hay with Foo) = println(h)
    def printHay = notWar
}
