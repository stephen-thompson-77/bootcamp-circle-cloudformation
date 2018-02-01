
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/stephen.thompson/Desktop/Development/Projects/bootcamp-circle-cloudformation/conf/routes
// @DATE:Thu Feb 01 14:12:48 GMT 2018


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
