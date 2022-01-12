package in.Mehul.springRestAPI.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

//@Controller
@RestController //@Controller +@ResponseBody
public class EmployController {

   //@RequestMapping(value = "/employees",method = RequestMethod.GET)
   @GetMapping("/employees")
   public String getEmployess(){
        return "display the list of Employess";
    }

    @GetMapping("/employees/{id}")
    public String getEmployee(@PathVariable("id") Long id){

       return "Fetching the emplyoyeddd details for the id "+id;

    }

    //localhost:8080/employess?id=34
   @DeleteMapping("/employees")
   public String deleteEmployee(@RequestParam("id") Long id){
       return "Deleting the employee details for the id " +id;

    }
}
