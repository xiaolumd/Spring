package demo1.coach;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CoachFactory {
	public static void main(String[] args) {
		
		// load the spring configuration file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		// retrieve bean from spring container
		String coachReq = "basketballCoach";
		Coach theCoach = context.getBean(coachReq,Coach.class);
		// call method on the bean
		System.out.println(theCoach.getWorkout());
		// close the context
		context.close();
	}
}
