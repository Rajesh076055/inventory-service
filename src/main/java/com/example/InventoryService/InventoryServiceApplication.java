package com.example.InventoryService;

import com.example.InventoryService.Model.Inventory;
import com.example.InventoryService.Repository.InventoryRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class InventoryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(InventoryServiceApplication.class, args);
	}

	@Bean
	public CommandLineRunner loadData(InventoryRepository inventoryRepository) {
		return args -> {
			Inventory inventory = new Inventory();
			inventory.setSkuCode("iPhone 12");
			inventory.setQuantity(12);

			Inventory inventory1 = new Inventory();
			inventory1.setSkuCode("iPhone 13");
			inventory1.setQuantity(13);

			inventoryRepository.save(inventory);
			inventoryRepository.save(inventory1);
		};
	}
}
