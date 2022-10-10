package lectures.part1basics

object ValuesVariablesTypes extends App{

  val x: Int = 42
  println(x)
  // x = 2  VALS  ARE IMMUTABLE(can't reassigned)

  val z = 22;
  // COMPILER CAN INFER TYPES

  val aString: String = "hello"
  val anotherString = "goodbye"

  val aBoolean: Boolean= false
  val aChar: Char = 'a'
  val anInt: Int = x
  val aShort: Short = 4012 // 2 bytes
  val aLong: Long =1234562356677L // 8 bytes
  val aFloat: Float = 2.0f
  val aDouble: Double = 3.14


  // variables in scala
  var aVariable: Int = 4
  // variable can reassign
  aVariable = 5 // side effects more example of side effects i.e. changing a variable, printing something to console, displaying something on screen

  // prefer vals over vars
  // all vals and vars have types
  // compiler automatically infers types when omitted

}
