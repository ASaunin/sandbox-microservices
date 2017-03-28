package com.asaunin;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class QueueConfiguration {

	static final String DEFAULT_QUEUE = "rabbit.queue";
	static final String DEFAULT_MESSAGE = "Hello, Rabbit!";

	@Bean
	public Queue hello() {
		return new Queue(DEFAULT_QUEUE);
	}

	@Bean
	public Consumer first() {
		return new Consumer("First");
	}

	@Bean
	public Consumer second() {
		return new Consumer("Second");
	}

}
