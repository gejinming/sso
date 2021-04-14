package com.aaa.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description：
 * @Author：GJM
 * @Date：2021/4/14 4:06 下午
 */
@RestController
@RequestMapping("/test")
public class TestController {
    @RequestMapping("/add")
    public String add(){
        return "这是添加接口";
    }
}
