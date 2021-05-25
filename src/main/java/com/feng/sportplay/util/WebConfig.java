package com.feng.sportplay.util;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author Feng
 * @date 2021/5/11 21:25
 */
//全局配类——配置跨域请求
@Configuration
public class WebConfig implements WebMvcConfigurer {
    /**
     * 1.访问路径
     * 2.请求来源
     * 3.请求方式
     * 4.允许携带信息
     * 5.最大等待时间
     */
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOrigins("Http://localhost:8080", "null")
                .allowedMethods("GET", "POST", "PUT", "OPTIONS", "DELETE")
                .allowCredentials(true)
                .maxAge(3600);
    }
}
