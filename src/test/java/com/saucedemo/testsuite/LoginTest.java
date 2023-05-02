package com.saucedemo.testsuite;

import com.saucedemo.pages.LoginPage;
import com.saucedemo.pages.ProductsPage;
import com.saucedemo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {
    //Created object of LoginPage to access the WebElements
    LoginPage loginPage = new LoginPage();
    ProductsPage productsPage = new ProductsPage();

    @Test
    public void verifyUserShouldNavigateToLoginPageSuccessfully(){
        //enter username
        loginPage.sendTextToUsernameField("standard_user");
        //enter password
        loginPage.sendTextToPasswordField("secret_sauce");
        //login
        loginPage.clickOnLoginButton();
        //verify whether products text is displayed
        String expectedProductText = "PRODUCTS";
        String actualProductsText = productsPage.getProductText().toUpperCase();
        Assert.assertEquals(actualProductsText, expectedProductText, "Products text not displayed");
    }

    @Test
    public void verifyThatSixProductsAreDisplayed(){
        //enter username
        loginPage.sendTextToUsernameField("standard_user");
        //enter password
        loginPage.sendTextToPasswordField("secret_sauce");
        //login
        loginPage.clickOnLoginButton();
        //verify whether 6 products display pre page
        int expectedProductsPerPage = 6;
        int actualProductsPerPage = productsPage.getnumberOfProducts();
        Assert.assertEquals(expectedProductsPerPage, actualProductsPerPage,"Products per page is not 6");

    }
}
