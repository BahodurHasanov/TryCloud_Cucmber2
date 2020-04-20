package com.TryCloud.step_definitions;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hook {


    @Before
    public void setup(){
        System.out.println("============================");
        System.out.println("Test SetUP!");
    }



    @After
    public void teardown(Scenario scenario){
        if(scenario.isFailed()){
            System.out.println("Test Failed");
        }else {
            System.out.println();

            System.out.println("CleanUp");
            System.out.println("Test Completed");
        }
        System.out.println("=============================");
        System.out.println("  ");
    }
}
