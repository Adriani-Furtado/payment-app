name := "provider"

version := "0.1"

scalaVersion := "2.13.10"

lazy val root = (project in file(".")).settings(
  inThisBuild(
    List(
      organization := "com.example",
      scalaVersion := "2.13.10"
    )
  ),
  name := "My App Project",
  libraryDependencies ++= Seq(
    "dev.zio"       %% "zio"               % "2.0.12",
    "org.typelevel" %% "cats-core"         % "2.9.0",
    "org.typelevel" %% "cats-effect"       % "3.4.8",
    "org.scalactic" %% "scalactic"         % "3.2.15" % Test,
    "org.scalatest" %% "scalatest"         % "3.2.15" % Test,
    "dev.zio"       %% "zio-test"          % "2.0.12" % Test,
    "dev.zio"       %% "zio-test-sbt"      % "2.0.12" % Test,
    "dev.zio"       %% "zio-test-magnolia" % "2.0.12" % Test
  )
)

Global / onChangedBuildSource := IgnoreSourceChanges