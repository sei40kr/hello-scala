import scala.collection.mutable

object ArrayBufferExamples {
  def main(args: Array[String]): Unit = {
    {
      val ints = mutable.ArrayBuffer[Int]()
      val names = mutable.ArrayBuffer[String]()

      ints += 1
      ints += 2
    }

    {
      val nums = mutable.ArrayBuffer(1, 2, 3)

      // add one element
      nums += 4
      // add multiple elements
      nums += 5 += 6
      // add multiple elements from another collection
      nums ++= List(7, 8, 9)

      // remove one element
      nums -= 9
      // remove multiple elements
      nums -= 7 -= 8
      // remove multiple elements using another collection
      nums --= Array(5, 6)
    }

    {
      val a = mutable.ArrayBuffer(1, 2, 3)
      a.append(4)
      a.append(5, 6)
      a.appendAll(Seq(7, 8))
      a.clear
    }

    {
      val a = mutable.ArrayBuffer(9, 10)
      a.insert(0, 8)
      a.insertAll(0, Vector(4, 5, 6, 7))
      a.prepend(3)
      a.prepend(1, 2)
      a.prependAll(Array(0))
    }

    {
      val a = mutable.ArrayBuffer.range('a', 'h')
      a.remove(0)
      a.remove(2, 3)
    }

    {
      val a = mutable.ArrayBuffer.range('a', 'h')
      a.trimStart(2)
      a.trimEnd(2)
    }
  }
}
