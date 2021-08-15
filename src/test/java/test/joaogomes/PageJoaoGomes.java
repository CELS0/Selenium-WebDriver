package test.joaogomes;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageJoaoGomes {
	private WebDriver driver;
	@Test
	public void joaoGomes() {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		this.driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.navigate().to("https://www.youtube.com/");
		driver.findElement(By.cssSelector("input[id=search]")).click();
		driver.findElement(By.cssSelector("input[id=search]")).sendKeys("Joao Gomes");
		driver.findElement(By.id("search-icon-legacy")).click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException ie) {
		}
		driver.findElement(By.xpath("//*[@id=\"items\"]/ytd-watch-card-compact-video-renderer[3]/a/div")).click();
		try {
			Thread.sleep(8000);
		} catch (InterruptedException ie) {
		}
		driver.findElement(By.cssSelector(".ytp-ad-skip-button.ytp-button")).click();
	}
}
