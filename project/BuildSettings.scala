import sbt.Keys._

object BuildSettings {

  lazy val basicSettings = Seq(
    version := "0.1-SNAPSHOT",
    scalaVersion := "2.11.6"
  )
}