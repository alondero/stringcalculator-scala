package calculator

import org.scalatest.{FlatSpec, Matchers}

class StringCalculatorTest extends FlatSpec with Matchers {

  "StringCalculator" should "return 0 if string is empty" in {
    new StringCalculator().calculate("") should be (0)
  }

  it should "return the number in the string if singleton" in {
    new StringCalculator().calculate("5") should be (5)
  }

  it should "return the sum of multiple numbers separated by ," in {
    new StringCalculator().calculate("2,8,15") should be (25)
  }

  it should "return 0 if has no numerical entries" in {
    new StringCalculator().calculate(" ,   ,") should be (0)
  }
}
