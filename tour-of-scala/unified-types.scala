object UnifiedTypes {
  def main(args: Array[String]) = {
    /// Scala Type Hierarchy

    // Any: The supertype of all types.
    // AnyVal: Represents value types. There are 9 predefined value types:
    //         Double, Float, Long, Int, Short, Byte, Char, Unit, Boolean
    // AnyRef: Represernts reference types
    {
      val list: List[Any] = List(
        "a string",
        732, // an integer
        'c', // a character
        true, // a boolean value
        () => "an anonymous function returning a string"
      )

      list.foreach(element => println(element))
    }

    /// Type Casting

    val x: Long = 987654321
    val y: Float = x
    val face: Char = '☺'
    val number: Int = face // 9786

    /// Nothing and Null

    // Nothing: A subtype of all types
    // Null:    A subtype of all reference types. (i.e. any subtype of AnyRef)
    //          Provided mostly for interoperability with other JVM language and
    //          should almost never be used in Scala code.
  }
}
