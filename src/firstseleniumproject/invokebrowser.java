package firstseleniumproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class invokebrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.verizon.com/");
		System.out.println(driver.getTitle());
		driver.getCurrentUrl();
		driver.close();
	}
}
