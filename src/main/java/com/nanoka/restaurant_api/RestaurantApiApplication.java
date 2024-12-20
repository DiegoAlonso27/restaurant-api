package com.nanoka.restaurant_api;

import com.nanoka.restaurant_api.user.domain.model.DocumentTypeEnum;
import com.nanoka.restaurant_api.user.domain.model.RoleEnum;
import com.nanoka.restaurant_api.user.infrastructure.adapters.output.persistence.entity.UserEntity;
import com.nanoka.restaurant_api.user.infrastructure.adapters.output.persistence.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

@SpringBootApplication
public class RestaurantApiApplication {

    private static final Logger logger = LoggerFactory.getLogger(RestaurantApiApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(RestaurantApiApplication.class, args);
        logger.info("Aplicación iniciada correctamente");
	}


//	@Bean
//	CommandLineRunner init(UserRepository userRepository) {
//		return args -> {
//
//			UserEntity userCarlos = UserEntity.builder()
//					.username("carlos")
//					.password(new BCryptPasswordEncoder().encode("1234"))
//					.name("Carlos Escate")
//					.documentType(DocumentTypeEnum.DNI)
//					.documentNumber("70821326")
//					.phone("941678196")
//					.isEnabled(true)
//					.role(RoleEnum.ADMIN)
//					.email("stornblood6969@gmail.com")
//					.build();
//
//			UserEntity userDaniel = UserEntity.builder()
//					.username("daniel")
//					.password(new BCryptPasswordEncoder().encode("5678"))
//					.name("Daniel Herrera")
//					.documentType(DocumentTypeEnum.DNI)
//					.documentNumber("72461467")
//					.phone("926852390")
//					.isEnabled(true)
//					.role(RoleEnum.WAITER)
//					.email("waiter@elchaufero.com")
//					.build();
//
//			UserEntity userRodrigo = UserEntity.builder()
//					.username("rodrigo")
//					.password(new BCryptPasswordEncoder().encode("9012"))
//					.name("Rodrigo Mendoza")
//					.documentType(DocumentTypeEnum.DNI)
//					.documentNumber("70821335")
//					.phone("981683417")
//					.isEnabled(true)
//					.role(RoleEnum.STOREKEEPER)
//					.email("storekeeper@elchaufero.com")
//					.build();
//
//			UserEntity userStorekeeper = UserEntity.builder()
//					.username("storekeeper")
//					.password(new BCryptPasswordEncoder().encode("9012"))
//					.name("Almacenero")
//					.documentType(DocumentTypeEnum.DNI)
//					.documentNumber("70821336")
//					.phone("981683418")
//					.isEnabled(true)
//					.role(RoleEnum.CASHIER)
//					.email("cashier@elchaufero.com")
//					.build();
//
//			userRepository.saveAll(List.of(userCarlos, userDaniel, userRodrigo,userStorekeeper));
//		};
//	}
}
