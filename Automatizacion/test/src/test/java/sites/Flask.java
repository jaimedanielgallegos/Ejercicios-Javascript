package sites;

import org.openqa.selenium.WebDriver;
import pages.exp;
import pages.mult;
import pages.sum;
import pages.test;

public class Flask {
    public WebDriver driver;
    public Flask(WebDriver driver){
        this.driver = driver;
    }
    public test getTest(){
        return new test(driver);
    }
    public sum getSum(){return new sum(driver);}
    public mult getMult(){return new mult(driver);}
    public exp getExp(){return new exp(driver);}

}
