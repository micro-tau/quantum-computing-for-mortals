import sbt._
import microsites._

enablePlugins(MicrositesPlugin)

lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      organization := "com.microtau",
      scalaVersion := "2.12.8",
      version      := "0.0.0-SNAPSHOT"
    )),
    name := "quantum-computing-for-mortals",
    micrositeName := "Quantum Computing",
    micrositeDescription      := "Quantum Computing for Mortals",
    micrositeBaseUrl          := "/quantum-computing-for-mortals",
    micrositeDocumentationUrl := "/quantum-computing-for-mortals/docs.html",
    micrositeStaticDirectory  := (resourceDirectory in Compile).value / "microsite" / "slides",
    micrositeAuthor           := "MicroTau",
    micrositeGitterChannel    := true,
    micrositeGitterChannelUrl := "MicroTau/quantum-computing-for-mortals",
    micrositeHomepage         := "https://microtau.github.io/quantum-computing-for-mortals",
    micrositeGithubOwner      := "microtau",
    micrositeGithubRepo       := "quantum-computing-for-mortals",
    micrositeHighlightLanguages ++= Seq("haskell", "fsharp", "scala", "python", "java"),
    micrositeCDNDirectives    := CdnDirectives(
      jsList = List(
        "https://cdnjs.cloudflare.com/ajax/libs/mathjax/2.7.5/MathJax.js?config=TeX-MML-AM_CHTML,https://microtau.github.io/quantum-computing-for-mortals/js/mathjax-config.js"
      )
    ),
    libraryDependencies ++= {
      val scalaTestVersion = "3.0.5"
      Seq(
        "org.scalatest" %% "scalatest" % scalaTestVersion
      )
    }
)
