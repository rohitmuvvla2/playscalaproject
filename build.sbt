name := """playwidgets-2"""
organization := "com.playwidge"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.13.15"

libraryDependencies += guice
libraryDependencies += "org.scalatestplus.play" %% "scalatestplus-play" % "7.0.1" % Test
libraryDependencies += "com.typesafe.play" %% "play-json" % "2.9.2"
//libraryDependencies += "com.typesafe.play" %% "play-json" % "2.9.2"

// Adds additional packages into Twirl
//TwirlKeys.templateImports += "com.playwidge.controllers._"

// Adds additional packages into conf/routes
// play.sbt.routes.RoutesKeys.routesImport += "com.playwidge.binders._"
