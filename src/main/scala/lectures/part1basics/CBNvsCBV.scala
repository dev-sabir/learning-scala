package lectures.part1basics

object CBNvsCBV extends App{

  def callByValue(x: Long) = {
    println("by value: " +  x)
    println("by value: " + x)
  }

  def callByName(x : => Long) = {
    println("by name: " +  x)
    println("by name: " + x)
  }

  callByValue(System.nanoTime())
  callByName(System.nanoTime())

  def infinite(): Int = 1 + infinite()
  def printFirst(x: Int, y: => Int) = println(x)

//  println(infinite(), 34)
  printFirst(34, infinite())

  // Call by value:
  // . value is computed before call
  // . same value used everywhere

  // call by name:
  // . expression is passed literally
  // . expression is evaluated at every use within
}
