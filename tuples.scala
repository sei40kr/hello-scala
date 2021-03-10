object Tuples {
  def main(args: Array[String]) = {
    val ingredient = ("Sugar", 25)

    // Accessing the elements

    {
      println(ingredient._1) // Sugar
      println(ingredient._2) // 25
    }

    // Pattern matching on tuples

    {
      val (name, quantity) = ingredient
      println(name) // Sugar
      println(quantity) // 25
    }

    {
      val numPairs = List((2, 5), (3, -7), (20, 56))
      for ((a, b) <- numPairs) { println(a * b) }
    }
  }
}
