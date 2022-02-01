import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class MainClass_Homework {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\JetBrains\\IntelliJ IDEA Community Edition 2020.1.3\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.get("https://liquipedia.net/dota2/Main_Page");

        driver.findElement(By.xpath("//*[@id=\"pt-login\"]/a")).click();
        WebElement button = driver.findElement(By.xpath("//div[@class='mw-htmlform-field-HTMLSubmitField mw-ui-vform-field']//button"));
        if (button.getText().equals("Log in")) {
            System.out.println("Success!");
        }
        else
            System.out.println("Fail");
        driver.findElement(By.xpath("//*[@id=\"wpName1\"]")).sendKeys("Northiwe");
        driver.findElement(By.xpath("//*[@id=\"wpPassword1\"]")).sendKeys("RFRltkf111");
        driver.findElement(By.xpath("//*[@id=\"userloginForm\"]/form/div/div[3]/div/div")).click();
        driver.findElement(By.xpath("//*[@id=\"wpPassword1\"]")).getAttribute("value");
        System.out.println("Password is " + driver.findElement(By.xpath("//*[@id=\"wpPassword1\"]")).getAttribute("value"));
        button.submit();
        driver.findElement(By.xpath("//*[@id=\"wiki-nav-main-column\"]/div/ul[2]/li[3]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"pt-logout\"]/a")).click();
        System.out.println("Checked text 1 - " + driver.findElement(By.xpath("//*[@id=\"mw-content-text\"]/div/form/div[1]/div/div/label")).getText());
        driver.findElement(By.xpath("//*[@id=\"ooui-php-2\"]/button")).click();
        System.out.println("Checked text 2 - " + driver.findElement(By.xpath("//*[@id=\"mw-content-text\"]/p[1]/strong")).getText());

        driver.get("http://users.bugred.ru/");

        driver.findElement(By.xpath("/html/body/div[3]/form/table/tbody/tr[4]/td/input")).sendKeys("GoodMail@mail.ru");
        driver.findElement(By.xpath("/html/body/div[3]/form/table/tbody/tr[5]/td[1]/button")).click();
        System.out.println("Email which we find - " + driver.findElement(By.xpath("/html/body/div[3]/form/table/tbody/tr[4]/td/input")).getAttribute("value"));
        driver.findElement(By.xpath("/html/body/div[3]/form/table/tbody/tr[4]/td/input")).clear();


        driver.quit();
    }
}
