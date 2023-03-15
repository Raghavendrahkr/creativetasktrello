package Trail;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDropFC {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://trello.com/b/znah86jI/test-1");
		Thread.sleep(2000);

		//Login menu button click
		driver.findElement(By.linkText("Log in")).click();
		//Email ID Field data
		driver.findElement(By.id("user")).sendKeys("karankaran0614@gmail.com");
		//continue/next button click 
		driver.findElement(By.id("login")).click();
		Thread.sleep(2000);
		//password field data
		driver.findElement(By.id("password")).sendKeys("Test@123");
		//Login button click 
		driver.findElement(By.xpath("(//span[@class='css-178ag6o'])[1]")).click();

		//LIST-A CARD TO-DO
		driver.findElement(By.xpath("(//span[.='Add a card'])[1]")).click();
		driver.findElement(By.xpath("//textarea[@class='list-card-composer-textarea js-card-title']")).sendKeys("List A");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='nch-button nch-button--primary confirm mod-compact js-add-card']")).click();
		driver.findElement(By.xpath("//a[@class='icon-lg icon-close dark-hover js-cancel']")).click();
		Thread.sleep(2000);

		//Drag LIST A todo data
		WebElement List_A = driver.findElement(By.xpath("(//span[@class='list-card-title js-card-name'])[1]"));
		WebElement List_B = driver.findElement(By.xpath("(//div[@class='list-header-target js-editing-target'])[2]"));
		Actions action=new Actions(driver);
		action.dragAndDrop(List_A, List_B).perform();
		Thread.sleep(2000);

		// x & Y coordinates data
		org.openqa.selenium.Point p=List_A.getLocation();
		System.out.println("The Position of X coordinates is :" +p.getX());
		System.out.println("The Position of Y coordinates is :" +p.getY());

		//logout data
		driver.findElement(By.xpath("//span[@class='DweEFaF5owOe02 rQ86P0iNikD4I9 Cg0RMJhBknTRbM']")).click();
		driver.findElement(By.xpath(("(//button[@class='yTThzZMDkelhke'])[2]"))).click();
	}


}


