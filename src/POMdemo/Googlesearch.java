package POMdemo;


import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Googlesearch {

public static void main(String arg[]) throws IOException
{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Tester\\Desktop\\Softwares\\chromedriver.exe");
	//WebDriver driver = new  ChromeDriver();
	
	// driver.navigate().to("https:/creative.adobe.com/products/download/animate?addfeatures=temp_download_wam_page_phase2&wamFeature=preprod");
	//Googlepageobject obj= new Googlepageobject(driver);
	Runtime runTime = Runtime.getRuntime();
	Process process = runTime.exec("C:\\Users\\Tester\\Desktop\\New folder\\Animate_Set-Up");
	try {
		Thread.sleep(8000);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	System.out.println("executed successfully");
	//obj.txtsearch.sendKeys("london");
	//obj.btnsearch.click();
	}

}
