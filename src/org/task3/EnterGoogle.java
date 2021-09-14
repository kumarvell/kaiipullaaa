package org.task3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EnterGoogle {
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Home\\eclipse-workspace\\Google\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	 driver.get("https://www.google.com/");
		WebElement txtenter = driver.findElement(By.name("q"));
		txtenter.sendKeys("greens techology");
	
	
	
	
	
	
	
	}
	
	
	


}
