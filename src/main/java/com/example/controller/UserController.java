package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Address;
import com.example.model.Payment;
import com.example.model.PrdCategory;
import com.example.model.PrdSubCategory;
import com.example.model.User;
import com.example.service.AddressService;
import com.example.service.PaymentService;
import com.example.service.PrdCategoryService;
import com.example.service.PrdSubCategoryService;
import com.example.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	private UserService userService;
	@Autowired
	private PrdCategoryService prdCategoryService;
	@Autowired
	private AddressService addressService;
	@Autowired
	private PaymentService paymentService;
	@Autowired
	private PrdSubCategoryService prdSubCategoryService;
	
	
	@PostMapping("/saveUser")
	public User saveUser(@RequestBody User user) {
		User user1=userService.saveUser(user);
		//PrdCategory prdCat=prdCategoryService.savePrdCategory(prdCategory);
		
		List<PrdCategory> categories = user.getPrdcategorylist();
		for (PrdCategory cat : categories) {
		cat.setUserid(user.getId());
		prdCategoryService.savePrdCategory(cat);
		}
		
//		List<PrdSubCategory> subCategories=prdCategory.getPrdsubcategorylist();
//		for(PrdSubCategory subCat:subCategories ) {
//			subCat.setCategoryid(prdCategory.getId());
//			prdSubCategoryService.savePrdSubCategory(subCat);
//		}
		
		
		List<Address> address = user.getAddresslist();
		for (Address add : address) {
		add.setUserid(user.getId());
		addressService.saveAddress(add);
		}
		
		
		List<Payment> pay = user.getPaymentlist();
		for (Payment payments : pay) {
		payments.setUserid(user.getId());
		paymentService.savePayment(payments);
		}
		
		
		return user1;
	}

}
