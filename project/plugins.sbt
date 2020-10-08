addSbtPlugin("org.portable-scala" % "sbt-scalajs-crossproject"      % "1.0.0")
addSbtPlugin("org.portable-scala" % "sbt-scala-native-crossproject" % "1.0.0")

val scalaJSVersion =
  Option(System.getenv("SCALAJS_VERSION")).getOrElse("1.2.0")
val scalaNativeJSVersion =
  Option(System.getenv("SCALANATIVE_VERSION")).getOrElse("0.4.0-M2")

addSbtPlugin("org.scala-js"       % "sbt-scalajs"                   % scalaJSVersion)
addSbtPlugin("org.scala-native"   % "sbt-scala-native"              % scalaNativeJSVersion)

addSbtPlugin("pl.project13.scala" % "sbt-jmh"                       % "0.4.0")
addSbtPlugin("com.jsuereth"       % "sbt-pgp"                       % "2.0.1")
addSbtPlugin("org.xerial.sbt"     % "sbt-sonatype"                  % "3.8.1")
