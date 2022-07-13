package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.junit.Assert.assertEquals;

public class exp {
    WebDriver driver;

    public exp(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(tagName = "body")
    WebElement body;

    @FindBy(className = "num")
    WebElement num1;

    @FindBy(className = "exp")
    WebElement num2;
    @FindBy(className = "text-async")
    WebElement text;
    public void validate(){
        num1.sendKeys("2");
        num2.sendKeys("3");
        assertEquals("8", text.getText());
    }
}
