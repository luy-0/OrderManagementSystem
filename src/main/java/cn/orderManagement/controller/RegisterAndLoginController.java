package cn.orderManagement.controller;

import cn.orderManagement.bean.DeliveryClerk;
import cn.orderManagement.bean.Employee;
import cn.orderManagement.bean.Manager;
import cn.orderManagement.service.interfaces.ClerkService;
import cn.orderManagement.service.interfaces.EmployeeService;
import cn.orderManagement.service.interfaces.ManagerService;
import cn.orderManagement.vo.RegisterVO;
import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
public class RegisterAndLoginController {

    @Autowired
    EmployeeService employeeService;

    @Autowired
    ManagerService managerService;

    @Autowired
    ClerkService clerkService;

    @RequestMapping("/register")
    @ResponseBody
    public Map<String, Object> register(@RequestBody RegisterVO registerVO) {
        Map<String, Object> resultMap = new HashMap<>();
        String resultMsg = null;
        if (registerVO.getPersonnel().equals("员工")) {
            Employee employee = new Employee();
            employee.setEmployeeName(registerVO.getUserName());
            employee.setEmployeePassword(registerVO.getPassword());
            employee.setEmployeeAddress(registerVO.getAddress());
            employee.setWorkNumber(registerVO.getWorkNumber());
            resultMsg = employeeService.registerEmployee(employee);
        }
        else if(registerVO.getPersonnel().equals("经理")){
            Manager manager = new Manager();
            manager.setManagerName(registerVO.getUserName());
            manager.setManagerPassword(registerVO.getPassword());
            manager.setManagerAddress(registerVO.getAddress());
            manager.setWorkNumber(registerVO.getWorkNumber());
            resultMsg = managerService.registerManager(manager);
        }
        else if(registerVO.getPersonnel().equals("送餐员")){
            DeliveryClerk deliveryClerk = new DeliveryClerk();
            deliveryClerk.setClearkName(registerVO.getUserName());
            deliveryClerk.setClearkPassword(registerVO.getPassword());
            deliveryClerk.setWorkNumber(registerVO.getWorkNumber());
            resultMsg = clerkService.registerClerk(deliveryClerk);
        }
        resultMap.put("msg",resultMsg);
        return resultMap;
    }


    @RequestMapping("/login")
    public String login(){
        return "Sign in.html";
    }

    @RequestMapping(value="/checkLogin", produces = "application/json;charset=UTF-8")
    @ResponseBody
    public Map<String,Object> checkLogin(@RequestBody JSONObject jsonObject){
        Map<String, Object> resultMap = new HashMap<>();
        String resultMsg = null;
        System.out.println("hello");
        System.out.println(jsonObject.toJSONString());
//        if(loginVO.getPersonnel().equals("员工")){
//            if(employeeService.loginEmployee(loginVO)){
//                resultMsg="登录成功";
//            }else{
//                resultMsg="账号或密码错误";
//            }
//        }
//        else if(loginVO.getPersonnel().equals("经理")){
//             if(managerService.loginManager(loginVO)){
//                resultMsg="登录成功";
//            }else{
//                resultMsg="账号或密码错误";
//            }
//        }
//        else if(loginVO.getPersonnel().equals("送餐员")){
//            if(clerkService.loginClerk(loginVO)){
//                resultMsg="登录成功";
//            }else{
//                resultMsg="账号或密码错误";
//            }
//        }
        resultMap.put("msg",resultMsg);
        return resultMap;
    }
}
