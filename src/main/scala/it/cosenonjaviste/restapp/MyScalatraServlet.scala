package it.cosenonjaviste.restapp

import org.scalatra._
import scalate.ScalateSupport

class MyScalatraServlet extends FirstStepsWithScalatraStack {

  get("/") {
    <html>
      <body>
        <h1>Hello, world!</h1>
      </body>
    </html>
  }

}
