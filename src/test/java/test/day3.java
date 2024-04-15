package test;

import org.testng.annotations.*;

public class day3 {

    @BeforeClass
    public void beforeClass() {
        System.out.println("Before executing all methods in class");
    }

    @Parameters({"URL", "APIKey/usrname"})
    @Test
    public void WebLoginCarLoan(String urlName, String key) {
        //Selenium
        System.out.println("WebLoginCar");
        System.out.println(urlName);
        System.out.println(key);
    }

    @BeforeMethod
    public void beforeEvery() {
        System.out.println("I will execute before every method in day 3 class");
    }

    @AfterMethod
    public void afterEvery() {
        System.out.println("I will execute after every method in day 3 class");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("After executing all methods in class");
    }

    @Test(groups = {"Smoke"})
    public void MobileLoginCarLoan() {
        //Appium
        System.out.println("MobileLoginCar");
    }

    @BeforeSuite
    public void Bfsuite() {
        System.out.println("I an no 1");
    }

    @Test(enabled = false)
    public void MobileSignInCarLoan() {
        //Appium
        System.out.println("MobileSIGNIN");
    }

    @Test(dataProvider = "getData")
    public void MobileSignOutCarLoan(String username, String password) {
        //Appium
        System.out.println("MobileSIGNOUT");
        System.out.println(username);
        System.out.println(password);
    }

    @Test(dependsOnMethods = {"WebLoginCarLoan", "MobileSignOutCarLoan"})
    public void APICarLoan() {
        //Rest API automation
        System.out.println("APILoginCar");
    }

    @DataProvider
    public Object[][] getData() {
        Object[][] data = new Object[3][2];
        data[0][0] = "firstSetUsername";
        data[0][1] = "firstSetPassword";
        data[1][0] = "secondSetUsername";
        data[1][1] = "secondSetPassword";
        data[2][0] = "thirdSetUsername";
        data[2][1] = "thirdSetPassword";
        return data;
    }
}
