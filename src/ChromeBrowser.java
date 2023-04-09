import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChromeBrowser {

    public static void main(String[] args) {
        String baseUrl = "https://courses.ultimateqa.com/users/sign_in";
        //Launch the chrome browser
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();// maximize the browser
        // Open the url into browser
        driver.get(baseUrl);

        // implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        // Get the title of the page
        String title = driver.getTitle();
        System.out.println(title);

        //get current url
        System.out.println("Current Url :- " + driver.getCurrentUrl());

        // get page source
        System.out.println(driver.getPageSource());

        // enter user name
        driver.findElement(By.id("user[email]")).sendKeys("Admin@gmail.com");
        // enter password
        driver.findElement(By.id("user[password]")).sendKeys("Admin145165");

        // close the driver
        driver.close();
    }
}
