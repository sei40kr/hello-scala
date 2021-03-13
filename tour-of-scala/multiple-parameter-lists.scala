object MultipleParameterLists {
  def numbers = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
  def foldLeft1[A, B](as: List[A], b0: B, op: (B, A) => B) = as.foldLeft(b0)(op)

  def main(args: Array[String]) = {
    /// Drive Type Inference

    {
      // Scala won't be able to infer the type of the function `_ + _`
      // val notPossible = foldLeft1(numbers, 0, _ + _)

      val firstWay = foldLeft1[Int, Int](numbers, 0, _ + _)
      val secondWay = foldLeft1(numbers, 0, (a: Int, b: Int) => a + b)
    }

    /// Partial Application

    {
      val numberFunc = numbers.foldLeft(List[Int]()) _
      val squares = numberFunc((xs, x) => xs :+ x * x)
      println(squares)
      val cubes = numberFunc((xs, x) => xs :+ x * x * x)
      println(cubes)
    }
  }
}
