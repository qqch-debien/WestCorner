package com.example.westcornerback;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.example.westcornerback.repository.OrderRepository;
import com.example.westcornerback.model.Order;

@SpringBootApplication
@EnableMongoRepositories
public class WestCornerBackApplication implements CommandLineRunner {

	@Autowired
	OrderRepository orderRepository;

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Order cration");
		createOrder();
		
	}

	
	public void createOrder() {
	}

	public static void main(String[] args) {
		SpringApplication.run(WestCornerBackApplication.class, args);
	}

}
