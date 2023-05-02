package com.saucedemo.pages;

import com.saucedemo.utilities.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {

    By userNameFiled = By.id("user-name");
    By passwordField = By.id("password");
    By loginButton = By.id("login-button");

    public void sendTextToUsernameField(String userName){
        sendTextToElement(userNameFiled, userName);
    }

    public void sendTextToPasswordField(String password){
        sendTextToElement(passwordField, password);
    }
    public void clickOnLoginButton(){
        clickOnElement(loginButton);
    }
}
