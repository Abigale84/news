package com.lq.common.service;

import com.lq.common.encryption.Algorithm;
import com.lq.common.encryption.MessageDigestUtils;

/**
 * @author qliu84
 * @version 1.0
 * @date 2019/7/9 17:12
 */
public class BaseService {

    /**
     * 密码加密算法
     * @param password
     * @return
     */
    protected String encryptPassword(String password){
        return MessageDigestUtils.encrypt(password, Algorithm.SHA1);
    }

    /**
     * 生成API鉴权的Token
     * @param mobile
     * @param password
     * @return
     */
    protected String getToken(String mobile,String password){
        return MessageDigestUtils.encrypt(mobile+password, Algorithm.SHA1);
    }

}
