package com.donann;

import org.springframework.scheduling.annotation.Scheduled;

public class Job {
	@Scheduled(cron="0/10 * * * * ?") //标记了这个注解的方法，就会自动被根据指定的cron表达式来调度。
	public void execute() {
		//方法里面就是将来这个任务执行时要干的事情。
	    System.out.println("donnnn");
				
	}
}
