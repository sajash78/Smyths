package org.example.StepDefinationPackage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.example.PageObjecPackage.HomePage;

public class HomePageSteps {
             HomePage homePage = new HomePage();
    @Given("^user is on the home page of website$")
    public void user_is_on_the_home_page_of_website() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    }

    @When("^user selects UK flag$")
    public void user_selects_UK_flag() throws Throwable {
        Thread.sleep(4000);
        homePage.Country();
        // Write code here that turns the phrase above into concrete actions
    }

    @Then("^user should be able to see all the selected counrty they wants$")
    public void user_should_be_able_to_see_all_the_selected_counrty_they_wants() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    }






}
