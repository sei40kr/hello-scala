object Basics {
  def main(args: Array[String]) = {
    /// Expressions

    println(1) // 1
    println(1 + 1) // 2
    println("Hello!")
    println("Hello," + " world!")

    // Values

    {
      val x = 1 + 1
      println(x) // 2

      // Values cannot be re-assigned
      // x = 3
    }

    {
      // The type of a value can be explicitly stated
      val x: Int = 1 + 1
    }

    // Variables

    {
      var x = 1 + 1
      // Variables can be re-assigned
      x = 3
      println(x * x)
    }

    /// Blocks

    // The result of the last expression in the block is the result of the overall block
    println({
      val x = 1 + 1
      x + 1
    }) // 3

    /// Functions

    {
      val addOne = (x: Int) => x + 1
      val add = (x: Int, y: Int) => x + y
      val getTheAnswer = () => 42
      println(addOne(1)) // 2
      println(add(1, 2)) // 3
      println(getTheAnswer()) // 42
    }

    /// Methods

    {
      def add(x: Int, y: Int): Int = x + y
      def addThenMultiply(x: Int, y: Int)(multiplier: Int): Int =
        (x + y) * multiplier
      def name: String = System.getProperty("user.name")
      // Methods can have multi-line  expressions as well
      def getSquareString(input: Double): String = {
        val square = input * input
        square.toString
      }
      println(add(1, 2)) // 3
      println(addThenMultiply(1, 2)(3)) // 9
      println("Hello, " + name + "!")
      println(getSquareString(2.5)) // 6.25
    }

    /// Classes

    {
      class Greeter(prefix: String, suffix: String) {
        // Unit signifies that there is nothing meaningful to return
        // (similar to void in Java and C)
        def greet(name: String): Unit = println(prefix + name + suffix)
      }

      val greeter = new Greeter("Hello", "!")
      greeter.greet("Scala developer") // Hello, Scala developer!
    }

    /// Case Classes

    {
      case class Point(x: Int, y: Int)

      // Case classes can be instantiated without the `new` keyword
      val point = Point(1, 2)
      val anotherPoint = Point(1, 2)
      val yetAnotherPoint = Point(2, 2)

      // Instances of case classes are compared by value, not by reference
      if (point == anotherPoint) {
        println(point + " and " + anotherPoint + "are the same.")
      } else {
        println(point + " and " + anotherPoint + "are different.")
      }
    }

    /// Objects

    {
      // Objects are single instances of their own definitions
      object IdFactory {
        private var counter = 0

        def create(): Int = {
          counter += 1
          counter
        }
      }

      val newId: Int = IdFactory.create()
      println(newId) // 1
      val newerId: Int = IdFactory.create()
      println(newerId) // 2
    }

    /// Traits

    {
      // Traits are abstract data types containing certain fields and methods
      trait Greeter {
        def greet(name: String): Unit
      }
    }

    {
      // Traits can have default implementations
      trait Greeter {
        def greet(name: String): Unit = println("Hello, " + name + "!")
      }

      // Traits can be extended with the `extends` keyword and its
      // implementation can be overidden with `override` keyword
      class DefaultGreeter extends Greeter

      class CustomizableGreeter(prefix: String, postfix: String)
          extends Greeter {
        override def greet(name: String): Unit = {
          println(prefix + name + postfix)
        }
      }

      val greeter = new DefaultGreeter()
      greeter.greet("Scala developer") // Hello, Scala developer

      val customGreeter = new CustomizableGreeter("How are you, ", "?")
      customGreeter.greet("Scala developer") // How are you, Scala developer?
    }
  }
}
