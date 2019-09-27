//  Waheguru Ji!

package com.example.helloworld.REST_Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.Null;

@RestController
public class Get {
    @GetMapping(path = "/")
    public String home() {
        return "Welcome to the home page.";
    }

    @GetMapping(path = "/{name}")
    public String greetings(@PathVariable("name") String name) {
        return "Welcome to your customised page, " + name + "!";
    }

    @GetMapping(path = "/{name}/orders")
    public String viewOrders(@PathVariable String name) {
        return "View all the orders for " + name + ".";
    }

    @GetMapping(path = "/{name}/order")
    public String orderDetails(@PathVariable("name") String name, @RequestParam(value = "id", required = false) Integer orderID) {
        if(orderID == null)     return "Place an order, " + name;
        return "Details for " + name + "'s order with ID: " + orderID;
    }
}
