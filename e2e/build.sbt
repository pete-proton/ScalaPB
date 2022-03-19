import com.trueaccord.scalapb.{ScalaPbPlugin => PB}

PB.protobufSettings

PB.scalapbVersion in PB.protobufConfig := com.trueaccord.scalapb.Version.scalapbVersion

PB.javaConversions in PB.protobufConfig := true

PB.runProtoc in PB.protobufConfig := (args =>
      com.github.os72.protocjar.Protoc.runProtoc("-v261" +: args.toArray))

libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "2.2.1" % "test",
  "org.scalacheck" %% "scalacheck" % "1.13.4" % "test",
  "com.trueaccord.scalapb" %% "scalapb-runtime" % com.trueaccord.scalapb.Version.scalapbVersion % PB.protobufConfig
)

