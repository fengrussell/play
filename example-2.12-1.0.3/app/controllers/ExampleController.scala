package controllers

import javax.inject._
import play.api.mvc._

import akka.actor.ActorSystem
import scala.concurrent.duration._
import scala.concurrent.{ExecutionContext, Future, Promise}

@Singleton
class ExampleController @Inject()(actorSystem: ActorSystem, cc: ControllerComponents)(implicit exec: ExecutionContext) extends AbstractController(cc) {

  def index = Action {
    Ok(views.html.index("Welcome to play exmaple, scala version: 2.12, sbt version: 1.0.13"))
  }

  def view = Action {
    Ok("welcome to play")
  }

  def message = Action.async {
    getFutureMessage(1.second).map { msg => Ok(msg) }
  }

  private def getFutureMessage(delayTime: FiniteDuration): Future[String] = {
    val promise: Promise[String] = Promise[String]()
    actorSystem.scheduler.scheduleOnce(delayTime) {
      promise.success("Hi!")
    }(actorSystem.dispatcher) // run scheduled tasks using the actor system's dispatcher
    promise.future
  }
}
