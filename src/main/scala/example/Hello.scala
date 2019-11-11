package example

object Hello extends App {
  val field1 = new Field[String, StringType]
  val field2 = new Field[java.lang.Boolean, BooleanType]

  val map = Map(
    field1 -> "abc",
    field2 -> true
  )

  val dataBuilder: DataBuilder = new DataBuilder

  map.foreach { case (key, value) => dataBuilder.addEntry(key, value) }
}
