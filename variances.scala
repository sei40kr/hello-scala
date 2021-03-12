object Variances {
  abstract class Animal {
    def name: String
  }
  case class Cat(name: String) extends Animal
  case class Dog(name: String) extends Animal

  abstract class Printer[-A] {
    def print(value: A): Unit
  }
  class AnimalPrinter extends Printer[Animal] {
    def print(animal: Animal): Unit =
      println(s"The animal's name is: ${animal.name}")

  }
  class CatPrinter extends Printer[Cat] {
    def print(cat: Cat): Unit = println(s"The cat's name is: ${cat.name}")
  }

  class Container[A](value: A) {
    private var _value: A = value
    def getValue: A = _value
    def setValue(value: A): Unit = {
      _value = value
    }
  }

  def main(args: Array[String]) = {
    /// Covariance (共変)

    // For some `List[+T]`, making `T` covariant implies that for two types `A` and `B`
    // where `B` is a subtype of `A`, then `List[B]` is a subtype of `List[A]`.

    {
      def printAnimalNames(animals: List[Animal]): Unit = {
        animals.foreach { animal =>
          println(animal.name)
        }
      }

      val cats: List[Cat] = List(Cat("Whiskers"), Cat("Tom"))
      val dogs: List[Dog] = List(Dog("Fido"), Dog("Rex"))

      printAnimalNames(cats)
      printAnimalNames(dogs)
    }

    /// Contravariance (反変)

    // For some `Writer[-A]`, making `A` contravariant implies that for two types `A` and
    // `B` where `A` is a subtype of `B`, `Writer[B]` is a subtype of `Writer[A]`

    {
      def printMyCat(printer: Printer[Cat], cat: Cat): Unit = {
        printer.print(cat)
      }

      val catPrinter: Printer[Cat] = new CatPrinter
      val animalPrinter: Printer[Animal] = new AnimalPrinter
      printMyCat(catPrinter, Cat("Boots"))
      printMyCat(animalPrinter, Cat("Boots"))
    }

    /// Invariance (不変)

    // Generic classes in Scala are invariant by default.

    {
      // val catContainer: Container[Cat] = new Container(Cat("Felix"))
      // val animalContainer: Container[Animal] = catContainer
      // animalContainer.setValue(Dog("Spot"))
      // val cat: Cat = catContainer.getValue

      // We'd end up with a Dog assigned to a Cat.
      // Fortunately, the compiler stops us before we could get this far.
    }
  }
}
