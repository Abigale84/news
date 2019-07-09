package com.lq.common.controller;

import org.springframework.util.Assert;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;

import java.util.List;

/**
 * @author qliu84
 * @version 1.0
 * @date 2019/7/9 16:44
 */
public class BaseController {

    /**
     * 接口输入参数合法性校验
     *
     * @param result
     */
    protected void validate(BindingResult result) {
        if (result.hasFieldErrors()) {
            List<FieldError> errorList = result.getFieldErrors();
            errorList.stream().forEach(item -> Assert.isTrue(false, item.getDefaultMessage()));
        }
    }
}
