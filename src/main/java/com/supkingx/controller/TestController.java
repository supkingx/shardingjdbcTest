package com.supkingx.controller;

import com.supkingx.dao.KingUserMapper;
import com.supkingx.pojo.KingUserPo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigInteger;
import java.util.List;

/**
 * @description:
 * @Author: wangchao
 * @Date: 2021/11/1
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    private KingUserMapper userMapper;

    @GetMapping("/queryById")
    public void queryById(){
        List<KingUserPo> kingUserPos = userMapper.queryById(BigInteger.ONE);
        System.out.println("......");
    }
}