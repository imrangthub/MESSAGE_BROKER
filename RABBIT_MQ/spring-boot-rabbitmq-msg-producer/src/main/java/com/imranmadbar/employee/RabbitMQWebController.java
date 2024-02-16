package com.imranmadbar.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/rabbitmq")
public class RabbitMQWebController {

	@Autowired
	private RabbitMQSender rabbitMQSender;

	@GetMapping(value = "/sent-emp")
	public String producer(@RequestParam("empName") String empName, @RequestParam("empId") String empId) {

		Employee emp = new Employee();

		emp.setEmpId(empId);
		emp.setEmpName(empName);

		rabbitMQSender.send(emp);
		return "Message sent to the RabbitMQ  Successfully";
	}
	 
	
	

}
