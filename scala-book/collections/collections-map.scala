import scala.collection.mutable
object CollectionsMap {
  def main(args: Array[String]): Unit = {
    /// Immutable Map examples

    val m = Map(
      1 -> "a",
      2 -> "b",
      3 -> "c",
      4 -> "d"
    )

    // Iterating over Map elements
    for ((k, v) <- m) printf("key: %s, value: %s\n", k, v)
    // Getting the keys from a Map
    val keys = m.keys
    // Getting the values from a Map
    val values = m.values
    // Testing if a Map contains a key
    val contains3 = m.contains(3)
    // Transforming Map values
    val ucMap = m.transform((k, v) => v.toUpperCase)
    // Filtering a Map by its keys
    val twoAndThree = m.view.filterKeys(Set(2, 3)).toMap
    // Taking the first two elements from a Map
    val firstTwoElements = m.take(2)

    /// Mutable Map examples

    val states = mutable.Map(
      "AL" -> "Alabama",
      "AK" -> "Alaska"
    )

    // Adding elements with +=
    states += ("AZ" -> "Arizona")
    states += ("CO" -> "Colorado", "KY" -> "Kentucky")
    // Remove elements with -=
    states -= "KY"
    states -= ("AZ", "CO")
    // Update elements by reassigning them
    states("AK") = "Alaska, The Big State"
    // Retaining elements by supplying a function that operates on the keys
    // and/or values
    states.retain((k, v) => k == "AK")
  }
}
