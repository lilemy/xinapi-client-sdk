package com.plum.xinapiclientsdk;

import com.plum.xinapiclientsdk.client.XinApiClient;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Data
@Configuration
@ComponentScan
@ConfigurationProperties("xin.client")
public class XinApiClientConfig {

    private String accessKey;

    private String secretKey;

    @Bean
    public XinApiClient xinApiClient() {
        return new XinApiClient(accessKey, secretKey);
    }
}
