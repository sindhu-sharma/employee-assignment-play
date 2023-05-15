package controllers;

import com.fasterxml.jackson.databind.JsonNode;
import model.EmployeeDTO;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Http;
import play.mvc.Result;
import services.EmployeeService;

import javax.inject.Inject;
import java.util.Optional;

public class EmployeeController extends Controller {

    @Inject
    EmployeeService employeeService;


    public Result getAllEmployee(){
        return ok(Json.toJson(employeeService.getAll()));
    }



    public Result get(Integer id){
        Optional<EmployeeDTO> employee = employeeService.getById(id);
        if(employee.isPresent()){
            return ok(Json.toJson(employee.get()));
        }
        return notFound();
    }


    public Result create(Http.Request request){
        JsonNode jsonData = request.body().asJson();
        try {
            EmployeeDTO employeeDTO = Json.fromJson(jsonData, EmployeeDTO.class);
            employeeDTO = employeeService.create(employeeDTO);
            return ok(Json.toJson(employeeDTO));
        } catch (RuntimeException e) {
            // Most probably invalid student data
            return badRequest(request.body().asJson());
        }

    }



    public Result update(Http.Request request,Integer id){
        JsonNode jsonData = request.body().asJson();
        try {
            EmployeeDTO employeeDTO = Json.fromJson(jsonData,EmployeeDTO.class);
            Optional<EmployeeDTO> employee = employeeService.update(employeeDTO,id);
            if(employee.isPresent()){
                return ok(Json.toJson(employee.get()));
            }
            return notFound();
        }catch(RuntimeException e){
            return badRequest(request.body().asJson());
        }
    }


    public Result delete(Integer id){
        employeeService.delete(id);
        return ok();
    }


}
