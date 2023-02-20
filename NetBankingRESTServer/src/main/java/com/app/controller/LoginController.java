package com.app.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.dto.CreateAccountRequest;
import com.app.dto.LoginRequest;
import com.app.service.LoginService;

@RestController
@RequestMapping("/login")
public class LoginController {
	
	@Autowired
	public LoginService service;

	
	@GetMapping
	
	public ResponseEntity<?> login(@RequestBody LoginRequest request) {
		
		return ResponseEntity.status(HttpStatus.CREATED).body(service.createNewAccount(request));
		
	}
	
	
}
