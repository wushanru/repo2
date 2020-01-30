package com.zfsoft.com.zfsoft.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ConfigurationProperties(prefix = "person")
public class MySpringBootQuick3 {


    private String name;
    private String addr;

    @RequestMapping("/quick3")
    @ResponseBody
    public String quick3() {
        return "name的值为：" + name + "person的addr值为：" + addr;

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }
}
