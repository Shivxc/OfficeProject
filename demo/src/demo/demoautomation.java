package demo;

import org.openqa.selenium.chrome.ChromeDriver;

public class demoautomation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("WebDriver.Chrome.Driver", "D:\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://wbpermit.neml.in/ePermitWeb/");
	}

}
