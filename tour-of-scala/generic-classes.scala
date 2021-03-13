object GenericClasses {
  class Stack[A] {
    private var elements: List[A] = Nil
    def push(x: A): Unit = elements = x :: elements
    def peek: A = elements.head
    def pop(): A = {
      val currentTop = peek
      elements = elements.tail
      currentTop
    }
  }

  def main(args: Array[String]) = {
    val stack = new Stack[Int]
    stack.push(1) // prints 2
    stack.push(2) // prints 1
    println(stack.pop)
    println(stack.pop)
  }
}
