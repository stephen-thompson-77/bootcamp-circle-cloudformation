
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/stephen.thompson/Desktop/Development/Projects/bootcamp-circle-cloudformation/conf/routes
// @DATE:Thu Feb 01 14:12:48 GMT 2018

import play.api.mvc.Call


import _root_.controllers.Assets.Asset

// @LINE:1
package controllers {

  // @LINE:1
  class ReverseTodoController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:3
    def remove(epochMillis:Long): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "remove/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("epochMillis", epochMillis)))
    }
  
    // @LINE:1
    def list(): Call = {
      
      Call("GET", _prefix)
    }
  
    // @LINE:2
    def create(): Call = {
      
      Call("POST", _prefix)
    }
  
    // @LINE:5
    def healthcheck(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "health")
    }
  
  }


}
