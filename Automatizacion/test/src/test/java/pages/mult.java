package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.junit.Assert.assertEquals;

public class mult {
    WebDriver driver;

    public mult(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(tagName = "body")
    WebElement body;

    @FindBy(className = "first")
    WebElement num1;

    @FindBy(className = "second")
    WebElement num2;
    @FindBy(className = "text-async")
    WebElement text;
    public void validate(){
        num1.sendKeys("4");
        num2.sendKeys("5");
        assertEquals("20", text.getText());
    }
}
