package com.lq.user.controller;

import com.lq.common.controller.BaseController;
import com.lq.common.result.SingleResult;
import com.lq.user.request.LoginRequest;
import com.lq.user.response.TokenResponse;
import com.lq.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * @author qliu84
 * @version 1.0
 * @date 2019/7/9 17:24
 */
@RequestMapping("user")
@RestController
public class UserController extends BaseController {

    @Autowired
    private UserService userService;

    @RequestMapping("login")
    public SingleResult<TokenResponse> login(@Valid @RequestBody LoginRequest request, BindingResult result){
        //必须要调用validate方法才能实现输入参数的合法性校验
        validate(result);
        return userService.login(request);
    }
}