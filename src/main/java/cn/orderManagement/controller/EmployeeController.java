package cn.orderManagement.controller;

import cn.orderManagement.service.interfaces.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;



//    @GetMapping("/")
//    public Map<String,Object> register() {
//        Employee employee1=new Employee();
//        employee1.setEmployeeName("特朗普它妈");
//        employee1.setEmployeePassword("123456789");
//        employee1.setEmployeeAddress("白宫");
//        String str = employeeService.register(employee1);
//        Map<String,Object> stringObjectMap = new HashMap<>();
//        stringObjectMap.put("msg",str);
//        return stringObjectMap;
//    }
}
