package com.multi.configs;

import org.springframework.stereotype.Component;

import java.util.function.Function;
@Component("HiFunctional")
public class HiFunctional implements Function<String, String> {

    @Override
    public String apply(String s) {
        return "Hi There: " + s;
    }

}
