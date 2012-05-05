
name := "my-spark-project"

version := "1.0"

organization := "edu.berkeley.cs.amplab"

scalaVersion := "2.9.1"

libraryDependencies ++= Seq(
  //"org.spark-project" %% "spark-core" % "0.4-SNAPSHOT",
  //"org.spark-project" %% "spark-repl" % "0.4-SNAPSHOT",
  "org.scalatest" %% "scalatest" % "1.6.1" % "test"
)

resolvers ++= Seq(
  "Typesafe" at "http://repo.typesafe.com/typesafe/releases",
  "Scala Tools Snapshots" at "http://scala-tools.org/repo-snapshots/"
)

