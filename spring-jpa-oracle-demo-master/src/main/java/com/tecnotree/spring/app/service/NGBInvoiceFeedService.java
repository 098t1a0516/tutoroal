package com.tecnotree.spring.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tecnotree.spring.app.dao.NGBInvoiceFeedRepository;
import com.tecnotree.spring.app.entity.NGBInvoiceFeed;

@Service
public class NGBInvoiceFeedService {
	
    @Autowired
    NGBInvoiceFeedRepository NGBInvoiceFeedRepository;

    public List<NGBInvoiceFeed> getAllNGBInvoiceFeeds() {
        return this.NGBInvoiceFeedRepository.findAll();
    }

    public NGBInvoiceFeed addUser(NGBInvoiceFeed user) {
        return this.NGBInvoiceFeedRepository.save(user);
    }

}
