import scala.scalajs.js.Dynamic.{global => g}

import utest._

object ExampleSpec extends TestSuite {
  def tests = Tests {
    'HelloWorld - {
      val fs = g.require("fs")
      val content = fs.readFileSync("/proc/cpuinfo")
      println(content)
    }
  }
}
