package amazondemo;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class add_to_chart {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "G:/chrome/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		System.out.println("amazon open");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("samsung galaxy a14 5g");
		
		driver.findElement(By.id("nav-search-submit-button")).click();
		
		System.out.println("search for mobile");
		
		Thread.sleep(1000);
		
		JavascriptExecutor j =(JavascriptExecutor)driver;
		
		j.executeScript("window.scrollBy(0,500)");
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//span[@class=\"a-size-medium a-color-base a-text-normal\"])[1]")).click();
		
		System.out.println("new tab open");
		Thread.sleep(1000);
		
		Set<String> s =driver.getWindowHandles();
		
		Iterator<String> it = s.iterator();
		
		String w1st = it.next();
		
		String w2nd = it.next();
		
		driver.switchTo().window(w2nd);
		
		driver.findElement(By.xpath("//input[@id=\"add-to-cart-button\"]")).click();
		
		System.out.println("add to cart done");
		
		Thread.sleep(1000);
		
		
		driver.quit();

	}

}
