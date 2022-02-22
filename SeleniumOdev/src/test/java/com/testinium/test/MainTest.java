package com.testinium.test;

import com.testinium.driver.BaseTest;
import com.testinium.page.AddBasketPage;
import com.testinium.page.CatalogPage;
import com.testinium.page.LoginPage;
import com.testinium.page.ProductPage;
import org.junit.Test;

public class MainTest extends BaseTest {

    @Test
    public void mainTest(){
        LoginPage loginPage = new LoginPage();
        ProductPage productPage = new ProductPage();
        loginPage.login();
        productPage.selectProduct();
        CatalogPage catalogPage = new CatalogPage();
        catalogPage.catalogPageTest();
        AddBasketPage addBasketPage = new AddBasketPage();
        addBasketPage.addBasketPageTest();
    }

}
