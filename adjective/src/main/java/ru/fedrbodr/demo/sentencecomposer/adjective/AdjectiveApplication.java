package ru.fedrbodr.demo.sentencecomposer.adjective;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class AdjectiveApplication {

	public static void main(String[] args) {
		SpringApplication.run(AdjectiveApplication.class, args);
	}
}
