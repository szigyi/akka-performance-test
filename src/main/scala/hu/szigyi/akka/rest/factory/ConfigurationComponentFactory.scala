package hu.szigyi.akka.rest.factory

import com.typesafe.config.ConfigFactory

trait ConfigurationComponentFactory {

  val config = ConfigFactory.load()
  val akkaConfig = config.getConfig("akka")
  val loggingConfig = config.getConfig("logging")

  def isDebug: Boolean = loggingConfig.getString("level").equalsIgnoreCase("debug")
}
