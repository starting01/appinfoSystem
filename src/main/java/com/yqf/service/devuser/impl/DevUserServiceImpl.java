package com.yqf.service.devuser.impl;

import com.yqf.dao.DevUserMapper;
import com.yqf.pojo.DevUser;
import com.yqf.service.devuser.DevUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author peak
 * @Version 1.0
 */
@Service("devUserService")
public class DevUserServiceImpl implements DevUserService {

    @Autowired
    private DevUserMapper devUserMapper;

    @Override
    public DevUser getDevUserByName(String devCode,String devPassword) {
        return devUserMapper.getDevUserByName(devCode,devPassword);
    }
}
