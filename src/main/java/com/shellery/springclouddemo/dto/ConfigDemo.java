package com.shellery.springclouddemo.dto;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

/**
 * Author:   liuss
 * Date:     2019/12/27 20:25
 * Description:
 */
@Configuration
@Data
public class ConfigDemo {

    @Value("${app-name}")
    public String appName;

}
