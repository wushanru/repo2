package com.zfsoft.com.zfsoft.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MySpringBootQuick {

    @RequestMapping("/quick")
    @ResponseBody
    public String quick() {
        return "wHello667000kkkmmmm World";
    }
}
