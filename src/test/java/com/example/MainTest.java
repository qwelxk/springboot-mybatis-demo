package com.example;

import com.example.dao.UserInfoMapper;
import com.example.pojo.UserInfo;
import com.example.springbootmybatisdemo.SpringbootMybatisDemoApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * FileName :
 *
 * @author : LiXiaoKang
 * @date : 2019/12/20 11:41
 * Description :
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringbootMybatisDemoApplication.class)
@EnableAutoConfiguration
public class MainTest {
    @Autowired
    private UserInfoMapper userInfoMapper;
    private Logger logger = LoggerFactory.getLogger(this.getClass());
    @Test
    public void test1() throws Exception {
        logger.info("——————————————————————————————日志测试——————————————————————————————");
        System.out.println(userInfoMapper.findAllUser());
    }

    @Test
    public void test2() throws Exception {
        UserInfo userInfo = new UserInfo();
        logger.info("——————————————————————————————日志测试——————————————————————————————");
        userInfo.setUserid(3);
        System.out.println(userInfoMapper.testSelect(userInfo));
    }
}
