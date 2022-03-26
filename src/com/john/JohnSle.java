package com.john;

import java.awt.desktop.QuitEvent;
import java.io.File;
import java.io.IOException;
import java.sql.Driver;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class JohnSle {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		WebElement s = driver.findElement(By.xpath("//a[text()=' BANK ']"));
		WebElement o = driver.findElement(By.xpath("//li[@class='placeholder'][1]"));
		
		WebElement s1 = driver.findElement(By.xpath("//a[text()=' 5000 ']"));
		WebElement o1 = driver.findElement(By.xpath("//ol[@id='amt7']"));
		
		WebElement s2 = driver.findElement(By.xpath("//a[text()=' SALES ']"));
		WebElement o2 = driver.findElement(By.xpath("//ol[@id='loan']"));
		
		WebElement s3 = driver.findElement(By.xpath("//a[text()=' 5000']"));
		WebElement o3 = driver.findElement(By.xpath("//ol[@id='amt8']"));
		
		Actions a = new Actions(driver); 
		a.dragAndDrop(s, o).perform();
		a.dragAndDrop(s1, o1).perform();
		a.dragAndDrop(s2, o2).perform();
		a.dragAndDrop(s3, o3).perform();
		TakesScreenshot st = (TakesScreenshot)driver;
		File sr =st.getScreenshotAs(OutputType.FILE);
		File srs=new File("C:\\Users\\Admin\\eclipse-workspace\\John\\Driver\\hg");
		FileUtils.copyFile(sr, srs);
		
		
		
	
		
		
	}

}
