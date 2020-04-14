package com.TryCloud.step_definitions;

import io.cucumber.java.en.*;

public class LoginStepDefinition {

    @Given("user is on the landing page")
    public void user_is_on_the_landing_page() {
        System.out.println("I am on the login page");
    }

    @Then("user enter username and password")
    public void user_enter_username_and_password() {
        System.out.println("I entered user Credentials");
    }

    @Then("user verifies that {string}page subtitle is displayed")
    public void user_verifies_that_page_subtitle_is_displayed(String string) {
        System.out.println("Verifying page subtitle"+string);

    }




}
