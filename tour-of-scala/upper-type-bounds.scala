object UpperTypeBounds {
  abstract class Animal {
    def name: String
  }
  abstract class Pet extends Animal {}
  class Cat extends Pet {
    override def name: String = "Cat"
  }
  class Dog extends Pet {
    override def name: String = "Dog"
  }
  class Lion extends Animal {
    override def name: String = "Lion"
  }

  // An upper type bound `T <: A` declares that type variable `T` refers to a sbutype of `A`
  class PetContainer[P <: Pet](p: P) {
    def pet: P = p
  }

  def main(args: Array[String]) = {
    val dogContainer = new PetContainer[Dog](new Dog)
    val catContainer = new PetContainer[Cat](new Cat)

    // this would not compile
    // val lionContainer = new PetContainer[Lion](new Lion)
  }
}
