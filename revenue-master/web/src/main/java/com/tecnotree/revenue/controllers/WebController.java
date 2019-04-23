package com.tecnotree.revenue.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tecnotree.revenue.service.BankService;
import com.tecnotree.revenue.service.exception.EntityNotFoundException;

@RestController
@RequestMapping("/api/v1")
public class WebController {
    
    @Autowired
    private BankService bankService;
    
    @GetMapping("/bank/{pageNo}/{perPage}")
    public ResponseEntity<Object> getBanks(@PathVariable int pageNo, @PathVariable int perPage) throws EntityNotFoundException {
		return ResponseEntity.ok().body(bankService.getBanks(pageNo, perPage));
    }
   /* @GetMapping("/bank/{code}")
    public ResponseEntity<Object> getUserByCode(@PathVariable String code) throws EntityNotFoundException {
		return ResponseEntity.ok().body(bankService.getUserByCode(code));
    }*/
}