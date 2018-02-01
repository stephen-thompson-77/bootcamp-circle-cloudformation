
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/stephen.thompson/Desktop/Development/Projects/bootcamp-circle-cloudformation/conf/routes
// @DATE:Thu Feb 01 14:12:48 GMT 2018

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset

// @LINE:1
package controllers.javascript {

  // @LINE:1
  class ReverseTodoController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:3
    def remove: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TodoController.remove",
      """
        function(epochMillis0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "remove/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("epochMillis", epochMillis0))})
        }
      """
    )
  
    // @LINE:1
    def list: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TodoController.list",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
    // @LINE:2
    def create: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TodoController.create",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + """"})
        }
      """
    )
  
    // @LINE:5
    def healthcheck: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TodoController.healthcheck",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "health"})
        }
      """
    )
  
  }


}
