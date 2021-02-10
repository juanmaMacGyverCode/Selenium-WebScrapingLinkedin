package com.browserscrappingselenium.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) throws InterruptedException {

		//SpringApplication.run(DemoApplication.class, args);

		System.setProperty("webdriver.chrome.driver", "C:\\webdriver\\chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.linkedin.com/");

		Thread.sleep(2000);
		driver.findElements(By.xpath("//button[@class='artdeco-global-alert-action artdeco-button artdeco-button--inverse artdeco-button--2 artdeco-button--primary']")).get(1).click();

		driver.findElement(By.id("session_key")).sendKeys("PON_AQUI_TU_EMAIL");
		driver.findElement(By.id("session_password")).sendKeys("PON_AQUI_TU_PASSWORD");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//button[@class='sign-in-form__submit-button']")).click();
		Thread.sleep(20000);

		driver.get("https://www.linkedin.com/mynetwork/invite-connect/connections/");
		Thread.sleep(10000);

		driver.findElement(By.xpath("//button[@class='t-black--light v-align-top artdeco-dropdown__trigger artdeco-dropdown__trigger--placement-bottom ember-view']")).click();
		Thread.sleep(3000);

		driver.findElements(By.xpath("//div[@class='artdeco-dropdown__content-inner']//div")).get(1).click();
		Thread.sleep(3000);

		while (true) {
			List<WebElement> allConnections = driver.findElements(By.xpath("//button[@class='mn-connection-card__dropdown-trigger artdeco-button--tertiary artdeco-button--muted artdeco-button--circle p1 artdeco-dropdown__trigger artdeco-dropdown__trigger--placement-bottom ember-view']"));
			Thread.sleep(3000);

			if (allConnections.size() == 0){
				break;
			}

			for (WebElement connection: allConnections) {
				connection.click();
				Thread.sleep(120);
				driver.findElement(By.xpath("//div[@class='artdeco-dropdown__content artdeco-dropdown__content--is-open artdeco-dropdown--is-dropdown-element artdeco-dropdown__content--has-arrow artdeco-dropdown__content--arrow-right artdeco-dropdown__content--justification-right artdeco-dropdown__content--placement-bottom ember-view']//button")).click();
				Thread.sleep(180);
				driver.findElement(By.xpath("//button[@class='mv2 artdeco-button artdeco-button--2 artdeco-button--primary ember-view']")).click();
				Thread.sleep(75);
			}
			Thread.sleep(3000);
		}

		driver.close();
		driver.quit();
	}

}


