package it.cosenonjaviste.restapp

import org.scalatra._
import scalate.ScalateSupport

class MyScalatraServlet extends FirstStepsWithScalatraStack {

  get("/") {
    "Hello world!"
  }
  
}


