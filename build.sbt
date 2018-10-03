val scalaSettings = Seq(
  scalaVersion := "2.12.5",
  scalacOptions ++= compilerOptions
)

lazy val compilerOptions = Seq(
  "-deprecation",
  "-encoding", "UTF-8",
  "-feature",
  "-deprecation",
  "-language:implicitConversions",
  "-unchecked",
  "-Yno-adapted-args",
  "-Ywarn-dead-code",
  "-Ywarn-numeric-widen",
  "-Xlint",
  "-language:_",
  "-Ypartial-unification"/*,
  "-Xfatal-warnings"*/
)

lazy val dependencies = Seq(
  "net.sourceforge.htmlcleaner" % "htmlcleaner" % "2.22"
)

lazy val testDependencies = Seq(
  "org.scalactic" %% "scalactic" % "3.0.5",
  "org.scalatest" %% "scalatest" % "3.0.5"
).map(_ % "test")


val h2s = project.in(file("."))
  .settings(scalaSettings)
  .settings(libraryDependencies ++= dependencies)
  .settings(libraryDependencies ++= testDependencies)


