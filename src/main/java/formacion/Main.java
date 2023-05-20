package formacion;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;


public class Main {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/login");
        System.out.println(driver.getTitle());
        driver.findElement(By.id("userName")).sendKeys("micorreo@autentia.com");
        driver.findElement(By.id("password")).sendKeys("mipassword");
        driver.findElement(By.id("newUser")).click();



    }
}