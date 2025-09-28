package com.devstack.b2.automation.pages.commons;

import com.devstack.b2.automation.testbase.SeleniumTestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PageLogin extends SeleniumTestBase {
    public PageLogin(WebDriver driver) {
        super(driver);
    }

    By tf_userName = By.id("username");
    By tf_password = By.id("password");
    By btn_login = By.xpath("//button[text()='Login']");
    By btn_loginBtn = By.xpath("//button[text()='Log']");

    public void fillUserName(String userName) {
        type(tf_userName,userName);
    }
    public void fillPassword(String password) {
        type(tf_password,password);
    }
    public void clickLogin() {
        click(btn_login);
    }
    public void clickLoginBtn() {
        click(btn_loginBtn);
    }

}
