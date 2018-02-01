
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/stephen.thompson/Desktop/Development/Projects/bootcamp-circle-cloudformation/conf/routes
// @DATE:Thu Feb 01 14:12:48 GMT 2018

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:1
  TodoController_0: controllers.TodoController,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:1
    TodoController_0: controllers.TodoController
  ) = this(errorHandler, TodoController_0, "/")

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, TodoController_0, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.TodoController.list"""),
    ("""POST""", this.prefix, """controllers.TodoController.create"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """remove/""" + "$" + """epochMillis<[^/]+>""", """controllers.TodoController.remove(epochMillis:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """health""", """controllers.TodoController.healthcheck"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:1
  private[this] lazy val controllers_TodoController_list0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_TodoController_list0_invoker = createInvoker(
    TodoController_0.list,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TodoController",
      "list",
      Nil,
      "GET",
      this.prefix + """""",
      """""",
      Seq()
    )
  )

  // @LINE:2
  private[this] lazy val controllers_TodoController_create1_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_TodoController_create1_invoker = createInvoker(
    TodoController_0.create,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TodoController",
      "create",
      Nil,
      "POST",
      this.prefix + """""",
      """""",
      Seq()
    )
  )

  // @LINE:3
  private[this] lazy val controllers_TodoController_remove2_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("remove/"), DynamicPart("epochMillis", """[^/]+""",true)))
  )
  private[this] lazy val controllers_TodoController_remove2_invoker = createInvoker(
    TodoController_0.remove(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TodoController",
      "remove",
      Seq(classOf[Long]),
      "POST",
      this.prefix + """remove/""" + "$" + """epochMillis<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:5
  private[this] lazy val controllers_TodoController_healthcheck3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("health")))
  )
  private[this] lazy val controllers_TodoController_healthcheck3_invoker = createInvoker(
    TodoController_0.healthcheck,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TodoController",
      "healthcheck",
      Nil,
      "GET",
      this.prefix + """health""",
      """""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:1
    case controllers_TodoController_list0_route(params@_) =>
      call { 
        controllers_TodoController_list0_invoker.call(TodoController_0.list)
      }
  
    // @LINE:2
    case controllers_TodoController_create1_route(params@_) =>
      call { 
        controllers_TodoController_create1_invoker.call(TodoController_0.create)
      }
  
    // @LINE:3
    case controllers_TodoController_remove2_route(params@_) =>
      call(params.fromPath[Long]("epochMillis", None)) { (epochMillis) =>
        controllers_TodoController_remove2_invoker.call(TodoController_0.remove(epochMillis))
      }
  
    // @LINE:5
    case controllers_TodoController_healthcheck3_route(params@_) =>
      call { 
        controllers_TodoController_healthcheck3_invoker.call(TodoController_0.healthcheck)
      }
  }
}
