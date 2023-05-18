
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;


public class App {
	ChromeDriver driver;
	
	WebDriverWait wait;
	String url= "https://app.talentsphere.io/";
	
	public void invokeBrowser()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\selenium\\AutomationTest\\src\\drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(url);
	}
	public void login()
	{
		driver.findElement(By.linkText("Continue")).click();
		driver.findElement(By.id("login_field")).sendKeys("badopisa");
		driver.findElement(By.id("password")).sendKeys("badeniyi10");
		driver.findElement(By.cssSelector("input[name='commit'][value='Sign in']")).click();
		 try {
	            Thread.sleep(15000);
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
		 driver.findElement(By.className("swal-button--confirm")).click();
		 try {
	            Thread.sleep(3000);
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
		 driver.findElement(By.cssSelector("div.flex.items-center.flex-row.cursor-pointer.relative")).click();
		 driver.findElement(By.xpath("//div[contains(text(), 'Logout')]")).click();
	}
	public void closeBrowser()
	{
		driver.quit();
	}
	public static void main(String[] args)
	{
		App tst= new App();
		tst.invokeBrowser();
		tst.login();
        tst.closeBrowser();
}
}
