object Traits {
  def main(args: Array[String]) = {
    /// Subtyping

    trait Pet {
      val name: String
    }

    class Cat(val name: String) extends Pet
    class Dog(val name: String) extends Pet

    val dog = new Dog("Harry")
    val cat = new Cat("Sally")

    val animals = ArrayBuffer.empty[Pet]
    animals.append(dog)
    animals.append(cat)
    animals.foreach(pet => println(pet.name))
  }
}
