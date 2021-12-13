package com.imranmadbar.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.imranmadbar.config.EmployeeRegistrationSource;

@RestController
@EnableBinding(EmployeeRegistrationSource.class)
@RequestMapping(value = "/rabbitmq/")
public class EmployeeRegistrationController {

	@Autowired
	EmployeeRegistrationSource employeeRegistrationSource;

	@GetMapping(value = "/producer")
	public String producer(@RequestParam("empName") String empName, @RequestParam("empId") String empId) {
		Employee emp = new Employee();
		emp.setEmpID(empId);
		emp.setEmpName(empName);

		employeeRegistrationSource.employeeRegistration().send(MessageBuilder.withPayload(emp).build());
		System.out.println(emp.toString());
		return "Employee Registered";
	}

}