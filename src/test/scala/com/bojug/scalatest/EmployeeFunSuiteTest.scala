package com.bojug.scalatest

import org.scalatest.funsuite.AnyFunSuite
import com.bojug.scala.Employee

class EmployeeFunSuiteTest extends AnyFunSuite {

  test("employees with same name are same") {
    val emp1 = Employee("john")
    val emp2 = Employee("john")
    assert(emp1 === emp2)
  }

}
