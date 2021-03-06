package controllers

import play.api._
import play.api.mvc._
import play.api.libs.json._
import play.api.libs.functional.syntax._
import play.api.libs.json.Writes._

object Application extends Controller 
{
  
  def index = Action 
  {
    Ok(views.html.index("Your new application is ready."))
  }
  
/*
  def getCust = Action 
  {
      val json = inTransaction 
      {
         val custs = from(AppDB.custTable)(custTable => select(custTable))
         implicit object custFormat extends Format[Customer] 
         {
             def reads(json: JsValue) = JsSuccess(Customer((json \ "name").as[String]))
                                       //  (json \ "id").as[Long],
                                       //  (json \ "name").as[Option[String]]  )

             def writes(custt: Customer) = JsObject(Seq("id" -> JsNumber(custt.id),
                                                      "name" -> Json.toJson(custt.name) ) )
         }
         Json.toJson(custs)
       }
       Ok(json).as(JSON)
  }
 *
 *  
 */  
 
  def receiveCode = Action
  {
      request => 
         println("Application scala routine, line 43, request content type = " + request.contentType)
         println("Application scala routine, line 44, request body = " + request.body)
         println("Application scala routine, line 45, request body to String = " + request.toString)
/*
         request.session.get("name").map
           { 
             nam => Ok(Json.toJson(Map("message" -> ("Hello " + nam))))
           }.getOrElse
           {
             BadRequest(Json.toJson(Map("message" -> "Missing parameter")))
           }
 */    
/*
    request => 
         (name).asOpt[String].map 
           { 
             Ok (Json.toJson(Map("message" -> ("Hello " + request.body))))
           }
 */
/*
           .getOrElse
           {
             BadRequest(Json.toJson(Map("message" -> "Missing parameter [request.body]")))
           }        
 */
/*    
     request => 
       (request.body \ "name").asOpt[String].map 
           { 
             name => Ok (Json.toJson(Map("message" -> ("Hello " + name))))
           }.getOrElse
           {
             BadRequest(Json.toJson(Map("message" -> "Missing parameter [name]")))
           }    
 */      
/*
   request =>
     (request.body \ "name").asOpt[String].map 
          { 
              name =>Ok("Hello " + name)
          }.getOrElse
          {
              BadRequest("Missing parameter [name]")
          }
 */                    
//    val json = generate(Map("name" -> "lll"))   
//    Ok(json).as(JSON)
      Ok(Json.toJson(Map("name" -> "Fregon", "now" -> "4:00 pm")))
    
  }
  
  def receiveCode2 = Action
  {
      request => 
         println("Application scala routine, line 43, request content type = " + request.contentType)
         println("Application scala routine, line 44, request body = " + request.body)
         println("Application scala routine, line 45, request body to String = " + request.toString)
      Ok(Json.toJson(Map("name" -> "Fregon2", "now" -> "11:00 pm")))    
  }
  
  
}

/*
def sayHello = Action(parse.json) { request =>
  (request.body \ "name").asOpt[String].map { name =>
    Ok("Hello " + name)
  }.getOrElse {
    BadRequest("Missing parameter [name]")
  }
}


*/


/*  
  def sayHello = Action(parse.json) { request =>
  (request.body \ "name").asOpt[String].map { name =>
    Ok(toJson(
      Map("status" -> "OK", "message" -> ("Hello " + name))
    ))
  }.getOrElse {
    BadRequest(toJson(
      Map("status" -> "KO", "message" -> "Missing parameter [name]")
    ))
  }
}
*/  
