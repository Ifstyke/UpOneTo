package com.ghw.yygh.msm.utils;

import com.aliyun.teaopenapi.models.Config;

/**
 * @Author ifstyle
 * @Description
 * @Date 2022/5/20 14:48
 * @Version
 */
public class ConfigUtil {

    public static com.aliyun.dysmsapi20170525.Client createClient(String accessKeyId, String accessKeySecret) throws Exception {
        Config config = new Config()
                // 您的AccessKey ID
                .setAccessKeyId(accessKeyId)
                // 您的AccessKey Secret
                .setAccessKeySecret(accessKeySecret);
        // 访问的域名
        config.endpoint = "dysmsapi.aliyuncs.com";
        return new com.aliyun.dysmsapi20170525.Client(config);
    }
}
