package com.lq.index.service;

import com.lq.common.result.SingleResult;
import com.lq.index.request.KeyRequest;
import com.lq.index.response.KeyResponse;
import com.lq.index.response.RSAResponse;
import org.springframework.stereotype.Service;

/**
 * @author qliu84
 * @version 1.0
 * @date 2019/7/9 16:28
 */
@Service
public interface EncryptOpenService {

    /**
     * 生成RSA公私钥
     * @return
     */
    SingleResult<RSAResponse> getRSA();    /**
     * 获得加解密用的密钥
     * @param request
     * @return
     */
    SingleResult<KeyResponse> getKey(KeyRequest request) throws Exception;
}