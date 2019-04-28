name := "SBTExampleProject"
// The group ID you have registered with, see above
organization := "com.odigeo"
version := "0.1"

scalaVersion := "2.12.8"

libraryDependencies += "org.scala-lang.modules" %% "scala-parser-combinators" % "1.1.0"
libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.5" % "test"
libraryDependencies += "org.scala-sbt" %% "scripted-plugin" % sbtVersion.value

resolvers ++= Seq(
  "Bintray" at "https://dl.bintray.com/sbt/sbt-plugin-releases/",
  "Typesafe" at "http://repo.typesafe.com/typesafe/releases/"
)
publishTo := sonatypePublishTo.value