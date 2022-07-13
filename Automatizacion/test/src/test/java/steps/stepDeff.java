package steps;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import sites.Flask;

public class stepDeff {
    private WebDriver driver;
    public Flask flask;

    @Before
    public void open(){
        driver = new ChromeDriver();
        flask = new Flask(driver);
    }
    @After
    public void close(){
        driver.close();
    }
    @Test
    public void text(){
        driver.get("http://127.0.0.1:5000/");
        flask.getTest().sendKeys();
    }
    @Test
    public void Suma(){
        driver.get("http://127.0.0.1:5000/sum");
        flask.getSum().validate();
    }
    @Test
    public void Mult(){
        driver.get("http://127.0.0.1:5000/mult");
        flask.getMult().validate();
    }
    @Test
    public void Exp(){
        driver.get("http://127.0.0.1:5000/exp");
        flask.getExp().validate();
    }
}
