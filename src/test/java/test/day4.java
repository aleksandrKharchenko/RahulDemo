package test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day4 {

    @Parameters({"URL"})
    @Test
    public void WebLoginHomeLoan(String uname) {
        //Selenium
        System.out.println("WebLoginPersonalLoan");
        System.out.println(uname);
    }

    @Test(groups = {"Smoke"})
    public void MobileLoginHomeLoan() {
        //Appium
        System.out.println("MobileLoginHome");
    }

    @Test
    public void APILoginHomeLoan() {
        //Rest API automation
        System.out.println("APILoginHome");
    }
}
