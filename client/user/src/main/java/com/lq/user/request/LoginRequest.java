package com.lq.user.request;

import org.hibernate.validator.constraints.NotEmpty;

/**
 * @author qliu84
 * @version 1.0
 * @date 2019/7/9 17:19
 */
public class LoginRequest {

    @NotEmpty
    private String mobile;

    @NotEmpty
    private String password;

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}