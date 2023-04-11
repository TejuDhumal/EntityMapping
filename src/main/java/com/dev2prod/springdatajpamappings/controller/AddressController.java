package com.dev2prod.springdatajpamappings.controller;

import com.dev2prod.springdatajpamappings.entity.Address;
import com.dev2prod.springdatajpamappings.repository.AddressRepository;
import com.dev2prod.springdatajpamappings.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AddressController {

    @Autowired
    private AddressService addressService;

    @GetMapping("/getAddress")
    public List<Address> getAddress(){
        return addressService.findAllAddress();
    }
}
