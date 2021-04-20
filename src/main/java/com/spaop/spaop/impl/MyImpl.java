package com.spaop.spaop.impl;

import com.spaop.spaop.repository.MyInterface;
import org.springframework.stereotype.Component;

@Component
public class MyImpl implements MyInterface {
    @Override
    public String getData() {
        return "hello Spring AOP";
    }
}
