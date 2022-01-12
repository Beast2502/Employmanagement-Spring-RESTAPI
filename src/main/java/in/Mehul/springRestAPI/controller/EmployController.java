package in.Mehul.springRestAPI.controller;


import in.Mehul.springRestAPI.model.Employee;
import in.Mehul.springRestAPI.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@Controller
@RestController //@Controller +@ResponseBody
public class EmployController {

    @Autowired
    private EmployeeService eService;

    @Value("${app.name}")
    private String appName;

    @Value("${app.version}")
    private String appVersion;

    @GetMapping("/version")
    public String getAppDetails(){
        return appName+ "-" + appVersion;
    }

   //@RequestMapping(value = "/employees",method = RequestMethod.GET)
   @GetMapping("/employees")
   public List<Employee> getEmployess(){
        return eService.getEmployee();
    }

    @GetMapping("/employees/{id}")
    public String getEmployee(@PathVariable("id") Long id){

       return "Fetching the emplyoyeddd details for the id "+id;

    }

    @PostMapping("/employees")
    public String saveEmployee(@RequestBody Employee employee){
        return "Saving the employee details to the database" + employee;
    }

    @PutMapping("/employees/{id}")
    public Employee updateEmployee(@PathVariable("id") Long id , @RequestBody Employee employee){
       System.out.println("Updating the Employee detail of id "+id);
       return employee;

    }

    //localhost:8080/employess?id=34
   @DeleteMapping("/employees")
   public String deleteEmployee(@RequestParam("id") Long id){
       return "Deleting the employee details for the id " +id;

    }
}
