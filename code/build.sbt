import Dependencies._

lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      organization := "com.andreidiego",
      scalaVersion := "2.12.4",
      version      := "0.1.0-SNAPSHOT"
    )),
    name := "MPFi",
    libraryDependencies ++= Seq(
      scalaTest % Test,
      concordion % Test
    )
  )