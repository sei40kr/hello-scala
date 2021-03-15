import scala.collection.mutable
object SetClass {
  def main(args: Array[String]) = {
    /// Adding elements to a Set

    {
      val set = mutable.Set[Int]()

      set += 1
      set += 2 += 3
      set ++= Vector(4, 5)

      set.add(6)
      set.add(5)
    }

    /// Deleting elements from a Set

    {
      val set = mutable.Set(1, 2, 3, 4, 5)
      // Deleting one element
      set -= 1
      // Deleting two or more elements (-= has varargs field)
      set -= (2, 3)
      set -= (4, 5)
      // Deleting multiple elements defined in another sequence
      set --= Array(4, 5)
    }
    {
      val set = mutable.Set(1, 2, 3, 4, 5)
      // clear
      set.clear()
      // remove
      set.remove(2) // -> true
      set.remove(40) // -> false
    }
  }
}
