package com.TryCloud.step_definitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hook {


    @Before
    public void setup(){
        System.out.println("Test SetUP!");
    }

    @After
    public void teardown(){
        System.out.println("CleanUp");
        System.out.println("Test Completed");
    }





}
