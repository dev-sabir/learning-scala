package lectures.part1basics

object Expressions extends App{

    val x = 1 + 2 // EXPRESSION
    println(x)

    println(2 + 3 * 4)
    // + - * / & | ^ << >> >>>> (right shift zero expression)

    println(1 == x)
    // == != > >= < <=

    println( !(1 == x))
    // ! && ||

    var aVariable = 2
    aVariable += 3 // also works with -= *= /= ..... side effect
    println(aVariable)

    // Instructions(DO) vs Expressions(VALUES)
    // An Instruction is something we tell the computer to do, i.e. change a variable, print to the console , do this or do that. Instructions are executed
    // An expression is something that has some value and or a type. expressions are evaluated

  // IF EXPRESSION
  val aCondition = true
  val aConditionValue = if(aCondition) 5 else 3  // IF EXPRESSION
  println(aConditionValue) // 5
  println(if(aCondition) 5 else 3)  // 5

  var i=0
  while(i < 10){
    println(i)
    i +=1
  }

  // NEVER WRITE THIS AGAIN.
  // AVOID LOOP IS SCALA

  // EVERYTHING in Scala is an expression!

  val aWeirdValue = (aVariable = 3)  // Unit === void
  println(aWeirdValue)  // the value of unit in scala is ()
  // side effects in scala are actually expressions returning unit
  // the above while loop is side effect

  // side effects: println(), whiles, reassigning

  // Code Blocks
  val aCodeBlock = {
    val y = 2
    val z = y +1

    if(z > 2) "hello" else "goodbye"
}
  // Code block is also an expression
  // the value of the block is, value of the its last expressions
  // val anotherValue = z + 1
  // code block variables only resides the block

  // 1. Difference between "hello world" vs println("hello world")?
  // "hello world" -> is a value of type string
  // println("hello world") -> it is an expression which is a side effect

  // 2.

  val someValue = {
    2 < 3
  }

  // someValue -> true

  val someOtherValue = {
    if(someValue) 239 else 906
    42
  }

  // someOtherValue -> 42

}
