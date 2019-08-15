package com.multi.demo2.comp2;

import com.multi.demo1.comp1.Comp1Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.function.Function;

@RestController
public class Comp2Controller {

    @Resource
    private Comp1Service comp1Service;

    @Resource(name="myFunction")
    private Function<String, String> function;


    @RequestMapping(method = RequestMethod.GET, value = "app/comp2/{salut}/{name}")
    public String getComp2(@PathVariable String salut, @PathVariable String name){
        return comp1Service.getComp1(salut, name);
    }

}
