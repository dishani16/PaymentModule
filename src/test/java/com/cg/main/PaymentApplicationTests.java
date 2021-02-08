package com.cg.main;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.cg.main.controller.MyController;

@ExtendWith(SpringExtension.class)
@SpringBootTest
class PaymentModuleApplicationTests {
	@Autowired
	private MyController controller;
		@Test
		void contextLoads() {
			boolean result=true;
			if(controller.equals(null)) {
			result =false;
			}
			assertTrue(result);
		}
}
