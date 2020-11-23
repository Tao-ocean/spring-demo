package cn.ght.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.Map;

/**
 * @Author ght
 * @Date 2020/11/23 23:20
 */
@RestController
@RequestMapping("/test/")
public class TestController {


    @RequestMapping("normal")
    public Map<String,Object> testNormal(){
        return Collections.singletonMap("msg","success");
    }
}
