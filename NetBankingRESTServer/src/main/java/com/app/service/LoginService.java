package com.app.service;

import javax.validation.Valid;

import com.app.dto.CreateAccountRequest;

public interface LoginService {

	Object createNewAccount(@Valid CreateAccountRequest request);

}
