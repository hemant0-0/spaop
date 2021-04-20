package com.spaop.spaop.controller;

import com.spaop.spaop.impl.MyImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @Autowired
    private MyImpl myimpl;

   @GetMapping("/check")
    public String check(){
        return myimpl.getData();
    }
}
