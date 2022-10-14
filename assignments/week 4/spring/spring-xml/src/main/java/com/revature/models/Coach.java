package com.revature.models;

import com.revature.services.MotivationalService;

public interface Coach {
    //Interface is a contract that stipulates anything that implements it

    String getDailyWorkout();
    String getMotivation();
    MotivationalService getMotivationalService();
}
