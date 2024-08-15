package com.example.ai_completion_demo;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class AiCompletionApplication implements CommandLineRunner
{
    private final ChatClient chatClient;

    public AiCompletionApplication(ChatClient.Builder builder) {
        this.chatClient = builder.build();
    }

    public static void main(String[] args) {
        SpringApplication.run(AiCompletionApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        String question = "When was Microsoft founded?";
        String answer = null;

        System.out.println(String.format("\r\nThe Question: %s \r\n \r\n", question));

        System.out.println(String.format("Sending completion prompt to AI service. Wait for it..........\r\n"));

        answer = this.chatClient
                .prompt()
                .user(question)
                .call()
                .content();

        System.out.println(String.format("\r\nThe Answer: %s \r\n", answer));

    }

}