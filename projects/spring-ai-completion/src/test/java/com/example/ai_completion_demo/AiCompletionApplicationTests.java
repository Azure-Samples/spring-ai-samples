package com.example.ai_completion_demo;

import org.junit.jupiter.api.Test;
import org.springframework.ai.chat.client.ChatClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class AiCompletionApplicationTests {

	@Autowired
	private ChatClient.Builder builder;

	@Test
	void completionTest() {

		ChatClient chatClient = null;
		String question = "When was Microsoft founded?";
		String answer = null;
		String realAnswer = "1975";

		chatClient = builder.build();

		assertTrue(chatClient != null);

		answer = chatClient
				.prompt()
				.user(question)
				.call()
				.content();

		assertTrue(answer.contains(realAnswer));

	}

}
