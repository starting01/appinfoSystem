package com.yqf.dao;

import com.yqf.pojo.DevUser;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * @author peak
 * @Version 1.0
 */
@Repository
public interface DevUserMapper {
    DevUser getDevUserByName(@Param("devCode") String devCode,@Param("devPassword") String devPassword);
}
