
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

object welcome extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[String,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message: String, style: String = "scala"):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.44*/(""" 

"""),_display_(/*3.2*/defining(play.core.PlayVersion.current)/*3.41*/ { version =>_display_(Seq[Any](format.raw/*3.54*/("""

"""),format.raw/*5.1*/("""<section id="top">
  <div class="wrapper">
    <h1><a href="https://playframework.com/documentation/"""),_display_(/*7.59*/version),format.raw/*7.66*/("""/Home">"""),_display_(/*7.74*/message),format.raw/*7.81*/("""</a></h1>
  </div>
</section>

<div id="content" class="wrapper doc">
<article>

  <h1>Welcome to Play</h1>

  <blockquote>
    <p>
      Play """),_display_(/*18.13*/version),format.raw/*18.20*/("""
    """),format.raw/*19.5*/("""</p>
  </blockquote>

  <h2>Why do you see this page?</h2>

    <p>
      The <code>conf/routes</code> file defines a route that tells Play to invoke the <code>ExampleController.index</code> action
      whenever a browser requests the <code>/</code> URI using the GET method:
    </p>

    <pre><code># Home page
GET     /               controllers.ExampleController.index</code></pre>

    <p>
      Play has invoked the <code>controllers.ExampleController.index</code> method to obtain the <code>Action</code> to execute:
    </p>

    <pre><code>def index = Action """),format.raw/*36.35*/("""{"""),format.raw/*36.36*/(""" """),format.raw/*36.37*/("""implicit request: Request[AnyContent] =>
  Ok(views.html.index("Your new application is ready!"))
"""),format.raw/*38.1*/("""}"""),format.raw/*38.2*/("""</code></pre>
    <p>
      The template is defined in the <code>app/views/index.scala.html</code> file and compiled as a Scala function.
    </p>
    <pre><code>@(message: String)

@main("Welcome to Play") """),format.raw/*44.27*/("""{"""),format.raw/*44.28*/("""

    """),format.raw/*46.5*/("""@welcome(message)

"""),format.raw/*48.1*/("""}"""),format.raw/*48.2*/("""</code></pre>
    <!--
    <h2>Async Controller</h2>
    <p>
        <a href=""""),_display_(/*52.19*/routes/*52.25*/.ExampleController.message),format.raw/*52.51*/("""">Click here for the AsyncController action!</a>
    </p>
    <p>
        You can read more about <a href="https://www.playframework.com/documentation/"""),_display_(/*55.87*/version),format.raw/*55.94*/("""/ScalaAsync">asynchronous actions</a> in the documentation.
    </p>
    -->
</article>
</div>
""")))}),format.raw/*60.2*/("""
"""))
      }
    }
  }

  def render(message:String,style:String): play.twirl.api.HtmlFormat.Appendable = apply(message,style)

  def f:((String,String) => play.twirl.api.HtmlFormat.Appendable) = (message,style) => apply(message,style)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Dec 03 23:25:19 CST 2017
                  SOURCE: /Users/russell/code/play/play-scala-example/app/views/welcome.scala.html
                  HASH: ef612f9145a137ed3788408887da6f68ff6630be
                  MATRIX: 738->1|875->43|904->47|951->86|1001->99|1029->101|1156->202|1183->209|1217->217|1244->224|1415->368|1443->375|1475->380|2072->949|2101->950|2130->951|2255->1049|2283->1050|2518->1259|2547->1260|2580->1266|2626->1286|2654->1287|2760->1366|2775->1372|2822->1398|3001->1550|3029->1557|3155->1653
                  LINES: 21->1|26->1|28->3|28->3|28->3|30->5|32->7|32->7|32->7|32->7|43->18|43->18|44->19|61->36|61->36|61->36|63->38|63->38|69->44|69->44|71->46|73->48|73->48|77->52|77->52|77->52|80->55|80->55|85->60
                  -- GENERATED --
              */
          