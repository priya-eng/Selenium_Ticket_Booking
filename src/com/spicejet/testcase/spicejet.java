package com.spicejet.testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class spicejet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		System.setProperty("webdriver.chrome.driver", "D:\\New folder\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.spicejet.com");
		driver.findElement(By.xpath("//div[@data-testid='to-testID-origin']")).click();
		driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-knv0ih r-1k1q3bj r-ql8eny r-1dqxon3'] //div[contains(text(),'Ahmedabad')]")).click();
		driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-knv0ih r-1k1q3bj r-ql8eny r-1dqxon3'] //div[contains( text(),'Amritsar')]")).click();
		driver.findElement(By.xpath("//div[@data-testid='undefined-month-September-2023'] //div[@data-testid='undefined-calendar-day-7']")).click();
		driver.findElement(By.xpath("//div[@data-testid='return-date-dropdown-label-test-id']")).click();
		driver.findElement(By.xpath("//div[@data-testid='undefined-month-September-2023'] //div[@data-testid='undefined-calendar-day-14']")).click();
		driver.findElement(By.xpath("//div[@data-testid='home-page-travellers']")).click();
		
		for(int i=1; i<=4; i++) {
			driver.findElement(By.xpath("//div[@data-testid='Adult-testID-plus-one-cta']")).click();
		}
		
		driver.findElement(By.xpath("//div[@data-testid='home-page-flight-cta']")).click();
	}

}
