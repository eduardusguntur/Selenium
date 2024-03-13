package config;// Import Selenium WebDriver library
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Oneto50Games {
    public static void main(String[] args) {
        // Set ChromeDriver path
        System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\chromedriver.exe");

        // Launch Chrome browser
        WebDriver driver = new ChromeDriver();

        // Navigate to the 1to50 game URL
        driver.get("https://zzzscore.com/1to50/en/");
        driver.manage().window().maximize();
        // Wait for the game to load
        try {
            Thread.sleep(5000); // Wait for 5 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Loop through numbers 1 to 50
        for (int i = 1; i <= 50; i++) {
            // Find and click the current number
            WebElement numberElement = driver.findElement(By.xpath("//div[text()='" + i + "']"));
            numberElement.click();

            // Wait for a short interval before clicking the next number
            try {
                Thread.sleep(500); // Wait for 0.5 seconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // Game finished, close the browser
        driver.quit();
    }
}