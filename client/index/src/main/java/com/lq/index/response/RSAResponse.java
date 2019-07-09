package com.lq.index.response;

/**
 * @author qliu84
 * @version 1.0
 * @date 2019/7/9 16:30
 */

import com.lq.common.model.response.BaseResponse;

/**
 * RSA生成的公私钥输出参数
 */
public class RSAResponse extends BaseResponse {

    private String serverPublicKey;
    private String serverPrivateKey;

    public static class Builder {
        private String serverPublicKey;
        private String serverPrivateKey;

        public Builder setServerPublicKey(String serverPublicKey) {
            this.serverPublicKey = serverPublicKey;
            return this;
        }

        public Builder setServerPrivateKey(String serverPrivateKey) {
            this.serverPrivateKey = serverPrivateKey;
            return this;
        }

        public RSAResponse build() {
            return new RSAResponse(this);
        }

    }

    public static Builder options() {
        return new Builder();
    }

    public RSAResponse(Builder builder) {
        this.serverPrivateKey = builder.serverPrivateKey;
        this.serverPublicKey = builder.serverPublicKey;
    }

    public String getServerPrivateKey() {
        return serverPrivateKey;
    }

    public String getServerPublicKey() {
        return serverPublicKey;
    }
}