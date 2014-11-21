package com.d1egoaz.testskeleton

import org.scalatest.FunSuite
 
class HelloSuite extends FunSuite {
 
  test("the name is d1egoaz") {
    val p = Person("d1egoaz") 
    assert(p.name === "d1egoaz")
  }
}

