resolvers ++= Seq(
  Classpaths.sbtPluginReleases,
  Resolver.url("sbt-scoverage repo", url("https://dl.bintray.com/sksamuel/sbt-plugins"))(Resolver.ivyStylePatterns)
)

addSbtPlugin("org.scalariform" %% "sbt-scalariform" % "1.5.1")

addSbtPlugin("org.scoverage" % "sbt-scoverage" % "1.3.1")

addSbtPlugin("org.scalastyle" %% "scalastyle-sbt-plugin" % "0.7.0")
