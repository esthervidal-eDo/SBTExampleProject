// Your profile name of the sonatype account. The default is the same with the organization value
//sonatypeProfileName := "(org.odigeo)"

// To sync with Maven central, you need to supply the following information:
publishMavenStyle := true

// License of your choice
licenses := Seq("APL2" -> url("http://www.apache.org/licenses/LICENSE-2.0.txt"))

// Where is the source code hosted
import xerial.sbt.Sonatype._
sonatypeProjectHosting := Some(GitHubHosting("esthervidal78", "SBTExampleProject", "esther.vidal@edreamsodigeo.com"))
// or
//sonatypeProjectHosting := Some(GitLabHosting("username", "projectName", "user@example.com"))

// or if you want to set these fields manually
/*homepage := Some(url("https://(your project url)"))
scmInfo := Some(
  ScmInfo(
    url("https://github.com/(account)/(project)"),
    "scm:git@github.com:(account)/(project).git"
  )
)
developers := List(
  Developer(id="(your id)", name="(your name)", email="(your e-mail)", url=url("(your home page)"))
)*/