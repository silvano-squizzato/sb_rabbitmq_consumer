package demo.rabbitmq.service;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import demo.rabbitmq.model.Employee;

@Component
public class RabbitMQConsumer {

    @RabbitListener(queues = "${demo.rabbitmq.queue}")
	public void receiveMessage(Employee employee) {

    	System.out.println("Received message from RabbitMQ: " + employee);
	}
}