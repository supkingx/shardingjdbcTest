package com.supkingx.dao;


import com.supkingx.pojo.KingUserPo;

import java.math.BigInteger;
import java.util.List;

/**
 * @description:
 * @Author: wangchao
 * @Date: 2021/9/20
 */
public interface KingUserMapper {
    List<KingUserPo> queryById(BigInteger id);
}
