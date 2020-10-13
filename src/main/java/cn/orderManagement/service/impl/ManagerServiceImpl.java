package cn.orderManagement.service.impl;

import cn.orderManagement.bean.Manager;
import cn.orderManagement.bean.ManagerExample;
import cn.orderManagement.dao.ManagerMapper;
import cn.orderManagement.service.interfaces.ManagerService;
import cn.orderManagement.vo.LoginVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ManagerServiceImpl implements ManagerService {

    @Autowired
    ManagerMapper managerMapper;

    @Override
    public String registerManager(Manager manager) {
        ManagerExample managerExample = new ManagerExample();
        ManagerExample.Criteria criteria = managerExample.createCriteria();
        criteria.andWorkNumberEqualTo(manager.getWorkNumber());
        List<Manager> managerList = managerMapper.selectByExample(managerExample);
        if(managerList.size()!=0){
            return "已经有这个用户了";
        }
        managerMapper.insert(manager);
        return "注册成功";
    }

    @Override
    public boolean loginManager(LoginVO loginVO) {
        String managerName = loginVO.getWorkNumberOrUserName();
        String workNumber = loginVO.getWorkNumberOrUserName();
        ManagerExample managerExample = new ManagerExample();
        ManagerExample.Criteria criteria1 =managerExample.createCriteria();
        criteria1.andManagerNameEqualTo(managerName);
        ManagerExample.Criteria criteria2 =managerExample.createCriteria();
        criteria2.andWorkNumberEqualTo(workNumber);
        managerExample.or(criteria2);
        List<Manager> managerList = managerMapper.selectByExample(managerExample);
        if(managerList.size()!=0){
            return true;
        }
        return false;
    }
}
