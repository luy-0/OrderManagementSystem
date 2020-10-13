package cn.orderManagement.service.impl;

import cn.orderManagement.bean.Employee;
import cn.orderManagement.bean.EmployeeExample;
import cn.orderManagement.dao.EmployeeMapper;
import cn.orderManagement.service.interfaces.EmployeeService;
import cn.orderManagement.vo.LoginVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    EmployeeMapper employeeMapper;

    @Override
    public String registerEmployee(Employee employee) {
        EmployeeExample employeeExample = new EmployeeExample();
        EmployeeExample.Criteria criteria = employeeExample.createCriteria();
        criteria.andWorkNumberEqualTo(employee.getWorkNumber());
        List<Employee> employeeList = employeeMapper.selectByExample(employeeExample);
        if (employeeList.size() != 0) {
            return "已经存在这个用户了";
        }
        employeeMapper.insert(employee);
        return "注册成功";
    }

    @Override
    public boolean loginEmployee(LoginVO loginVO) {
        String employeeName = loginVO.getWorkNumberOrUserName();
        String workNumber = loginVO.getWorkNumberOrUserName();
        EmployeeExample employeeExample = new EmployeeExample();
        EmployeeExample.Criteria criteria1 = employeeExample.createCriteria();
        criteria1.andEmployeeNameEqualTo(employeeName);
        EmployeeExample.Criteria criteria2 = employeeExample.createCriteria();
        criteria2.andWorkNumberEqualTo(workNumber);
        employeeExample.or(criteria2);
        List<Employee> employeeList = employeeMapper.selectByExample(employeeExample);
        if(employeeList.size()!=0){
            return true;
        }
        return  false;
    }
}
