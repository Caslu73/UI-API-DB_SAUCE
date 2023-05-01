package com.sauce.pages;

import com.sauce.utility.ConfigurationReader;
import com.sauce.utility.Driver;
import org.openqa.selenium.support.PageFactory;


public class LoginPage {

    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }





    public void login(String userType){

        String username= ConfigurationReader.getProperty(userType+"_username");
        String password=ConfigurationReader.getProperty(userType+"_password");

        /*
        emailBox.sendKeys(username);
        passwordBox.sendKeys(password);
        loginButton.click();

         */

    }

    public void login(String email,String password){

        /*
        emailBox.sendKeys(email);
        passwordBox.sendKeys(password);
        loginButton.click();

         */

    }




}
