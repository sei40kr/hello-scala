object HighOrderFunctions {
  def main(args: Array[String]) = {
    val salaries = Seq(20000, 70000, 40000)
    val doubleSalary = (x: Int) => x * 2

    {
      val newSalaries = salaries.map(doubleSalary)
    }
    // A more idiomatic way
    {
      val newSalaries = salaries.map(_ * 2)
    }

    // Coercing methods into functions

    {
      case class WeeklyWeahterForecast(temperatures: Seq[Double]) {
        private def convertCtoF(temp: Double) = temp * 1.8 + 32

        def forecastInFahrenheit: Seq[Double] = temperatures.map(convertCtoF)
      }
    }

    // Functions that accept functions

    {
      object SalaryRiser {
        private def promotion(
            salaries: List[Double],
            promotionFunction: Double => Double
        ): List[Double] = salaries.map(promotionFunction)

        def smallPromotion(salaries: List[Double]): List[Double] =
          promotion(salaries, _ * 1.1)

        def greatPromotion(salaries: List[Double]): List[Double] =
          promotion(salaries, salary => salary * math.log(salary))

        def hugePromotion(salaries: List[Double]): List[Double] =
          promotion(salaries, salary => salary * salary)
      }
    }

    // Functions that return functions

    {
      def urlBuilder(
          ssl: Boolean,
          domainName: String
      ): (String, String) => String = {
        val schema = if (ssl) "https://" else "http://"
        (endpoint: String, query: String) =>
          s"$schema$domainName/$endpoint?$query"
      }
      val domainName = "www.example.com"
      val getURL = urlBuilder(ssl = true, domainName)
      val endpoint = "users"
      val query = "id=1"
      val url = getURL(endpoint, query) // https://www.exmaple.com/users?id=1
    }
  }
}
