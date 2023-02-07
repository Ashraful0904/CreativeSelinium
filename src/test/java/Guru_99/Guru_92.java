package Guru_99;

import Reusable_Actions.Reusable99;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class Guru_92 {

    WebDriver driver;

    @BeforeSuite
    public void SetTheDriver() { driver = Reusable99.setDriver();}



    @Test
    public void Guru() {

    driver.navigate().to("https://www.demo.guru99.com");

    Reusable99.sendKeysMethod(driver,"//*[@name='emailid']","ashraful0904@gmail.com","GuruUsername");

     Reusable99.submitMethod(driver,"//*[@name='btnLogin']","SubmitButton");


  }//End of Test

    @AfterSuite
    public void quitSession(){
        driver.quit();
    }


    }//End of Method


