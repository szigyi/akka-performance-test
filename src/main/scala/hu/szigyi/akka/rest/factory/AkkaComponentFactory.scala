package hu.szigyi.akka.rest.factory

import akka.actor.ActorSystem
import akka.stream.ActorMaterializer
import com.typesafe.scalalogging.LazyLogging

import scala.concurrent.ExecutionContextExecutor

trait AkkaComponentFactory extends LazyLogging with ConfigurationComponentFactory {

  implicit val system: ActorSystem = ActorSystem()
  implicit val executor: ExecutionContextExecutor = system.dispatcher
  implicit val materializer: ActorMaterializer = ActorMaterializer()
}
