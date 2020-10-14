package cn.orderManagement.service.impl;

import cn.orderManagement.bean.Merchant;
import cn.orderManagement.bean.MerchantExample;
import cn.orderManagement.dao.MerchantMapper;
import cn.orderManagement.service.interfaces.MerchantService;
import cn.orderManagement.vo.LoginVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MerchantServiceImpl implements MerchantService {

    @Autowired
    MerchantMapper merchantMapper;

    @Override
    public String registerMerchant(Merchant merchant) {
        MerchantExample merchantExample = new MerchantExample();
        MerchantExample.Criteria criteria = merchantExample.createCriteria();
        criteria.andWorkNumberEqualTo(merchant.getWorkNumber());
        List<Merchant> merchantList = merchantMapper.selectByExample(merchantExample);
        if (merchantList.size()!=0){
            return "已经有这个用户了";
        }
        merchantMapper.insert(merchant);
        return "注册成功";
    }

    @Override
    public boolean loginMerchant(LoginVO loginVO) {
        String merchantName = loginVO.getWorkNumberOrUserName();
        String workNumber = loginVO.getWorkNumberOrUserName();
        MerchantExample merchantExample =  new MerchantExample();
        MerchantExample.Criteria criteria1 = merchantExample.createCriteria();
        criteria1.andWorkNumberEqualTo(workNumber);
        MerchantExample.Criteria criteria2 = merchantExample.createCriteria();
        criteria2.andMerchantNameEqualTo(merchantName);
        merchantExample.or(criteria2);
        List<Merchant> merchantList = merchantMapper.selectByExample(merchantExample);
        if(merchantList.size()!=0){
            return true;
        }
        return false;
    }
}
