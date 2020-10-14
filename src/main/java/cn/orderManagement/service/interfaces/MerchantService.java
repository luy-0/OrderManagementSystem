package cn.orderManagement.service.interfaces;

import cn.orderManagement.bean.Merchant;
import cn.orderManagement.vo.LoginVO;

public interface MerchantService {

    String registerMerchant(Merchant merchant);

    boolean loginMerchant(LoginVO loginVO);
}
