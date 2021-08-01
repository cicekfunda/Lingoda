package com.lingoda.step_definitions;

import com.lingoda.pages.PolymerPage;
import com.lingoda.utilities.BrowserUtils;
import com.lingoda.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PolymerStepDefs {

    WebDriver driver = Driver.get();
    PolymerPage polymerPage = new PolymerPage();
    WebDriverWait wait = new WebDriverWait(driver,20);

    @When("User adds {string} item")
    public void userAddsItem(String toDoItem) {
        polymerPage.createItemBox.sendKeys(toDoItem + Keys.ENTER);
        wait.until(ExpectedConditions.visibilityOf(polymerPage.createdItem(toDoItem)));
    }

    @Then("User should see the created {string} item")
    public void userShouldSeeTheCreatedItem(String arg0) {

        Assert.assertTrue(polymerPage.createdItem(arg0).isDisplayed());

    }

    @When("User adds {string} as a Todo item1")
    public void user_adds_as_a_Todo_item1(String item1) {
        polymerPage.createItemBox.sendKeys(item1 + Keys.ENTER);
        BrowserUtils.waitFor(2);

    }

    @When("User adds {string} as a Todo item2")
    public void user_adds_as_a_Todo_item2(String item2) {
        polymerPage.createItemBox.sendKeys(item2 + Keys.ENTER);
        BrowserUtils.waitFor(2);

    }

    @Then("User edits the content of the {string} Todo item2")
    public void user_edits_the_content_of_the_Todo_item2(String str) {

        ((JavascriptExecutor) driver).executeScript("var evt = document.createEvent('MouseEvents');" +
                "evt.initMouseEvent('dblclick',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);" +
                "arguments[0].dispatchEvent(evt);", polymerPage.createdItem(str));

                ((JavascriptExecutor) driver).executeScript("arguments[0].value ='';", polymerPage.editbox);

                polymerPage.editbox.sendKeys("I got it!" + Keys.ENTER);


//                SECOND WAY WITH Using SendKeys method

//        for (int i = 0; i < str.length(); i++) {
//
//            polymerPage.editbox.sendKeys(Keys.BACK_SPACE);
//        }
//        polymerPage.editbox.sendKeys("I got it!" + Keys.ENTER);


//             THIRD WAY WITH Using Actions Class

//        Actions act = new Actions(driver);
//        WebElement btnElement = polymerPage.createdItem(str);
//        act.doubleClick(btnElement).perform();
//
//        for (int i = 0; i < str.length(); i++) {
//            polymerPage.editbox.sendKeys(Keys.BACK_SPACE);
//        }
//
//        polymerPage.editbox.sendKeys("I got it!" + Keys.ENTER);

        BrowserUtils.waitFor(2);




    }

}
