enablePlugins(ScalaJSPlugin)

name := "example"

scalaVersion := "2.12.8"

libraryDependencies += "com.lihaoyi" %%% "utest" % "0.6.3" % "test"

testFrameworks += new TestFramework("utest.runner.Framework")

jsEnv := new org.scalajs.jsenv.jsdomnodejs.JSDOMNodeJSEnv()
