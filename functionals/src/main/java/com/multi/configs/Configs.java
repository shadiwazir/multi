package com.multi.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

@Configuration
public class Configs {

    @Bean(name="myFunction")
    public Function<String, String> function(){
        return input->input;
    }

    @Bean("supplier")
    public Supplier<String> supplier(){
        return ()->"Hello";
    }

    @Bean("consumer")
    public Consumer<String> consumer(){
        return input->{
            System.out.println(input);
        };
    }

}
