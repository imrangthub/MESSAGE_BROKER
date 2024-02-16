package com.imranmadbar;

import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class SimpleService {

	@RabbitListener(queues = {"imm-app-que1"})
	public void consumeJsonMessage(Message message) {

		 
		 System.out.println("RabbitMQListnerConsumeMSG - " + new String(message.getBody()));		
		 
		 saveToDB();

	}

	public void saveToDB() {

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		}

		System.out.println("Data save to DB");
	}

}