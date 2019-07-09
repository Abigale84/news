package com.lq.user.service;

import com.lq.common.result.Code;
import com.lq.common.result.SingleResult;
import com.lq.common.service.BaseService;
import com.lq.user.bean.UserBean;
import com.lq.user.mapper.UserMapper;
import com.lq.user.request.LoginRequest;
import com.lq.user.response.TokenResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author qliu84
 * @version 1.0
 * @date 2019/7/9 17:22
 */
@Transactional(rollbackFor = Exception.class)
@Service
public class UserService extends BaseService {

    @Autowired
    private UserMapper userMapper;

    public SingleResult<TokenResponse> login(LoginRequest request) {
        List<UserBean> userList = userMapper.selectUser(request.getMobile(), request.getPassword());
        if (null != userList && userList.size() > 0) {
            String token = getToken(request.getMobile(), request.getPassword());
            TokenResponse response = new TokenResponse();
            response.setToken(token);
            return SingleResult.buildSuccess(response);
        } else {
            return SingleResult.buildFailure(Code.ERROR, "手机号或密码输入不正确！");
        }
    }
}
