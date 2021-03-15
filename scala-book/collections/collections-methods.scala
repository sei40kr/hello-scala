object CollectionsMethods {
  def main(args: Array[String]) = {
    val nums = (1 to 10).toList
    val names = List("joel", "ed", "chris", "maurice")

    // map
    val capNames = names.map(_.capitalize)
    val doubles = nums.map(_ * 2)
    val lessThanFive = nums.map(_ < 5)

    // filter
    val lessThanFive = nums.filter(_ < 5)
    val evens = nums.filter(_ % 2 == 0)
    val shortNames = names.filter(_.length <= 4)

    // foreach
    names.foreach(println)

    // head
    nums.head
    names.head
    // List().head
    // -> java.util.NoSuchElementException: head of empty list

    // tail
    "foo".tail // -> "oo"
    "bar".tail // -> "ar"
    // List().tail
    // -> java.lang.UnsuportedOperationException: tail of empty list

    // take, takeWhile
    nums.take(1)
    nums.take(2)
    names.take(1)
    names.take(2)
    nums.takeWhile(_ < 5)
    names.takeWhile(_.length < 5)

    // drop, dropWhile
    nums.drop(1)
    nums.drop(5)
    names.drop(1)
    names.drop(2)
    names.dropWhile(_ < 5)
    names.dropWhile(_ != "chris")

    // reduce
    def add(x: Int, y: Int): Int = {
      val theSum = x + y
      println(s"received $x and $y, their sum is $theSum")
      theSum
    }
    val a = List(1, 2, 3, 4)
    a.reduce(add)
    // -> received 1 and 2, their sum is 3
    // -> received 3 and 3, their sum is 6
    // -> received 6 and 4, their sum is 10
    // -> 10
    a.reduce(_ + _)
    // -> 10
    a.reduce(_ * _)
    // -> 24
  }
}
