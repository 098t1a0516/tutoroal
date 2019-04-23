package com.tecnotree.spring.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tecnotree.spring.app.entity.NGBInvoiceFeed;
import com.tecnotree.spring.app.service.NGBInvoiceFeedService;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    NGBInvoiceFeedService NGBInvoiceFeedService;

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public List<NGBInvoiceFeed> getAllUsers() {
        return this.NGBInvoiceFeedService.getAllNGBInvoiceFeeds();
    }


    @RequestMapping(value = "/adduser", method = RequestMethod.POST,
            consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public NGBInvoiceFeed addUser(@RequestBody NGBInvoiceFeed user) {
        return this.NGBInvoiceFeedService.addUser(user);
    }
}
