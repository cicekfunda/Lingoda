package com.lingoda.pages;

import com.lingoda.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PolymerPage extends BasePage {

    @FindBy(id = "new-todo")
    public WebElement createItemBox;

    @FindBy(id = "edit")
    public WebElement editbox;

    public WebElement createdItem(String str){

        return Driver.get().findElement(By.xpath("//label[.='"+str+"']"));
    }
}
