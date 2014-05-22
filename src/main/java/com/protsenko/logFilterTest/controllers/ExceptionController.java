package com.protsenko.logFilterTest.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ExceptionController {

    @RequestMapping("/exception")
    public String exception() {
        throw new RuntimeException("This is a filtered runtime exception");
    } 
}
