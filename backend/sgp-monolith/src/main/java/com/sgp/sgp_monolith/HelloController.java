package com.sgp.sgp_monolith;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * A simple controller to check if the application is running.
 */
@RestController // 告诉Spring，这是一个接收Web请求的控制器
public class HelloController {

    @GetMapping("/hello") // 映射HTTP GET请求到/hello路径
    public String sayHello() {
        // 当接收到请求时，返回这个字符串
        return "Welcome to Smart Growth Platform! The fire is lit.";
    }
}
