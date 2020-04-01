ThisBuild / scalaVersion     := "2.12.10"
ThisBuild / version          := "0.1.0-SNAPSHOT"
ThisBuild / organization     := "com.example"
ThisBuild / organizationName := "example"

lazy val scalaTest = "org.scalatest" %% "scalatest" % "3.1.1"
lazy val mockitoScala = "org.mockito" %% "mockito-scala-scalatest" % "1.13.4"

lazy val root = (project in file("."))
  .settings(
    name := "mockito-scala-wasNever-calledAgain-bug",
    libraryDependencies += scalaTest % Test,
    libraryDependencies += mockitoScala % Test
  )

