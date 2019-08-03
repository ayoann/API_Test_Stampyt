package controllers

import io.swagger.annotations._
import javax.inject.Inject
import play.api.mvc.{AbstractController, ControllerComponents}

@Api
class CarsController @Inject()(cc: ControllerComponents) extends AbstractController(cc) {

  @ApiResponses(Array(
    new ApiResponse(code = 400, message = "Invalid ID"),
    new ApiResponse(code = 404, message = "Cars not found")))
  def getOneCardById(@ApiParam(value = "ID Cars") id: String) = Action {
    Ok("Your new application is ready.")
  }

  @ApiResponses(Array(
    new ApiResponse(code = 500, message = "Invalid Request"),
    new ApiResponse(code = 404, message = "Cars not found")))
  def getAllCars = Action {
    Ok("Your new application is ready.")
  }

  @ApiResponses(Array(
    new ApiResponse(code = 400, message = "Invalid ID"),
    new ApiResponse(code = 500, message = "Request Invalid")))
  def post = Action {
    Ok("Your new application is ready.")
  }

  @ApiResponses(Array(
    new ApiResponse(code = 400, message = "Invalid ID"),
    new ApiResponse(code = 404, message = "Cars not found")))
  def putOneCarsById(@ApiParam(value = "ID Cars") id: String) = Action {
    Ok("Your new application is ready.")
  }

  @ApiResponses(Array(
    new ApiResponse(code = 400, message = "Invalid ID"),
    new ApiResponse(code = 404, message = "Cars not found"),
    new ApiResponse(code = 500, message = "Request Invalid")))
  def deleteOneCarsById(@ApiParam(value = "ID Car") id: String) = Action {
    Ok("Your new application is ready.")
  }

  @ApiResponses(Array(
    new ApiResponse(code = 400, message = "Invalid Ressource"),
    new ApiResponse(code = 500, message = "Request Invalid")))
  def deleteAllCars = Action {
    Ok("Your new application is ready.")
  }

}
