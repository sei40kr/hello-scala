object Classes {
  def main(args: Array[String]) = {
    /// Defining a class

    {
      class User
      val user1 = new User
    }

    {
      class Point(var x: Int, var y: Int) {
        def move(dx: Int, dy: Int): Unit = {
          x = x + dx
          y = y + dy
        }

        override def toString: String = s"($x, $y)"
      }
      val point1 = new Point(2, 3)
      println(point1.x)
      println(point1)
    }

    /// Constructors

    {
      // Constructors can have optional parameters by providing a default value
      class Point(var x: Int = 0, var y: Int = 0)

      val origin = new Point
      val point1 = new Point(1)
      println(point1.x) // 1
      val point2 = new Point(y = 2)
      println(point2.y) // 2
    }

    /// Private Members and Getter/Setter Syntax

    {
      class Point {
        private var _x = 0
        private var _y = 0
        private val bound = 100

        def x = _x
        def y = _y
        // The special syntax for the setters: `_=`
        def x_=(newValue: Int): Unit = {
          if (newValue < bound) _x = newValue else printWarning
        }
        def y_=(newValue: Int): Unit = {
          if (newValue < bound) _y = newValue else printWarning
        }

        private def printWarning = println("WARNING: Out of bounds")
      }
      val point1 = new Point
      point1.x = 99
      point1.y = 101
    }
  }
}
