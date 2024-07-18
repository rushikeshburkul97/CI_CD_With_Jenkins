package org.POM_TestCases;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;

public class Local {

	public static void main(String[] args) {
	//	WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
	//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		
		DevTools devTools = driver.getDevTools();
		devTools.createSession();
		
		HashMap<String,Object> coordinates = new HashMap<String,Object>();
		coordinates.put("lattitue", 17);
		coordinates.put("longitude",78);
		coordinates.put("accuracy",1);
		
		driver.executeCdpCommand("Emulation.setGeolocationOverride", coordinates);
		
		driver.get("https://www.google.co.in/");
		driver.findElement(By.name("q")).sendKeys("netflix", Keys.ENTER);
		driver.findElements(By.cssSelector(".LC20lb.MBeuO.DKV0Md")).get(0).click();
		System.out.println(driver.getTitle());
		
		

	



	}

}
