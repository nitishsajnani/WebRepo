package POMdemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Googlepageobject {
	
	
	public Googlepageobject(WebDriver driver){
		
		PageFactory.initElements(driver,this);
		
	}
@FindBy(name="q")
	public WebElement txtsearch;

@FindBy(name="btnG")
public WebElement btnsearch;


}
