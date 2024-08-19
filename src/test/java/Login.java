import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Login {

    private WebDriver driver;
    private String driverPath = "c:\\sourcedriver\\chromedriver.exe";

    @Test
    public void setup() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", driverPath);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        driver.get("https://app.friendify.ai/welcome");

        driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div/div/div/div[1]/div/div[3]/a[2]")).click();
        Thread.sleep(2000);

        driver.findElement(By.id("email")).sendKeys("ssg@gmail.com");
        Thread.sleep(2000);

        driver.findElement(By.name("password")).sendKeys("056839908Tai!@");
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("[type='submit']")).submit();
        Thread.sleep(2000);

        //Gererate Text
        driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div/div/div/main/div/div[3]/div/div[1]/div/form/div/textarea")).sendKeys("Hello");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div/div/div/main/div/div[3]/div/div[1]/div/form/div/button/div")).click();
        Thread.sleep(2000);

        //click Back
        driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div/div/div/main/div/div[1]/div/a")).click();
        Thread.sleep(2000);

        //Generate Image Standard
        driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div/div/div/div[4]/div/div/div[1]/div[2]/a")).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div/div/div/main/div/main/div[3]/div/div/div/form/div/textarea")).sendKeys("the cat");
        Thread.sleep(1000);

        driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div/div/div/main/div/main/div[3]/div/div/div/form/div/button")).click();
        Thread.sleep(7000);

        //Generate Image Pro
        driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div/div/div/main/div/main/div[3]/div/div/div/div/button[2]")).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div/div/div/main/div/main/div[3]/div/div/div/form/div/textarea")).sendKeys("the cat");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div/div/div/main/div/main/div[3]/div/div/div/div[1]/div/div[4]/div")).click();
        Thread.sleep(1000);

        driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div/div/div/main/div/main/div[3]/div/div/div/form/div/button")).click();
        Thread.sleep(7000);

        //Click Back
        driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div/div/div/div[4]/div/div/div[1]/div[2]/a")).click();
        Thread.sleep(2000);

        //Click title Chat user
        driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/a[3]")).click();
        Thread.sleep(2000);
        //Click user ở list chat
        driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div/div/div/div[3]/div/div/div[3]/div/div/div")).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div/div/div/main/div/div/div[2]/div/div[2]/form/div/textarea")).sendKeys("Chào Tài");
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("[type='submit']")).submit();
        Thread.sleep(2000);

        //Contact ở Chat user
        driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div/div/div/main/div/div/div[1]/div/div/div[2]/div[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div/div/div/main/div/div/div[1]/div/div/div[2]/div[1]")).click();
        Thread.sleep(2000);

        //Chat bot
        driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div/div/div/main/div/div/div[2]/div/div[3]/div")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div/div/div/main/div/div/div[2]/div/div[3]/div[2]/form/div/textarea")).sendKeys("hello");
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("[type='submit']")).submit();
        Thread.sleep(5000);

        //Click Feed
        driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/a[4]")).click();
        Thread.sleep(2000);

        //Click Assist
        driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/a[5]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div/div/div[3]/div/div/div[2]/label/div")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div/div/div[3]/div/div/div[2]/label/div")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"headlessui-dialog-:r11:\"]/div/div[2]/div/div[2]/button")).click();
        Thread.sleep(5000);
        driver.quit();

    }

}
