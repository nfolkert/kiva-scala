import sbt._

class KivaScalaProject(info: ProjectInfo) extends DefaultWebProject(info) {
  override def managedStyle = ManagedStyle.Maven
  override def packageSrcJar= defaultJarPath("-sources.jar")

  val liftVersion = "2.4-M2"

  lazy val JavaNet = "Java.net Maven2 Repository" at "http://download.java.net/maven/2/"

  override def managedStyle = ManagedStyle.Maven
  override def packageSrcJar= defaultJarPath("-sources.jar")

  val liftWebKit = "net.liftweb" %% "lift-webkit" % liftVersion.value.toString % "compile"

  val liftCommon = "net.liftweb" %% "lift-common" % "2.4-M1" % "compile" withSources()
  val liftUtil = "net.liftweb" %% "lift-util" % "2.4-M1" % "compile" withSources()
  val liftJson = "net.liftweb" %% "lift-json" % "2.4-M1" % "compile" withSources()
  val scalajCollection  = "org.scalaj" %% "scalaj-collection"  % "1.1"
  val scalajHttp = "org.scalaj" %% "scalaj-http" % "0.2.8" % "compile" withSources()

  val liftRecord = "net.liftweb" %% "lift-record" % liftVer % "compile" withSources()
  val liftMongo = "net.liftweb" %% "lift-mongodb" % liftVer % "compile" withSources() intransitive()
  val liftMongoRecord = "net.liftweb" %% "lift-mongodb-record" % liftVer % "compile" withSources() intransitive()
  val mongo = "org.mongodb" % "mongo-java-driver" % "2.6.5" withSources()

  val servlet = "javax.servlet" % "servlet-api" % "2.5" % "provided"
  val jetty6 = "org.mortbay.jetty" % "jetty" % "6.1.25" % "test,provided"
  val jettyutils = "org.mortbay.jetty" % "jetty-util" % "6.1.25" % "test,provided"

  val logback = "ch.qos.logback" % "logback-classic" % "0.9.26"

  val h2db = "com.h2database" % "h2" % "1.2.138"

  val junit = "junit" % "junit" % "4.8.2" % "test" withSources()
  val specs = "org.scala-tools.testing" %% "specs" % "1.6.6" % "test" withSources()

  val bryanjswift = "Bryan J Swift Repository" at "http://repos.bryanjswift.com/maven2/"
  val junitInterface = "com.novocode" % "junit-interface" % "0.6" % "test"
  override def testFrameworks = super.testFrameworks ++ List(new TestFramework("com.novocode.junit.JUnitFrameworkNoMarker"))
}
