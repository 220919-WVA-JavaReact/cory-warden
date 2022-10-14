package com.revature;

import com.revature.models.Coach;
import com.revature.models.FootballCoach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringXmlDriver {

    public static void main(String[] args) {

        System.out.println("Creating the bean (IoC) container...");

        try (ClassPathXmlApplicationContext beanContainer= new ClassPathXmlApplicationContext("beans.xml")) {
            System.out.println("Beans Container Created");

            //Retrieve a bean from the container with the ID "myTrackCoach"
            Coach headCoach = beanContainer.getBean("myTrackCoach", Coach.class);

            //Call methods on the retrieved bean to make sure it is wired/configured correctly.
            System.out.println(headCoach.getDailyWorkout());
            System.out.println(headCoach.getMotivation());

            //Creating assistant coach -- should be able to use same services if wired correctly.
            Coach asstCoach = beanContainer.getBean("myTrackCoach", Coach.class);
            System.out.println(asstCoach.getDailyWorkout());
            System.out.println(asstCoach.getMotivation());
            System.out.println("+--------------------------------+");

            System.out.println("Same motivational service?");
            System.out.println(headCoach.getMotivationalService() == asstCoach.getMotivationalService());
            System.out.println("+--------------------------------+");
            System.out.println("Same coach?");
            System.out.println(headCoach == asstCoach);
            //changing scope in beans.xml to "prototype" will make them different coaches.
            System.out.println("+--------------------------------+");

            FootballCoach footballCoach = beanContainer.getBean(FootballCoach.class);
            System.out.println(footballCoach.getDailyWorkout());
            System.out.println(footballCoach.getMotivation());
            System.out.println(footballCoach.getTeamName());
            System.out.println(footballCoach.getEmail());

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
