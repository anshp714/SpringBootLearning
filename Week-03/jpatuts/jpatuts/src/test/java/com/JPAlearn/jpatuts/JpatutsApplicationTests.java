package com.JPAlearn.jpatuts;

import com.JPAlearn.jpatuts.entities.ProductEntity;
import com.JPAlearn.jpatuts.repositories.ProductRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.util.List;

@SpringBootTest
class JpatutsApplicationTests {

	@Autowired
	ProductRepository productRepository;

	@Test
	void contextLoads() {
	}

//	@Test
//	void testRepository() {
//		ProductEntity productEntity = ProductEntity.builder()
//				.sku("Nestle234")
//				.title("Nestle Chocolate")
//				.price(BigDecimal.valueOf(123.45))
//				.quantity(12)
//				.build();
//
//		ProductEntity savedProductEntity =  productRepository.save(productEntity);
//		System.out.println(savedProductEntity);
//	}

//	@Test
//	void getRepository(){
//
//	}


}
