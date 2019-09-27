//  Waheguru Ji!

package com.example.helloworld.REST_Controller;

import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Put {
    @PutMapping(value = "/update/order")
    public String updateOrder(@RequestParam("id") Integer orderId, @RequestParam("name") String name) {
        return "The item name is updated to " + name + " for the order with ID: " + orderId;
    }
}
