package com.yqf.service.appinfo.impl;

import com.yqf.dao.AppInfoMapper;
import com.yqf.pojo.AppInfo;
import com.yqf.service.appinfo.AppInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author peak
 * @Version 1.0
 */
@Service("appInfoService")
public class AppInfoServiceImpl implements AppInfoService {
    @Autowired
    private AppInfoMapper appInfoMapper;

    @Override
    public List<AppInfo> appInfoList() {
        return appInfoMapper.appInfoList();
    }

}
