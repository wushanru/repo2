package com.zfsoft.com.zfsoft.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MySpringBootQuick2 {

    @Value("${name}")
    private String name;

    @Value("${person.addr}")
    private String addr;

    @RequestMapping("/quick2")
    @ResponseBody
    public String quick2() {
        return "name的值为：" + name + "person的addr值为：" + addr;

    }
}
