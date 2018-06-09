package hu.szigyi.akka.rest

import akka.http.scaladsl.Http
import hu.szigyi.akka.rest.factory.AkkaComponentFactory
import hu.szigyi.akka.rest.route.BasicRoute

object Server extends App with AkkaComponentFactory with BasicRoute {

  Http().bindAndHandle(routes, config.getString("akka.http.interface"), config.getInt("akka.http.port"))
}
