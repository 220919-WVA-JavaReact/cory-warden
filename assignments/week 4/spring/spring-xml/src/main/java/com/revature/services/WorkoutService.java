package com.revature.services;

public class WorkoutService {

    public WorkoutService() {
        System.out.println("Workout Service Initialized");
    }

    //pretend this is pulling from some api
    public String fetchWorkoutRoutine(String coachType) {

        switch(coachType.toLowerCase()) {
            case "baseball":
                return "Today's workout: 1hr BP";
            case "track": ;
                return "Today's workout: Run a 5k in 30m";
            case "football":
                return "Today's workout: suicides to 40, 50, 60, 70, 80, 90, and 100";
            default:
                return "Day off.";
        }

        //If additional info, break statement needed or additional logic.
    }
}
