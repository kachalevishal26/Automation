import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class datepicker_MakeMyTrip 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Asus\\chromedriver.exe\\");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.makemytrip.com/");
		driver.findElement(By.xpath("//input[@id='departure']")).click();
		driver.findElements(By.xpath("//*[@class='DayPicker-Month']")).get(0);
		List<WebElement> dates = (List<WebElement>) driver.findElements(By.xpath("//*[@class='DayPicker-Month']")).get(0).getSize();
		System.out.println(dates);
	}
}
