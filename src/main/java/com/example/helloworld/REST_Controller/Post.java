//  Waheguru Ji!

package com.example.helloworld.REST_Controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Post {
    @PostMapping(value = "/create/order")
    public String createOrder(@RequestParam(value = "id", required = false) Integer orderId) {
        if(orderId == null)    return "To create an order, @param id is required.";
        return "Order with ID: " + orderId + " created successfully!";
    }
}
