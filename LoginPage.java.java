package org.ramesh.linkedin;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		{
			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
			ChromeDriver driver = new ChromeDriver();
			driver.get("https://in.linkedin.com");
			driver.manage().window().maximize();
			//email and password
			driver.findElement(By.xpath("//*[@id=\"email-or-phone\"]")).sendKeys("ramesh12yuvi@gmail.com");
			driver.findElement(By.xpath("//*[@id=\"session_password\"]")).sendKeys("xxxxxxxx");
			driver.findElement(By.xpath("//*[@id=\"main-content\"]/section[1]/div/div/form/div[2]/button")).click();
		}
		}

	}

}
