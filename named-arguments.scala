object NamedArguments {
  def main(args: Array[String]) = {
    def printName(first: String, last: String): Unit = {
      println(first + " " + last)
    }

    printName("John", "Smith")
    printName(first = "John", last = "Smith")
    printName(last = "Smith", first = "John")
  }
}
