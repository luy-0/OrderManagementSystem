package cn.orderManagement.service.interfaces;

import cn.orderManagement.bean.Employee;
import cn.orderManagement.vo.LoginVO;

public interface EmployeeService {
     String registerEmployee(Employee employee);

     boolean loginEmployee(LoginVO loginVO);
}
