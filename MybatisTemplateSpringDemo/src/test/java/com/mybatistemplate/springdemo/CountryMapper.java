package com.mybatistemplate.springdemo;

import com.mybatistemplate.base.BaseDao;

import java.util.List;
import java.util.Map;

/**
 * Created by leicheng on 2016/7/12.
 */
public interface CountryMapper extends BaseDao<Country,Integer> {
    public List<Country> testSelect(Map<String, Object> map);
}
