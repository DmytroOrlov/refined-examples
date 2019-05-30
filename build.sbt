import Dependencies._

lazy val zioVersion = "1.0-RC4"

lazy val `refined-examples` = (project in file("."))
  .settings(
    inThisBuild(List(
      scalaVersion := "2.12.8",
      version := "0.1.0-SNAPSHOT",
      organization := "com.github.DmytroOrlov"
    )),
    addCompilerPlugin("org.spire-math" %% "kind-projector" % "0.9.10"),
    addCompilerPlugin(("org.scalameta" % "paradise" % "3.0.0-M11").cross(CrossVersion.full)),
    libraryDependencies ++= Seq(
      "eu.timepit" %% "refined"                 % "0.9.6",
      "eu.timepit" %% "refined-cats"            % "0.9.6", // optional
      "eu.timepit" %% "refined-eval"            % "0.9.6", // optional, JVM-only
      "eu.timepit" %% "refined-jsonpath"        % "0.9.6", // optional, JVM-only
      "eu.timepit" %% "refined-pureconfig"      % "0.9.6", // optional, JVM-only
      "eu.timepit" %% "refined-scalacheck"      % "0.9.6", // optional, scalacheck 1.14
      "eu.timepit" %% "refined-scodec"          % "0.9.6", // optional
      "eu.timepit" %% "refined-scopt"           % "0.9.6", // optional
      "eu.timepit" %% "refined-shapeless"       % "0.9.6", // optional
      "com.chuusai" %% "shapeless" % "2.3.3",
      "org.scalaz" %% "scalaz-zio" % zioVersion,
      "org.scalaz" %% "scalaz-zio-interop-cats" % zioVersion,
      "io.monix" %% "monix" % "3.0.0-RC2",
      "org.typelevel" %% "cats-core" % "1.6.0",
      "org.typelevel" %% "cats-mtl-core" % "0.5.0",
      "org.typelevel" %% "cats-tagless-macros" % "0.2.0",
      scalaTest % Test,
      scalaCheck % Test
    ),
    scalacOptions += "-Ypartial-unification"
  )
