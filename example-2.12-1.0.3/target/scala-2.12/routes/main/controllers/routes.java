
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/russell/code/play/play-scala-example/conf/routes
// @DATE:Sun Dec 03 23:09:40 CST 2017

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseExampleController ExampleController = new controllers.ReverseExampleController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseAssets Assets = new controllers.ReverseAssets(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseExampleController ExampleController = new controllers.javascript.ReverseExampleController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseAssets Assets = new controllers.javascript.ReverseAssets(RoutesPrefix.byNamePrefix());
  }

}
