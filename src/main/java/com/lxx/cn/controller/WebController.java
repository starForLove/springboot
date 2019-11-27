package com.lxx.cn.controller;

import com.lxx.cn.didispace.blog.service.BlogProperties;
import com.lxx.cn.exception.MyException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author keyLiu
 * @ClassName WebController
 * @Description TODO
 * @date 2019/11/27 15:34
 * @Version V1.0
 **/
@RestController
public class WebController {
    @Autowired
    BlogProperties blogProperties;
    @RequestMapping("/hello")
    public String test(){
        blogProperties.getName();
        blogProperties.getDesc();
        System.out.println(blogProperties.getName());
        System.out.println(blogProperties.getTest1());
        return "success";
    }
    @RequestMapping("/")
    public String index(ModelMap map) {
        map.addAttribute("host", "http://blog.didispace.com");
        return "index";
    }
    @RequestMapping("/json")
    public String json() throws MyException {
        throw new MyException("发生错误2");
    }
    @RequestMapping("/hello2")
    public String hello() throws Exception {
        throw new Exception("发生错误");
    }





}
