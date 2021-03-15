import scala.collection.mutable

object MapClass {
  def main(args: Array[String]) = {
    /// Creating a mutable Map
    val states = mutable.Map("AK" -> "Alaska")

    /// Adding elements to a Map

    // Adding a single element
    states += ("AL" -> "Alabama")
    // Adding multiple elements
    states += ("AR" -> "Arkansas", "AZ" -> "Arizona")
    // Adding elements from another Map
    states ++= Map("CA" -> "California", "CO" -> "Colorado")

    /// Removing elements from a Map

    states -= "AR"
    states -= ("AL", "AZ")
    states --= List("AL", "AZ")

    /// Updating Map elements

    states("AK") = "Alaska, A Really Big State"

    /// Traversing a Map

    val ratings = Map(
      "Lady in the Water" -> 3.0,
      "Snakes on a Plane" -> 4.0,
      "You, Me and Dupree" -> 3.5
    )

    for ((k, v) <- ratings) println(s"key: $k, value: $v")

    ratings.foreach {
      case (movie, rating) => println(s"key: $movie, value: $rating")
    }
  }
}
