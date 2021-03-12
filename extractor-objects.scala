import scala.util.Random

object ExtractorObjects {
  object CustomerID {
    def apply(name: String) = s"$name--${Random.nextLong()}"

    def unapply(customerID: String): Option[String] = {
      val stringArray: Array[String] = customerID.split("--")
      if (stringArray.tail.nonEmpty) Some(stringArray.head) else None
    }
  }

  def main(args: Array[String]) = {
    val customer1ID = CustomerID("Sukyoung")
    customer1ID match {
      case CustomerID(name) => println(name) // prints Sukyoung
      case _                => println("Could not extract a CustomerID")
    }

    val customer2ID = CustomerID("Nico")
    val CustomerID(name) = customer2ID
    println(name) // prints Nico
  }
}
