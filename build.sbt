name := """crud_play"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.11.6"

libraryDependencies ++= Seq(
  javaJdbc,
  cache,
  javaWs,
  javaJpa,
  "org.hibernate" % "hibernate-entitymanager" % "4.3.9.Final",
  "mysql" % "mysql-connector-java" % "5.1.18",
  "junit" % "junit" % "4.10"
)

// Play provides two styles of routers, one expects its actions to be injected, the
// other, legacy style, accesses its actions statically.
routesGenerator := InjectedRoutesGenerator
