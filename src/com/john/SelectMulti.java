package com.john;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectMulti {
public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://output.jsbin.com/osebed/2");
		driver.manage().window().maximize();
		WebElement a = driver.findElement(By.id("fruits"));
		//WebElement b = driver.findElement(By.xpath("//option[text()='Apple']"));
		//WebElement c = driver.findElement(By.xpath("//option[text()='Orange']"));
		//WebElement d = driver.findElement(By.xpath("//option[text()='Grape']"));
		Select s= new Select(a);
		s.selectByVisibleText("Banana");
		s.selectByIndex(0);
		s.selectByIndex(1);
		s.selectByIndex(2);
		Thread.sleep(5000);
		//s.deselectAll();
		s.deselectByIndex(1);
	}

}
