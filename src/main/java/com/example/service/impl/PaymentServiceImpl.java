package com.example.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.Payment;
import com.example.repository.PaymentRepository;
import com.example.service.PaymentService;

@Service
public class PaymentServiceImpl implements PaymentService {

	@Autowired
	private PaymentRepository paymentRepository;
	
	@Override
	public Payment savePayment(Payment payment) {
		Payment payment1=paymentRepository.save(payment);
		return payment1;
	}

}
