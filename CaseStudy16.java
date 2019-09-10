package com.virtusa.testing.AutomationTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CaseStudy16 {

	public static void main(String[] args) {
		WebDriverManager .chromedriver().setup(); //loading chrome driver from binary file
        String baseurl="C:/Users/dipikaagrawal/Downloads/HTML Pages/Popup2.html"; //string url
        WebDriver driver=new ChromeDriver(); //creating a driver of type web
        driver.get(baseurl); //opening base url in browser
        
        driver.findElement(By.tagName("button")).click();
        
        
        System.out.println(driver.switchTo().alert().getText());
        
        //Accept the pop up window
        driver.switchTo().alert().accept();
        String message=driver.findElement(By.id("confirmdemo")).getText();
        if(message.contains("OK"))
        	System.out.println("U accepted");
        else
        	System.out.println("U dismissed");
	}

}
