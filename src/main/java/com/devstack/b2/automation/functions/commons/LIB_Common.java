package com.devstack.b2.automation.functions.commons;

import com.devstack.b2.automation.functions.FunctionBase;
import com.devstack.b2.automation.pages.commons.PageLogin;
import com.devstack.b2.automation.reporter.ExtentReportManager;
import org.openqa.selenium.WebDriver;

public class LIB_Common extends FunctionBase {

    public PageLogin pageLogin;

    public LIB_Common(WebDriver driver) {
        super(driver);
        pageLogin = new PageLogin(driver);
    }
    public void bc_Login(String username, String password) {
        ExtentReportManager.writeToReport("Start of bc_Login ");
        pageLogin.fillUserName(username);
        pageLogin.fillPassword(password);
        pageLogin.clickLogin();
        ExtentReportManager.writeToReport("End of bc_Login ");
    }
}
