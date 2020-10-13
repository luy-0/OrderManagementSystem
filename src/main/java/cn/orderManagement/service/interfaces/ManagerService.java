package cn.orderManagement.service.interfaces;

import cn.orderManagement.bean.Manager;
import cn.orderManagement.vo.LoginVO;

public interface ManagerService {
    String registerManager(Manager manager);

    boolean loginManager(LoginVO loginVO);
}
