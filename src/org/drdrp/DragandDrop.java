package org.drdrp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {
	public static void main (String []args) throws AWTException, InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WebElement name = driver.findElement(By.id("email"));
		name.sendKeys("manoj");
		
		Actions n = new Actions(driver);
		
		n.doubleClick(name).perform();
		
//		n.contextClick(name).perform();
//		
////		Robot m = new Robot();
//		
//		Thread.sleep(2000);
//		
		
//		for (int i = 0; i<3; i++) {
//			m.keyPress(KeyEvent.VK_DOWN);
//			m.keyRelease(KeyEvent.VK_DOWN);
//		}
//		
//		Thread.sleep(2000);
//		
//	    m.keyPress(KeyEvent.VK_ENTER);
//		m.keyRelease(KeyEvent.VK_ENTER);
//		
//		 
//        WebElement pass = driver.findElement(By.id("pass"));
//		
//		n.contextClick(pass).perform();
//		
//		Thread.sleep(2000);
//		
//		for (int j=0;j<5;j++) {
//			m.keyPress(KeyEvent.VK_DOWN);
//			m.keyRelease(KeyEvent.VK_DOWN);
//		} 
//		
//		Thread.sleep(2000);
//		
//		m.keyPress(KeyEvent.VK_ENTER);
//		m.keyRelease(KeyEvent.VK_ENTER);
//		
//		Thread.sleep(2000);
//		
//		driver.quit();
//		
//		
		//USING KEY BOARD IN THE SHORTCUT-KEY(ROBOT)
		
			
		
		Robot Y = new Robot();
		
		Y.keyPress(KeyEvent.VK_CONTROL);
		Y.keyPress(KeyEvent.VK_C);
		
		Thread.sleep(2000);
		
		Y.keyRelease(KeyEvent.VK_CONTROL);
		Y.keyRelease(KeyEvent.VK_C);
		
		Thread.sleep(2000);
		
		Y.keyPress(KeyEvent.VK_TAB);
		Y.keyRelease(KeyEvent.VK_TAB);
		
		Thread.sleep(2000);
		
		Y.keyPress(KeyEvent.VK_CONTROL);
		Y.keyPress(KeyEvent.VK_V);
		
		Thread.sleep(2000);
		
		Y.keyRelease(KeyEvent.VK_CONTROL);
		Y.keyRelease(KeyEvent.VK_V);
		
		driver.quit();
		
		
		
		
		
		
		
		
		
		
//		for (int j = 0; j<7; j++) {
//			m.keyPress(KeyEvent.VK_DOWN);
//			m.keyPress(KeyEvent.VK_DOWN);
//		}
//		m.keyPress(KeyEvent.VK_TAB);
//		m.keyRelease(KeyEvent.VK_TAB);
////		
//		m.keyPress(KeyEvent.VK_CONTROL);
//		m.keyRelease(KeyEvent.VK_V);
//		m.keyPress(KeyEvent.VK_CONTROL);
//		m.keyRelease(KeyEvent.VK_V);
		
	
		
		
		
		
		
//		WebElement name = driver.findElement(By.id("email"));
//		name.sendKeys("nishanth");
//		
//		//Double click;
//		
//		Actions a = new Actions(driver);
//		
//		a.doubleClick(name).perform();
//		
//		//Right click
//		
//		a.contextClick(name).perform();
//		
//		//robot used in keypress
//		
//		Robot b = new Robot();
//		
//		b.keyPress(KeyEvent.VK_DOWN);
//		b.keyRelease(KeyEvent.VK_DOWN);
//		
//		Thread.sleep(2000);
//		
//		b.keyPress(KeyEvent.VK_DOWN);
//		b.keyRelease(KeyEvent.VK_DOWN);
//		
//		Thread.sleep(2000);
//		
//		b.keyPress(KeyEvent.VK_DOWN);
//		b.keyRelease(KeyEvent.VK_DOWN);
//		
//		Thread.sleep(2000);
//		
//		b.keyPress(KeyEvent.VK_ENTER);
//		b.keyRelease(KeyEvent.VK_ENTER);
//		
//		
//		for (int i=0; i<4; i++) {
//			b.keyPress(KeyEvent.VK_DOWN);
//			b.keyRelease(KeyEvent.VK_DOWN);
//		}
//		b.keyPress(KeyEvent.VK_ENTER);
//		b.keyRelease(KeyEvent.VK_ENTER);
//		
//		b.keyPress(KeyEvent.VK_CONTROL);
//		b.keyRelease(KeyEvent.VK_C);
//		b.keyPress(KeyEvent.VK_CONTROL);
//		b.keyPress(KeyEvent.VK_C);
//		
//		
//		
//		b.keyPress(KeyEvent.VK_TAB);
//		b.keyRelease(KeyEvent.VK_TAB);
//
//		
//
//		b.keyPress(KeyEvent.VK_CONTROL);
//		b.keyRelease(KeyEvent.VK_V);
//		b.keyPress(KeyEvent.VK_CONTROL);
//		b.keyPress(KeyEvent.VK_V);
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
