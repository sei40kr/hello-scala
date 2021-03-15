object VectorClass {
  def main(args: Array[String]) = {
    {
      val nums = Vector(1, 2, 3, 4, 5)
      val strings = Vector("one", "two")
      val peeps = Vector(
        Person("Bert"),
        Person("Ernie"),
        Person("Grover")
      )
    }

    val a = Vector(1, 2, 3)
    // Appending elements
    a :+ 4
    a ++ Vector(4, 5)
    // Prepending elements
    val b = 0 +: a
    val b = Vector(-1, 0) ++: a
  }
}
