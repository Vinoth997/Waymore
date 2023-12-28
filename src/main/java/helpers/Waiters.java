package helpers;

import java.time.Duration;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import basePackage.BasePo;

public class Waiters extends BasePo {

	public static void waitForElementToBeInvisible(WebElement element, long seconds) {
		Wait<WebDriver> wait = new FluentWait<>(driver).withTimeout(Duration.ofSeconds(seconds))
				.pollingEvery(Duration.ofMillis(500)).ignoring(NoSuchElementException.class);

		wait.until(ExpectedConditions.invisibilityOf(element));
	}

}
