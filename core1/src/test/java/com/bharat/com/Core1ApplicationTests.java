package com.bharat.com;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.bharat.com.services.PaymentService;
import static org.junit.Assert.*;

@SpringBootTest
class Core1ApplicationTests {
	@Autowired
	PaymentService service;

	@Test
	void testDependencyInjection() {
		assertNotNull(service);
	}

}
