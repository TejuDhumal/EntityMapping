package com.dev2prod.springdatajpamappings.service;

import com.dev2prod.springdatajpamappings.entity.Address;
import com.dev2prod.springdatajpamappings.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressService {
    @Autowired
    private AddressRepository addRepository;


    public List<Address> findAllAddress() {
        return addRepository.findAll();
    }
}
