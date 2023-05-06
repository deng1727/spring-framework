package org.springframework;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.service.JobService;

public class Main {
	public static void main(String[] args) {

		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		JobService jobService = (JobService)ac.getBean("jobService");
		System.out.println("jobService : " +  jobService);
		//?????
	}
}