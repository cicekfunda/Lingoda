package com.lingoda.step_definitions;

import com.lingoda.pages.BasePage;
import com.lingoda.pages.JavaScriptPage;
import com.lingoda.utilities.BrowserUtils;
import com.lingoda.utilities.ConfigurationReader;
import com.lingoda.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class JavaScriptStepDefs {

    WebDriver driver = Driver.get();
    JavaScriptPage javaScriptPage = new JavaScriptPage();


    @Given("User is on the TodoMVC page")
    public void user_is_on_the_TodoMVC_page() {
        String url = ConfigurationReader.get("url");
        driver.get(url);
        BrowserUtils.waitFor(1);
    }

    @When("User should click on {string} tab")
    public void user_should_click_on_tab(String string) {
        String tab = BasePage.elementTab(string);
        driver.findElement(By.xpath(tab)).click();
        BrowserUtils.waitFor(2);
    }

    @When("User should click on {string} link")
    public void user_should_click_on_link(String string) {

        String link = javaScriptPage.JSexampleTypyeLink(string);
        driver.findElement(By.xpath(link)).click();
        BrowserUtils.waitFor(2);

    }


}
