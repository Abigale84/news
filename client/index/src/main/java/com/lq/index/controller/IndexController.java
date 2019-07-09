package com.lq.index.controller;

import com.lq.common.controller.BaseController;
import com.lq.common.result.SingleResult;
import com.lq.index.request.TestRequest;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

/**
 * @author qliu84
 * @version 1.0
 * @date 2019/7/9 16:47
 */
public class IndexController extends BaseController {

    @RequestMapping(value = "/hello", method = RequestMethod.POST)
    public SingleResult<String> hello(@Valid @RequestBody TestRequest request, BindingResult result) {
        validate(result);
        return null;
    }
}

