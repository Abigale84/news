package com.lq.index.request;

import javax.validation.constraints.NotNull;

/**
 * @author qliu84
 * @version 1.0
 * @date 2019/7/9 16:49
 */
public class TestRequest {

    @NotNull(message = "name不能为空")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
