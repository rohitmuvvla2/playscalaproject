package controllers

import javax.inject._
import play.api.mvc._
import play.api.libs.json._
import models.User

@Singleton
class UserController @Inject()(cc: ControllerComponents) extends AbstractController(cc) {

  // Sample in-memory list of users
  private val users = List(
    User(1, "John Doe", "john.doe@example.com"),
    User(2, "Jane Smith", "jane.smith@example.com"),
    User(3,"Surya K", "surya.k@example.com")

  )

  // Get all users
  def getUsers = Action {
    Ok(Json.toJson(users))
  }

  // Get a user by ID
  def getUser(id: Long) = Action {
    users.find(_.id == id) match {
      case Some(user) => Ok(Json.toJson(user))
      case None => NotFound(Json.obj("error" -> "User not found"))
    }
  }

  // Create a new user
  def createUser = Action(parse.json) { request =>
    val user = request.body.as[User]
    // Normally, you would save the user to the database here
    Created(Json.toJson(user))
  }
}
