organization := "com.github.gphat"

name := "censorinus"

scalaVersion := "2.12.4"
crossScalaVersions := Seq("2.11.11", "2.12.2")

scalacOptions ++= Seq("-unchecked", "-deprecation", "-feature")

resolvers ++= Seq("snapshots", "releases").map(Resolver.sonatypeRepo)

libraryDependencies += "org.scalactic" %% "scalactic" % "3.0.3" % "test"
libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.3" % "test"
libraryDependencies += "com.thesamet.scalapb" %% "scalapb-runtime" % "0.7.0-rc6"
libraryDependencies += "org.scalacheck" %% "scalacheck" % "1.13.4"

releasePublishArtifactsAction := PgpKeys.publishSigned.value

Publish.settings

scalastyleFailOnError := true
