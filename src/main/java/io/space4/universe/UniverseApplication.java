package io.space4.universe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class UniverseApplication {

	public static void main(String[] args) {
		SpringApplication.run(UniverseApplication.class, args);
	}

}
