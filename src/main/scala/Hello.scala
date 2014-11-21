package com.d1egoaz.testskeleton

object Hello extends App {
  val p = Person("d1egoaz")
  println("Hello: " + p.name)
}

case class Person(name: String)

