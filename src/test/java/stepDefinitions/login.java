package stepDefinitions;

import helpers.driverFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class login {
    pages.welcomePage welcomePage = new pages.welcomePage(driverFactory.getDriver());
    pages.basketPage basketPage = new pages.basketPage(driverFactory.getDriver());
    pages.categoriesPage categoriesPage = new pages.categoriesPage(driverFactory.getDriver());
    pages.homePage homePage = new pages.homePage(driverFactory.getDriver());
    pages.itemsPage itemsPage = new pages.itemsPage(driverFactory.getDriver());
    pages.profilePage profilePage = new pages.profilePage(driverFactory.getDriver());
    @When("Tap skip")
    public void tap_skip(){
        welcomePage.tap_skip();
    }
    @Given("Tap Profil")
    public void tap_profile(){
        homePage.tap_profile();
    }
    @Then("Enter mail {string}")
    public void enter_mail(String string){
        profilePage.enter_mail(string);
    }
    @And("Enter password {string}")
    public void enter_password(String string){
        profilePage.enter_password(string);
    }
    @And("Tap login button")
    public void tap_login_button(){
        profilePage.tap_login_button();
    }
}
