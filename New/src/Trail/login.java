package Trail;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class login {

	public static void main(String[] args) throws InterruptedException {
	
		        System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		        WebDriver driver=new ChromeDriver();
		        driver.manage().window().maximize();
		        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		        driver.get("https://trello.com/");
		        
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

		        //create board Code
		        Thread.sleep(2000);
		        driver.findElement(By.xpath("//p[@class='szBTSFrvPTLGHM']")).click();
		        driver.findElement(By.xpath("(//span[@class='_OHV1cSBxHNA1V ZtCDjzOX0TyLNb'])[1]")).click();

		        driver.findElement(By.xpath("//input[@class='nch-textfield__input lsOhPsHuxEMYEb lsOhPsHuxEMYEb VkPAAkbpkKnPst']")).sendKeys("test 1");
		        WebDriverWait wait=new WebDriverWait(driver, 120);
		        driver.findElement(By.xpath("(//button[.='Create'])[1] ")).click();
		        //after filling the details click on Create
		        wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("(//button[.='Create'])[1]")))).click();
		        Thread.sleep(2000);


		    }
		
		
		
		

	}


