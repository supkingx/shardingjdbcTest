package demoTest;

import com.supkingx.dao.KingUserMapper;
import com.supkingx.pojo.KingUserPo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigInteger;
import java.util.List;

/**
 * @description:
 * @Author: wangchao
 * @Date: 2021/11/2
 */
@SpringBootTest
public class Demo01 {
    @Autowired
    private KingUserMapper kingUserMapper;
    @Test
    public void test01(){
        List<KingUserPo> kingUserPos = kingUserMapper.queryById(BigInteger.ONE);
        System.out.println("......");
    }
}
