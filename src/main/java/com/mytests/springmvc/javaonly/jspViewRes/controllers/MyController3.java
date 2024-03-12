package com.mytests.springmvc.javaonly.jspViewRes.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * *******************************
 * Created by Irina.Petrovskaya on 6/7/2018.
 * Project: javaonly_jsp2ViewResolver
 * *******************************
 */
@Controller
public class MyController3 {
   // this is temp controller just for tests
    public static final String TEST_3 = "/test3";

    @RequestMapping(TEST_3+ "/{1 2}")
    public String test3(ModelMap model, @PathVariable("1 2") String parameter) {
        return "test3";
    }
}
