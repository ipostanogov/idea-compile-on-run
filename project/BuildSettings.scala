import sbt.Keys._
import sbt.Resolver

object BuildSettings {

  lazy val basicSettings = Seq(
    version := "0.1-SNAPSHOT",
    resolvers ++= Seq(
      Resolver.sonatypeRepo("releases"),
      Resolver.typesafeRepo("releases")
    ),
    scalaVersion := "2.11.6"
  )
}