import sbt._
import Keys._

object Dependencies {

  val AlluxioVersion = "1.4.0"
  val ScalaVersion = "2.11.11"
  val ScalaLoggingVersion = "3.5.0"
  val ScalaTestVersion = "3.0.1"
  val ScoptVersion = "3.5.0"
  val SparkVersion = "2.4.4"

  val Common = Seq(
    libraryDependencies ++= Seq(
      "org.scalatest" %% "scalatest" % ScalaTestVersion % Test,
      "com.typesafe.scala-logging" %% "scala-logging" % ScalaLoggingVersion
    )
  )

  val Spark = Seq(
    libraryDependencies ++= Seq(
      "org.apache.spark" %% "spark-core" % SparkVersion % Provided,
      "org.apache.spark" %% "spark-sql" % SparkVersion % Provided
    )
  )

  val SparkMllib = Seq(
    libraryDependencies ++= Seq(
      "org.apache.spark" %% "spark-mllib" % SparkVersion % Provided
    )
  )

  val Alluxio = Seq(
    libraryDependencies ++= Seq(
      "org.alluxio" % "alluxio-core-client" % AlluxioVersion % Provided
    )
  )

libraryDependencies ++= Seq(
  "org.apache.logging.log4j" %% "log4j-api-scala" % "11.0",
  "org.apache.logging.log4j" % "log4j-api" % "2.11.0",
  "org.apache.logging.log4j" % "log4j-core" % "2.11.0" % Runtime
)
  val Scopt = Seq(
    libraryDependencies ++= Seq(
      "com.github.scopt" %% "scopt" % ScoptVersion
    )
  )

}