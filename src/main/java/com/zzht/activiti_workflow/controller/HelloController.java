package com.zzht.activiti_workflow.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description:
 * Date: 2022-03-18-23:17
 *
 * @Author haq
 */
@RestController
public class HelloController {

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String sayHello(){
        return "Hello，world";
    }
}
