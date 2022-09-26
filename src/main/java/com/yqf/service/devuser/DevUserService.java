package com.yqf.service.devuser;

import com.yqf.pojo.DevUser;

/**
 * @author peak
 * @Version 1.0
 */
public interface DevUserService {
    DevUser getDevUserByName(String devCode,String devPassword);
}
