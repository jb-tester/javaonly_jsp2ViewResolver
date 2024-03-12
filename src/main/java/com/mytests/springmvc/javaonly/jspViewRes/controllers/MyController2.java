package com.mytests.springmvc.javaonly.jspViewRes.controllers;

import com.mytests.springmvc.javaonly.jspViewRes.data.Tester;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * *******************************
 * Created by Irina.Petrovskaya on 2/6/2016.
 * Project: javaonly_jsp2ViewResolver
 * *******************************
 */

@Controller
public class MyController2 {

    private static List<Tester> currentTesters = new ArrayList<Tester>();


    static {
        currentTesters.add(new Tester("Irina", "Petrovskaya"));
        currentTesters.add(new Tester("Alexander", "Chernikov"));
        currentTesters.add(new Tester("Vika", "Dumova"));
        currentTesters.add(new Tester("Daria", "Isachenkova"));
        currentTesters.add(new Tester("Nikolay", "Sandalov"));
        currentTesters.add(new Tester("Maria", "Vdovina"));
        currentTesters.add(new Tester("Maria", "Timofeeva"));
    }
    @RequestMapping("/")
    public String defaultPath(Model model){

        model.addAttribute("currentGroup",currentTesters);
        model.addAttribute("amount",currentTesters.size());
        boolean size_condition = currentTesters.size() < 10;
        return size_condition ? "home" : "ithappens";

    }

    @RequestMapping("/tester/{1}")
    public String tester(ModelMap model, @PathVariable("1") int id) {
        boolean conditionOk = currentTesters.size()>= (id+1);
        if (conditionOk) {


        model.addAttribute("tester_attr1", "the found tester:");
        Tester foundTester = currentTesters.get(id);
        model.addAttribute("tester",foundTester.getFirstname()+" "+foundTester.getLastname());
        }

        return conditionOk ? "tester" : "ithappens";
    }
  
}
