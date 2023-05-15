// @GENERATOR:play-routes-compiler
// @SOURCE:conf/routes

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  CountController_0: controllers.CountController,
  // @LINE:10
  AsyncController_1: controllers.AsyncController,
  // @LINE:13
  Assets_2: controllers.Assets,
  // @LINE:16
  EmployeeController_3: controllers.EmployeeController,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    CountController_0: controllers.CountController,
    // @LINE:10
    AsyncController_1: controllers.AsyncController,
    // @LINE:13
    Assets_2: controllers.Assets,
    // @LINE:16
    EmployeeController_3: controllers.EmployeeController
  ) = this(errorHandler, CountController_0, AsyncController_1, Assets_2, EmployeeController_3, "/")

  def withPrefix(addPrefix: String): Routes = {
    val prefix = play.api.routing.Router.concatPrefix(addPrefix, this.prefix)
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, CountController_0, AsyncController_1, Assets_2, EmployeeController_3, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.CountController.count"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """count""", """controllers.CountController.count"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """message""", """controllers.AsyncController.message"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(file:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """employee""", """controllers.EmployeeController.getAllEmployee"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """employee/""" + "$" + """id<[^/]+>""", """controllers.EmployeeController.get(id:Integer)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """employee""", """controllers.EmployeeController.create(request:Request)"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """employee/""" + "$" + """id<[^/]+>""", """controllers.EmployeeController.update(request:Request, id:Integer)"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """employee/""" + "$" + """id<[^/]+>""", """controllers.EmployeeController.delete(id:Integer)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_CountController_count0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_CountController_count0_invoker = createInvoker(
    CountController_0.count,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CountController",
      "count",
      Nil,
      "GET",
      this.prefix + """""",
      """ An example controller showing a sample home page""",
      Seq()
    )
  )

  // @LINE:8
  private[this] lazy val controllers_CountController_count1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("count")))
  )
  private[this] lazy val controllers_CountController_count1_invoker = createInvoker(
    CountController_0.count,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CountController",
      "count",
      Nil,
      "GET",
      this.prefix + """count""",
      """ An example controller showing how to use dependency injection""",
      Seq()
    )
  )

  // @LINE:10
  private[this] lazy val controllers_AsyncController_message2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("message")))
  )
  private[this] lazy val controllers_AsyncController_message2_invoker = createInvoker(
    AsyncController_1.message,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AsyncController",
      "message",
      Nil,
      "GET",
      this.prefix + """message""",
      """ An example controller showing how to write asynchronous code""",
      Seq()
    )
  )

  // @LINE:13
  private[this] lazy val controllers_Assets_versioned3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned3_invoker = createInvoker(
    Assets_2.versioned(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """ Map static resources from the /public folder to the /assets URL path""",
      Seq()
    )
  )

  // @LINE:16
  private[this] lazy val controllers_EmployeeController_getAllEmployee4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("employee")))
  )
  private[this] lazy val controllers_EmployeeController_getAllEmployee4_invoker = createInvoker(
    EmployeeController_3.getAllEmployee,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.EmployeeController",
      "getAllEmployee",
      Nil,
      "GET",
      this.prefix + """employee""",
      """for fetching all the employees from db""",
      Seq()
    )
  )

  // @LINE:20
  private[this] lazy val controllers_EmployeeController_get5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("employee/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_EmployeeController_get5_invoker = createInvoker(
    EmployeeController_3.get(fakeValue[Integer]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.EmployeeController",
      "get",
      Seq(classOf[Integer]),
      "GET",
      this.prefix + """employee/""" + "$" + """id<[^/]+>""",
      """for fetching the employee of specific id""",
      Seq()
    )
  )

  // @LINE:23
  private[this] lazy val controllers_EmployeeController_create6_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("employee")))
  )
  private[this] lazy val controllers_EmployeeController_create6_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      EmployeeController_3.create(fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.EmployeeController",
      "create",
      Seq(classOf[play.mvc.Http.Request]),
      "POST",
      this.prefix + """employee""",
      """for creation of a new employee info in db""",
      Seq()
    )
  )

  // @LINE:26
  private[this] lazy val controllers_EmployeeController_update7_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("employee/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_EmployeeController_update7_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      EmployeeController_3.update(fakeValue[play.mvc.Http.Request], fakeValue[Integer]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.EmployeeController",
      "update",
      Seq(classOf[play.mvc.Http.Request], classOf[Integer]),
      "PUT",
      this.prefix + """employee/""" + "$" + """id<[^/]+>""",
      """for updating already present employee in db""",
      Seq()
    )
  )

  // @LINE:29
  private[this] lazy val controllers_EmployeeController_delete8_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("employee/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_EmployeeController_delete8_invoker = createInvoker(
    EmployeeController_3.delete(fakeValue[Integer]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.EmployeeController",
      "delete",
      Seq(classOf[Integer]),
      "DELETE",
      this.prefix + """employee/""" + "$" + """id<[^/]+>""",
      """for deleting already present employee in db""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_CountController_count0_route(params@_) =>
      call { 
        controllers_CountController_count0_invoker.call(CountController_0.count)
      }
  
    // @LINE:8
    case controllers_CountController_count1_route(params@_) =>
      call { 
        controllers_CountController_count1_invoker.call(CountController_0.count)
      }
  
    // @LINE:10
    case controllers_AsyncController_message2_route(params@_) =>
      call { 
        controllers_AsyncController_message2_invoker.call(AsyncController_1.message)
      }
  
    // @LINE:13
    case controllers_Assets_versioned3_route(params@_) =>
      call(params.fromPath[String]("file", None)) { (file) =>
        controllers_Assets_versioned3_invoker.call(Assets_2.versioned(file))
      }
  
    // @LINE:16
    case controllers_EmployeeController_getAllEmployee4_route(params@_) =>
      call { 
        controllers_EmployeeController_getAllEmployee4_invoker.call(EmployeeController_3.getAllEmployee)
      }
  
    // @LINE:20
    case controllers_EmployeeController_get5_route(params@_) =>
      call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_EmployeeController_get5_invoker.call(EmployeeController_3.get(id))
      }
  
    // @LINE:23
    case controllers_EmployeeController_create6_route(params@_) =>
      call { 
        controllers_EmployeeController_create6_invoker.call(
          req => EmployeeController_3.create(req))
      }
  
    // @LINE:26
    case controllers_EmployeeController_update7_route(params@_) =>
      call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_EmployeeController_update7_invoker.call(
          req => EmployeeController_3.update(req, id))
      }
  
    // @LINE:29
    case controllers_EmployeeController_delete8_route(params@_) =>
      call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_EmployeeController_delete8_invoker.call(EmployeeController_3.delete(id))
      }
  }
}
