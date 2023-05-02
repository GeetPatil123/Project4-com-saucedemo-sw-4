package com.saucedemo.pages;

import com.saucedemo.utilities.Utility;
import org.openqa.selenium.By;

public class ProductsPage extends Utility {
    By productsText = By.xpath("//div[@class='header_secondary_container']/span");
    By productNumber = By.xpath("//div[@class='inventory_item']");


    public String getProductText() {
        return getTextFromElement(productsText);
    }

    public int getnumberOfProducts() {
        return getSizeOfElements(productNumber);
    }
}