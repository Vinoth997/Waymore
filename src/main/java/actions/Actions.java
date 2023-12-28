package actions;

import org.openqa.selenium.By;

import basePackage.BasePo;

public class Actions extends BasePo {
	public static void enterText(By locator, String text) {
		driver.findElement(locator).sendKeys(text);
	}

	public static void buttonClick(By locator) {
		driver.findElement(locator).click();
	}

	public static String getText(By locator) {
		return driver.findElement(locator).getText();
	}

}
