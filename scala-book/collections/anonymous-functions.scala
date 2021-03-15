object AnonymousFunctions {
  def main(args: Array[String]) = {
    {
      val ints = List(1, 2, 3)
    }
    {
      val ints = List.range(1, 10)
    }

    {
      val ints = List(1, 2, 3)
      // Creating a new list by doubling each element in `ints`
      val doubledInts = ints.map(_ * 2)
    }

    {
      val ints = List.range(1, 10)
      // Creating a new list of all integers whose value is greater than 5
      ints.filter(_ > 5)
      // Creating a new list whose value is less than 5
      ints.filter(_ < 5)
      // Creating a new list that contains only even values
      ints.filter(_ % 2 == 0)
    }
  }
}
