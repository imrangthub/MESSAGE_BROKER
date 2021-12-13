package com.imranmadbar.config;


import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

public interface EmployeeRegistrationSource {

	@Output("empRegChannel")
	MessageChannel employeeRegistration();

}