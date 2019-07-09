package com.lq.user.bean;

import com.lq.common.model.BaseModel;

/**
 * @author qliu84
 * @version 1.0
 * @date 2019/7/9 17:18
 */
public class UserBean extends BaseModel {

    private String mobile;

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
