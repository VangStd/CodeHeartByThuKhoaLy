/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dien.TestCrush.controller;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author kyqua
 */
@Controller
public class HomeController {

    @GetMapping("/home")
    public String home(HttpServletRequest request, Model model) {
        if (request.getParameter("name") != null) {
            model.addAttribute("name", request.getParameter("name"));
        }
        return "main";
    }

    @GetMapping("/test")
    public String test() {
        return "test";
    }
}
