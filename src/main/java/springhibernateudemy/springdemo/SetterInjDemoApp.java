package springhibernateudemy.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterInjDemoApp {

	public static void main(String[] args) {
	//load the spring configuration file
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// retrieve bean from spring container
		Coach theCoach = context.getBean("myCriketCoach", Coach.class);
		
		// call methods on the bean
		
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
	  
		// calling properties for injecting literals
		System.out.println(((CricketCoach)theCoach).getEmail());
		System.out.println(((CricketCoach)theCoach).getTeam());
		
		//close context
		context.close();

	}

}
