package com.kshitiz.springbootproject;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@ResponseBody
public class TestCOntroller
{
    @GetMapping
    public List<String> firstHandler()
    {
        return  List.of ("just", "for"," fun",  " ||");
    }

}
