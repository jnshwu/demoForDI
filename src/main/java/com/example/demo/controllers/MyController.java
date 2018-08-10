package com.example.demo.controllers;

import org.springframework.stereotype.Controller;

/**
 * Created by jinshiwu on 8/10/18.
 */
@Controller
public class MyController {
    public String Hello() {
        System.out.println("say hello");
        return "foo";
    }
}
