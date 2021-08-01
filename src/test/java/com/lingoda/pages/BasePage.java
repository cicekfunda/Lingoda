package com.lingoda.pages;

import com.lingoda.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {

    public BasePage() {
        PageFactory.initElements(Driver.get(), this);
    }


    public static String elementTab(String str){
        return "//div[text()='"+str+"']";
    }




}