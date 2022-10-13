package lectures.part1basics

import scala.annotation.tailrec

object Recursion extends App{

  def fact(n: Int) : Int = {
    if(n <= 1) 1
    else {
      println("Computing factorial of " + n + " - I first need factorial of " + (n-1))
      val result = n * fact(n-1)
      println("Computed factorial of " + n)

      result
    }
  }
  println(fact(10))

  def anotherFact(n: Int): BigInt = {
    @tailrec //if the below function is not tailrec it will throw error
    def factHelper(x: Int, accumulator: BigInt): BigInt = {
      if(x <= 1) accumulator
      else factHelper(x-1, x * accumulator)  // TAIL RECURSION = use recursive call as the LAST EXPRESSION
    }
    factHelper(n,1)
  }

  println(anotherFact(500))

  // WHEN YOU NEED LOOPS, USE TAIL RECURSION.

 /*
   1. Concatenate a string n time
   2. isPrime function tail recursion
   3. Fibonacci function tail recursion
 */

/*  def concatString(aStr: String, n: Int):String = {
    @tailrec
    def concatHelper(t: Int, accumulator: String):String = {
      if (n <= 0) accumulator
      else concatHelper(t-1, accumulator + accumulator)
    }

    concatHelper(n-1, aStr)
  }
  println(concatString("Hello", 5))*/


  def concatinateTailRec(aString: String, n: Int, accumulator: String): String =
    if(n <=0) accumulator
    else concatinateTailRec(aString, n-1, aString + accumulator)

  println(concatinateTailRec("hello", 3, ""))

  def isPrime(n: Int): Boolean = {
    @tailrec
    def isPrimeTailrec(t: Int, isStillPrime: Boolean): Boolean = {
      if(!isStillPrime) false
      else if(t <= 1) true
      else isPrimeTailrec(t-1, n%t !=0 && isStillPrime)
    }
    isPrimeTailrec(n/2, true)
  }


  println(isPrime(2003))
  println(isPrime(629))

  def fib(n: Int):Int ={

    // GENERAL RULE OF THUMB IS HOWEVER MANY RECURSIVE CALL YOU HAVE ON THE SAME CODE PATH THATS HOW MANY ACCUMULATOR YOU NEED TO HAVE IN THE TAIL RECURSIVE FUNCTION
    def helper(i: Int, acc1: Int, acc2: Int): Int = {
      if( i >= n) acc1
      else helper(i+1,acc1 + acc2, acc1)
    }
    if(n <=2) 1
    else helper(2,1,1)

  }
  println(fib(8))

}
