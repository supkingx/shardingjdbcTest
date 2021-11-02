package com.supkingx.dao;


import com.supkingx.pojo.SmilerUserPo;

import java.math.BigInteger;
import java.util.List;

/**
 * @description:
 * @Author: wangchao
 * @Date: 2021/9/20
 */
public interface SmilerUserMapper {
    List<SmilerUserPo> queryById(BigInteger id);

    void insertUser(List<SmilerUserPo> smilerUserPoList);

    List<SmilerUserPo> queryPermissionById(BigInteger id);
}
