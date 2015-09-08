
//implicit object Grass extends Hay(5)

package object example {
    implicit val packagedHay = Hay(4)
}
