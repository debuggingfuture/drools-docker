name := """drools-docker"""

version := "0.1"

scalaVersion := "2.11.6"

scalacOptions ++= Seq(
  "-deprecation",
  "-unchecked",
  "-feature",
  "-language:postfixOps",
  "-Xfatal-warnings"
)

//mainClass in assembly := Some("")

libraryDependencies ++= {
  val droolsVersion = "6.2.0.Final"
  Seq(
    "org.drools" % "drools-core" % droolsVersion,
    "org.drools" % "drools-compiler" % droolsVersion,
    "org.drools" % "knowledge-api" % droolsVersion
  )
}