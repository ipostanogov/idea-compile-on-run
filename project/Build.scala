import play.PlayScala
import sbt.Keys._
import sbt._

object Build extends Build {

  import BuildSettings._

  override lazy val settings = super.settings :+ {
    shellPrompt := { s => Project.extract(s).currentProject.id + " > " }
  }

  lazy val root = Project("my-root", file("."))
    .aggregate(myUtils, myUi)
    .settings(basicSettings: _*)

  lazy val myUtils = Project("my-utils", file("my-utils"))
    .settings(basicSettings: _*)

  lazy val myUi = Project("my-ui", file("my-ui"))
    .settings(basicSettings: _*)
    .enablePlugins(PlayScala)
}