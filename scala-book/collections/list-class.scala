object ListClass {
  def main(args: Array[String]) = {
    /// Creating Lists

    val names = List("Joel", "Chris", "Ed")
    val ints = List(1, 2, 3)
    // This works because a `List` is a singly-linked list that ends with the
    // `Nil` element
    val list = 1 :: 2 :: 3 :: Nil;

    /// Adding elements to a List

    val a = List(1, 2, 3)
    // One way to remember those method names is to think that the `:`
    // character represents the side that the sequence is on.
    0 +: a
    List(-1, 0) ++: a

    /// How to loop over lists

    for (name <- names) println(name)
  }
}
