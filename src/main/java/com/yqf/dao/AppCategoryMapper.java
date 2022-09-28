package com.yqf.dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author peak
 * @Version 1.0
 */
@Mapper
@Repository
public interface AppCategoryMapper {
    //一级分类
    List<AppCategoryMapper> categoryLevel1List();
    //二级分类
    List<AppCategoryMapper> categoryLevel2List();
    //三级分类
    List<AppCategoryMapper> categoryLevel3List();
}
