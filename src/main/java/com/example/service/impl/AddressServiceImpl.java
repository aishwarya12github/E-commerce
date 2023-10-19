package com.example.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.Address;
import com.example.repository.AddressRepository;
import com.example.service.AddressService;

@Service
public class AddressServiceImpl implements AddressService {

	@Autowired
	private AddressRepository addressRepository;
	
	@Override
	public Address saveAddress(Address address) {
		Address address1=addressRepository.save(address);
		return address1;
	}

}
