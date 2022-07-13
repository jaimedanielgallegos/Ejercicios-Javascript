package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import sites.Flask;

import static org.junit.Assert.*;
public class test {
    WebDriver driver;

    public test(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(tagName = "body")
    WebElement body;

    @FindBy(className = "async-field")
    WebElement input;

    @FindBy(className = "text-async")
    WebElement text;

    public void validar(){
        assertEquals("El resultado es: 4", body.getText());
    }
    public void sendKeys(){
        input.sendKeys("Hola mundo");
        assertEquals("Hola mundo", text.getText());
    }
}
