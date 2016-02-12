package calculator

class StringCalculator {

  def calculate(input: String) = {
    input.split(",")
        .filter(!_.trim.isEmpty)
        .map(_.toInt)
        .sum
  }
}
