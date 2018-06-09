package hu.szigyi.akka.rest.route

import akka.event.Logging
import akka.http.scaladsl.model.HttpEntity
import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.Route
import hu.szigyi.akka.rest.factory.ConfigurationComponentFactory

trait BasicRoute extends ConfigurationComponentFactory {

  def routes: Route = logRequestResult("service", Logging.DebugLevel)(baseLineRoute)

  def baseLineRoute = path("get") {
    get {
      complete(HttpEntity("response"))
    }
  }
}
