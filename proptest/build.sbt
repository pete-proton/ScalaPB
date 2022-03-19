resolvers ++= Seq(
  "Sonatype Releases" at "https://oss.sonatype.org/content/repositories/releases"
  )

libraryDependencies ++= Seq(
  "com.google.protobuf" % "protobuf-java" % "2.6.1",
  "com.trueaccord.lenses" %% "lenses" % "0.4.8",
  "org.scalacheck" %% "scalacheck" % "1.13.4" % "test",
  "org.scalatest" %% "scalatest" % (if (scalaVersion.value.startsWith("2.12")) "3.0.4" else "2.2.5") % "test",
  "com.github.os72" % "protoc-jar" % "3.0.0-a3"
)

libraryDependencies += "org.scala-lang" % "scala-compiler" % scalaVersion.value

fork in Test := false
