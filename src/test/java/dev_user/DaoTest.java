package dev_user;

import com.yqf.dao.DevUserMapper;
import com.yqf.pojo.DevUser;
import com.yqf.utils.MD5Util;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author peak
 * @Version 1.0
 */
public class DaoTest {
    //测试数据能否从数据库中查找数据
    /*@Test
    public void ConnectMysqlTest(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring/spring-dao.xml","spring/spring-service.xml","spring/spring-mvc.xml");
        DevUserMapper devUserMapper = (DevUserMapper) applicationContext.getBean("devUserMapper");
        System.out.println("devUserMapper=" + devUserMapper.getClass());
        DevUser devUser = devUserMapper.getDevUserByName("测试账户001");
        System.out.println(devUser);
    }*/

    @Test
    public void TestMD5(){
        String md5Plus = MD5Util.getMD5Plus("123456");
        System.out.println(md5Plus);
    }
}
