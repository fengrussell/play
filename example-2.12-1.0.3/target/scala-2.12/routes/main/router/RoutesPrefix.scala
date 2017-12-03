
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/russell/code/play/play-scala-example/conf/routes
// @DATE:Sun Dec 03 23:09:40 CST 2017


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
