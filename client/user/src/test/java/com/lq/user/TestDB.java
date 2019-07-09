package com.lq.user;

import com.lq.user.UserApplication;
import com.lq.user.request.LoginRequest;
import com.lq.user.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

//@RunWith(SpringJUnit4ClassRunner.class)
//@SpringBootTest(classes = UserApplication.class)
public class TestDB {

    @Autowired
    private UserService userService;

    @Test
    public void test(){
        try {
            LoginRequest request = new LoginRequest();
            request.setMobile("13800138000");
            request.setPassword("1");
            System.out.println(userService.login(request));
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
