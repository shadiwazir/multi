package com.multi.demo1.comp1;


        import org.springframework.stereotype.Service;

@Service("Comp1Service")
public class Comp1Service {
    public String getComp1(String salut, String name){
        return new Comp1(salut, name).toString();
    }
}
