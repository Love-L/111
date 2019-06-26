package com.example.demo;


import com.example.demo.controller.UserController;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * 测试用例
 */
public class UserControllerTest extends SpringBootDemoTests {

    @Autowired
    UserController userController;

    @Test
    public void delete(int id){
        Assert.assertSame(userController.delete(1),"删除成功");
    }

}
