package in.Mehul.springRestAPI.service;

import in.Mehul.springRestAPI.model.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private static List<Employee> list = new ArrayList<>();

    static {
        Employee e = new Employee();
        e.setName("mehul");
        e.setAge(28L);
        e.setDepartment("Dev");
        e.setEmail("mehulsaxena45@gmail.com");
        e.setLocation("Banglore");
        list.add(e);

        e = new Employee();
        e.setName("saxena");
        e.setAge(22L);
        e.setDepartment("Dev");
        e.setEmail("saxena45@gmail.com");
        e.setLocation("Banglore");
        list.add(e);
    }


    @Override
    public List<Employee> getEmployee(){
        return list;
    }
}
