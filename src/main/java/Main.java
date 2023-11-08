import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Main {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\cezar\\OneDrive\\Pulpit\\KURS TESTER SE\\Selenium-a\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        ChromeOptions options= new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://demoqa.com/books");
        driver.findElement(By.id("login")).click();
        driver.findElement(By.id("userName")).sendKeys("gunjankaushik");
        driver.findElement(By.id("password")).sendKeys("Password@123");
driver.findElement(By.id("login")).click();


    }
}
