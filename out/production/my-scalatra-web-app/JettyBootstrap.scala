import com.example.SimpleService
import org.eclipse.jetty.server.Server
import org.eclipse.jetty.webapp.WebAppContext
import org.scalatra.servlet.ScalatraListener

/**
 * Author: Greg Dorrell
 * Date: 30/05/2013
 */
object JettyBootstrap extends App {
  var port = 9000
  val server = new Server( port )

  val context = new WebAppContext()
  context setContextPath "/"
  context.setResourceBase( "src/main/webapp" )
  context.addEventListener(new ScalatraListener)
  context.addServlet(classOf[SimpleService],"/api")

  server.setHandler(context)
  server.start
  server.join
}


