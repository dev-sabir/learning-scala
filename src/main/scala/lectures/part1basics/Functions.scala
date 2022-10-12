package lectures.part1basics

object Functions extends App{

  def aFunction(a: String, b: Int): String =
    a + " " + b

  println(aFunction("hello", 3)) // hello 3
  // calling a function in scala is also an expression

  def aParameterlessFunction(): Int = 42
  println(aParameterlessFunction()) // 42
  println(aParameterlessFunction) // 42
  // we can call a parameter less function without parenthesis -> this only works in scala 2

  // Scala 3 now forbids the mixup:
  // - functions with parenthesis must be called with parenthesis
  // - function without parenthesis must be called without parenthesis

  def aRepeatedFunction(aString: String, n: Int): String  = {
    if(n == 1) aString
    else aString + aRepeatedFunction(aString , n-1)
  }

  println(aRepeatedFunction("Hello",3))

  // COMPILER CAN'T FIGURE OUT THE RETURN TYPE OF A RECURSIVE FUNCTION, YOU MUST SPECIFY THE RETURN TYPE OF RECURSIVE FUNCTION
  // WHEN YOU NEED LOOPS USE RECURSION

  def aFunctionWithSideEffects(aString: String): Unit = println(aString)

  def aBigFunction(n: Int): Int = {
    def aSmallerFunction(a: Int, b: Int): Int = a + b

    aSmallerFunction(n, n-1)
  }

  /*
  1. A greeting function(name, age) => "Hi, my name is $name and I am $age years old.
  2. Factorial Function 1 * 2 * 3* 4 *5 ... *n
  3. A Fibonacci Function
      f(1) = 1
      f(2) = 1
      f(n) = f(n-1) + f(n-2)
  4. Test a number is prime or not
  */

  def greet(name: String, age: Int) = {
    s"Hi, my name is $name and I am $age years old."
  }
  println(greet("David", 12))

  def fact(n: Int): Int = {
    if (n <= 0)   1
    else n * fact(n-1)
  }
  println(fact(5))

  def fib(n: Int) : Int= {
    if(n <= 2)  1
    else fib(n-1) + fib(n-2)
  }
  println(fib(7))

  def isPrime(n: Int): Boolean = {
    def isPrimeUntil(t: Int): Boolean =  {
      if(t <=1 ) true
      else n % t != 0 && isPrimeUntil(t-1)

    }
    isPrimeUntil(n/2)
  }

  println(isPrime(37))
  println(isPrime(2003))
  println(isPrime(12))
}
