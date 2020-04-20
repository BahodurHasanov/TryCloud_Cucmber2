package com.TryCloud.step_definitions;

import io.cucumber.java.en.*;

public class LoginStepDefinition {

    @Given("user is on the landing page")
    public void user_is_on_the_landing_page() {
        System.out.println("I am on the login page");
       // throw   new RuntimeException("Error");
    }

    @Then("user enter username and password")
    public void user_enter_username_and_password() {
        System.out.println("I entered user Credentials");

    }

    @Then("user verifies that {string}page subtitle is displayed")
    public void user_verifies_that_page_subtitle_is_displayed(String string) {
        System.out.println("Verifying page subtitle : "+string);


    }
    @Then("as a user i can verify on different subtitles")
    public void as_a_user_i_can_verify_on_different_subtitles() {
        System.out.println("User can submit on different subtitle");

    }
    @Then("enters {string} username and {string} password")
    public void enters_username_and_password(String string, String string2) {
        System.out.println("Login with" + string+"username and "+string2+"wrong password");

    }

    @Then("user verifies that {string}.massage is displayed")
    public void user_verifies_that_massage_is_displayed(String string) {
        System.out.println("Verified that warning message is displayed :"+string );



    }






}
