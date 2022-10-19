package com.optum.odi.cucumber.demo;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyStepdefs {
    @Given("today is Sunday")
    public void todayIsSunday() {
        System.out.println("Hello");
    }

    @When("I ask whether it's Friday yet")
    public void iAskWhetherItSFridayYet() {
        System.out.println("Hello2");
    }

    @Then("I should be told {string}")
    public void iShouldBeTold(String arg0) {
        System.out.println("Hello3");
    }
}
