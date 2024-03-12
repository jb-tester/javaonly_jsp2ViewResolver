package com.mytests.springmvc.javaonly.jspViewRes.controllers;

import com.mytests.springmvc.javaonly.jspViewRes.data.Tester;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;

/**
 * *******************************
 * Created by Irina.Petrovskaya on 2/5/2016.
 * Project: havaonly_XMLViewResolvers
 * *******************************
 */
@Controller
public class MyController1 {
    /**
     * Static list of users to simulate Database
     */
    private static List<Tester> testerList = new ArrayList<Tester>();


    static {
        testerList.add(new Tester("Irina", "Petrovskaya"));
        testerList.add(new Tester("Alexander", "Chernikov"));
        testerList.add(new Tester("Vika", "Dumova"));
        testerList.add(new Tester("Daria", "Isachenkova"));
        testerList.add(new Tester("Nikolay", "Sandalov"));
        testerList.add(new Tester("Maria", "Vdovina"));
        testerList.add(new Tester("Maria", "Timofeeva"));
    }

    /**
     * Saves the static list of users in model and renders it
     * via freemarker template.
     *
     * @param model
     * @return The index view (FTL)
     */
    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String index(@ModelAttribute("model") ModelMap model) {

        model.addAttribute("testerList", testerList);
        model.addAttribute("groupSize",testerList.size());
        return "index";
    }

    /**
     * Add a new tester into static tester lists and display the
     * same into FTL via redirect
     *
     * @param tester
     * @return Redirect to /index page to display tester list
     */
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String add(@ModelAttribute("tester") Tester tester) {
        boolean invalidData = false;

        if (null != tester && null != tester.getFirstname()
                && null != tester.getLastname() && !tester.getFirstname().isEmpty()
                && !tester.getLastname().isEmpty()) {

            synchronized (testerList) {
                testerList.add(tester);
            }

        } else {
          invalidData = true;
        }
        return (invalidData ||(testerList.size()>10)) ? "ithappens" : "redirect:/index.html";

    }
}
