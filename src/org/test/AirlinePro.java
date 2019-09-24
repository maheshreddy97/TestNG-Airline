package org.test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class AirlinePro {
	@Parameters({"username","password"})
	@Test
	private void test1(@Optional("maheshreddy233.mr@gmail.com")String s1,@Optional("mahesh@8899")String s2) throws AWTException, InterruptedException {
    System.setProperty("webdriver.chrome.driver", "D:\\eclipse\\maheshreddy\\Airlines\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.norwegian.com/us/");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//span[@class='icon-remove icon-remove--arrow-right']")).click();
	
	Robot r=new Robot();
	for (int i = 0; i <=5; i++) {
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
	}
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	
	driver.findElement(By.xpath("//span[@class='icon-small icon-small--flight-arrival']")).click();
		
	for (int j = 0; j <=3; j++) {
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
	}
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	
	driver.findElement(By.xpath("(//span[@class='radio__control-indicator'])[2]")).click();
	driver.findElement(By.xpath("//input[@class='calendar__input']")).click();
	WebElement c = driver.findElement(By.xpath("(//span[text()='28'])[2]"));
	JavascriptExecutor j=(JavascriptExecutor)driver;
	j.executeScript("arguments[0].click()",c);
	WebElement c1 = driver.findElement(By.xpath("//button[@id='searchButton']"));
    j.executeScript("arguments[0].click()",c1);
    WebElement c2 = driver.findElement(By.xpath("//input[@id='FlightSelectOutboundStandardLowFare0']"));
    j.executeScript("arguments[0].click()",c2);
    Thread.sleep(3000);
    WebElement c3 = driver.findElement(By.xpath("//a[@id='ctl00_MainContent_ipcAvaDay_lbtContinue']"));
    j.executeScript("arguments[0].click()",c3);
	Thread.sleep(3000);
	WebElement c4 = driver.findElement(By.xpath("(//input[@class='textbox'])[1]"));
	c4.sendKeys(s1);
	WebElement c5 = driver.findElement(By.xpath("(//input[@class='textbox'])[2]"));
	c5.sendKeys(s2);
	
	driver.findElement(By.xpath("//a[@class='button buttonfixedwide']")).click();
	
	driver.findElement(By.xpath("//select[@class='select']")).click();
	for (int l = 0; l <3; l++) {
		
	r.keyPress(KeyEvent.VK_DOWN);
	r.keyRelease(KeyEvent.VK_DOWN);
	}
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//a[@class='button'])[2]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[text()='Continue']")).click();
	driver.findElement(By.xpath("//a[@class='button']")).click();
	driver.findElement(By.xpath("//a[@id='ctl00_MainContent_ipcResMakeNonAir_ipcContinueButtonBar_lnkContinue']")).click();
	
	
	}
}

