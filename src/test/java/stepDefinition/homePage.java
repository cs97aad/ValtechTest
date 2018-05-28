package stepDefinition;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.homePom;
import util.driverManager;

public class homePage {

    homePom hp = new homePom();
    driverManager dm = new driverManager();
    @Before
    public void startSession(){
        dm.setdriver("chrome");
    }

    @Given("^I am on the \"([^\"]*)\"$")
    public void i_am_on_the(String arg1) throws Throwable {
    hp.launchUrl();
    }

    @Given("^I confirm \"([^\"]*)\" section is displayed$")
    public void i_confirm_section_is_displayed(String arg1) throws Throwable {
    hp.confirmLatestnewssection();
    }

    @When("^I click on \"([^\"]*)\" pages$")
    public void i_click_on_pages(String pagename) throws Throwable {
        hp.navMenu();
        if(pagename.equalsIgnoreCase("about")){
            hp.clickAbouttab();
        }
        if(pagename.equalsIgnoreCase("services")){
          hp.clickServicestab();
        }
        if(pagename.equalsIgnoreCase("work")){
        hp.clickWorktab();
        }else {
            System.out.println("tab not found");

        }


    }

    @When("^I verify the \"([^\"]*)\" are displayed$")
    public void i_verify_the_are_displayed(String arg1) throws Throwable {

    }

    @When("^I navigate to contact pages to count the numbers of offices$")
    public void i_navigate_to_contact_pages_to_count_the_numbers_of_offices() throws Throwable {

    }

    @Then("^the number of offices are displayed\\.$")
    public void the_number_of_offices_are_displayed() throws Throwable {

    }
}
