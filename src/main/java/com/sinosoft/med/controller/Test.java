package com.sinosoft.med.controller;

import com.sinosoft.med.service.TestConnectOracleService;
import com.sinosoft.med.service.impl.TestConnectOracleImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;

@Controller
public class Test {

    @Resource
    private TestConnectOracleService service;

    @RequestMapping("/test3")
    @ResponseBody
    public int getNum(){
        return service.querySth();
    }


    @RequestMapping("/test")
    public String  goToTest(){

        return "test";
    }

    @RequestMapping("/test2")
    public String  goToTest2(){

        return "test2.html";
    }

}
