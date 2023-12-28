package com.github.action;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class GitHubActionApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	void isTrue() {
		Assertions.assertTrue(true);
	}

	@Test
	void isFalse(){
		Assertions.assertFalse(true);
	}

}
