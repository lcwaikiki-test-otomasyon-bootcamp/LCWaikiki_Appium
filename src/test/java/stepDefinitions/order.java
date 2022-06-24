package stepDefinitions;

import helpers.driverFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class order {
    pages.welcomePage welcomePage = new pages.welcomePage(driverFactory.getDriver());
    pages.basketPage basketPage = new pages.basketPage(driverFactory.getDriver());
    pages.categoriesPage categoriesPage = new pages.categoriesPage(driverFactory.getDriver());
    pages.homePage homePage = new pages.homePage(driverFactory.getDriver());
    pages.itemsPage itemsPage = new pages.itemsPage(driverFactory.getDriver());
    pages.profilePage profilePage = new pages.profilePage(driverFactory.getDriver());
    @Given("Tap Kategoriler")
    public void tap_kategoriler(){
        homePage.tap_kategoriler();
    }
    @When("Tap Kadın")
    public void tap_kadın(){
        categoriesPage.tap_kadın();
    }
    @Then("Tap Giyim")
    public void tap_giyim(){
        categoriesPage.tap_giyim();
    }
    @And("Scroll to {string}")
    public void scroll_to_item(String string){
        categoriesPage.scroll_to_item(string);
    }
    @And("Tap Bluz")
    public void tap_bluz(){
        categoriesPage.tap_bluz();
    }
    @And("Tap Filtre")
    public void tap_filtre(){
        itemsPage.tap_filtre();
    }
    @And("Tap Renk")
    public void tap_renk(){
        itemsPage.tap_renk();
    }
    @And("Filter by colour {string}")
    public void filter_by_colour(String string){
        itemsPage.filter_by_colour(string);
    }
    @And("Tap Siyah")
    public void tap_siyah(){
        itemsPage.tap_siyah();
    }
    @And("Tap Uygula")
    public void tap_uygula(){
        itemsPage.tap_uygula();
    }
    @And("Tap Sonuçları Listele")
    public void tap_show_result(){
        itemsPage.tap_show_result();
    }
    @And("Tap {int} item")
    public void tap_item_by_order(int i){
        itemsPage.tap_item_by_order(i);
    }
    @And("Tap Sepete Ekle")
    public void tap_sepete_ekle(){
        itemsPage.tap_sepete_ekle();
    }
    @And("Chooice size {string}")
    public void chooice_size(String string){
        itemsPage.chooice_size(string);
    }
    @And("Tap Sepetime Git")
    public void tap_sepetime_git(){
        itemsPage.tap_sepetime_git();
    }
    @And("Tap ÖDEME ADIMINA GEÇ")
    public void go_to_payment(){
        basketPage.go_to_payment();
    }


}
