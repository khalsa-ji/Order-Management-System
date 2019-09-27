//  Waheguru Ji!

 package com.example.helloworld.REST_Controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Delete {
    @DeleteMapping(value = "/{name}")
    public String deleteAccount(@PathVariable("name") String name) {
        return name + " your account deleted successfully!";
    }
}
