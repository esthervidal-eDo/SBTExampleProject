ThisBuild / organization := "com.odigeo"
ThisBuild / organizationName := "odigeo"
ThisBuild / organizationHomepage := Some(url("http://odigeo.com/"))

ThisBuild / scmInfo := Some(
  ScmInfo(
    url("https://github.com/evidalodigeo/SbtExampleProject"),
    "scm:git@github.com:evidalodigeo/SbtExampleProject.git"
  )
)
ThisBuild / developers := List(
  Developer(
    id    = "esther.vidal",
    name  = "Esther Vidal ",
    email = "esther.vidal@edreamsodigeo.com",
    url = new URL("http://www.esthervidal.com")
  )
)

ThisBuild / description := "Some descripiton about your project."
ThisBuild / licenses := List("Apache 2" -> new URL("http://www.apache.org/licenses/LICENSE-2.0.txt"))
ThisBuild / homepage := Some(url("https://github.com/evidalodigeo/SbtExampleProject"))

// Remove all additional repository other than Maven Central from POM
ThisBuild / pomIncludeRepository := { _ => false }
ThisBuild / publishTo := {
  val nexus = "https://localhost:8081/"
  if (isSnapshot.value) Some("snapshots" at nexus + "content/repositories/snapshots")
  else Some("releases" at nexus + "service/local/staging/deploy/maven2")
}
ThisBuild / publishMavenStyle := true