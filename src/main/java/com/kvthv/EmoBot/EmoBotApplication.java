package com.kvthv.EmoBot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class EmoBotApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmoBotApplication.class, args);
		/*
		//read spring config file
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("applicationContext.xml");

		//create EmoBot
		Bot emoBot = context.getBean("emoBot", EmoBot.class);
		System.out.println(emoBot.getResponse());

		 */


	}

}
