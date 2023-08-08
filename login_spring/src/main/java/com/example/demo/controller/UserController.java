package com.example.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.*;
import com.example.demo.service.UserService;

import lombok.AllArgsConstructor;

@CrossOrigin(origins="*")
@RestController
@RequestMapping("users")
@AllArgsConstructor
public class UserController {
	
	private final UserService userService;
	
	@GetMapping("/{id}")
	public ApiResponse<User> getUserById(@PathVariable int id){
		User user=userService.findByUserId(id);
		if(user!=null) {
			
			return new ApiResponse<>(HttpStatus.OK.value(),"User fetched successfully",userService.findByUserId(id));
		}
		else {
			return new ApiResponse<>(HttpStatus.NOT_FOUND.value(),"User not found ",null);
		}
		
	}
	
	@GetMapping("/find/{userName}")
	public ApiResponse<User> getUserByName(@PathVariable String userName){
		User user=userService.findByUserName(userName);
		if(user!=null) {
			
			return new ApiResponse<>(HttpStatus.OK.value(),"User fetched successfully: ",userService.findByUserName(userName));
		}
		else {
			return new ApiResponse<>(HttpStatus.NOT_FOUND.value(),"User not found ",null);
		}
	}
	
	@RequestMapping("/agreement")
	public ApiResponse<AuthToken> agreementCheck(@RequestBody LoginUser loginUser){
		
		User user=userService.findByUserName(loginUser.getUserName());
		boolean agree=user.isEulAgreement();
		int employeeId=user.getEmployeeId();
		if(agree) {
			return new ApiResponse<>(200,"Agreed",employeeId);
		}
		else {
			return new ApiResponse<>(201,"Disagreed",employeeId);
		}
		
	}
	
	
	

}
