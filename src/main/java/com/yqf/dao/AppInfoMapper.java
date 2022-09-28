package com.yqf.dao;

import com.yqf.pojo.AppInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author peak
 * @Version 1.0
 */
@Mapper
@Repository
public interface AppInfoMapper {
    //app信息列表
    List<AppInfo> appInfoList();



}
