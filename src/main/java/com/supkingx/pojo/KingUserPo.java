package com.supkingx.pojo;

import lombok.Getter;
import lombok.Setter;

import java.math.BigInteger;
import java.util.Date;

@Getter
@Setter
public class KingUserPo {

 
    private BigInteger id;
    private BigInteger 编号;
    private String username;
    private Date birthday;
    private Byte gender;
    private String address;
 
    private String permission;
}
