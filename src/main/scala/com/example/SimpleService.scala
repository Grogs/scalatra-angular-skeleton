package com.example

import org.scalatra.ScalatraServlet

/**
 * Author: Greg Dorrell
 * Date: 30/05/2013
 */
class SimpleService extends ScalatraServlet {
  get("/") {"Hello world!"}
}
