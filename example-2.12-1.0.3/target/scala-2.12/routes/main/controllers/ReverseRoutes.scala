
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/russell/code/play/play-scala-example/conf/routes
// @DATE:Sun Dec 03 23:09:40 CST 2017

import play.api.mvc.Call


import _root_.controllers.Assets.Asset

// @LINE:5
package controllers {

  // @LINE:5
  class ReverseExampleController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:6
    def view(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "view")
    }
  
    // @LINE:5
    def index(): Call = {
      
      Call("GET", _prefix)
    }
  
    // @LINE:7
    def message(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "message")
    }
  
  }

  // @LINE:10
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:10
    def versioned(file:Asset): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }


}
