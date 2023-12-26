package basePackage;

import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Baseclass {
	protected WebDriver driver;

	public void browserLanuch() {
		
		driver = new ChromeDriver();
		driver.get("https://dev.waymore.io/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}

	public void enterText(WebElement element, String text) {
		element.sendKeys(text);

	}

	public void buttonclick(WebElement element) {
		element.click();

	}
	public void closeBrowser() {
		driver.quit();
	}
	
	public String getText(WebElement element) {
		return element.getText();
		
	}
//	public void waitForLocator(WebElement element, String text) {
//		WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(10));
//		wait.until(ExpectedConditions.textToBePresentInElement(element, text));
//		
//	}
	
	public String jsonValues(String datas) {

		JSONParser parser = new JSONParser();
		String output = "";
		try (FileReader reader = new FileReader("resources/logindetails.json")) {

			Object obj = parser.parse(reader);

			JSONObject data = (JSONObject) obj;

			output = (String) data.get(datas);


		} catch (IOException e) {

			e.printStackTrace();

		} catch (ParseException e) {

			e.printStackTrace();

		}

		return output ;

	}

}
