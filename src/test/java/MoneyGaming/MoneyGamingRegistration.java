package MoneyGaming;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MoneyGamingRegistration {
    public static void main(String[] args) throws InterruptedException {
// This is the my eproach hovewer testing is failed , reason is from the deader logo .Please correct me if I am wrong
        // Verify tagline in Linked --> "Say YES to more automotive loans."
        // 1-setting the driver
        WebDriverManager.chromedriver().setup();
        //2-Creating instance of ChromeDriver to be able to do action on Chromebrowser
        WebDriver driver = new ChromeDriver();
        //3-I got google.com
        Thread.sleep(1000);
        driver.get("https://www.google.com");
        driver.manage().window().maximize();
        //4-search "MoneyGaming.com"
        driver.get("https://moneygaming.qa.gameaccount.com/");
        Thread.sleep(1000);

        driver.findElement(By.xpath("//*[@class=\"newUser green\"]")).click();
        Thread.sleep(1000);

        // select the title --> ms
        WebElement element = driver.findElement(By.xpath("//select[@id=\"title\"]"));
        Select sel = new Select(element);
        sel.selectByVisibleText("Ms");
        Thread.sleep(1000);
       driver.findElement(By.xpath("//*[@name='map(firstName)']")).sendKeys("Eldor");
       Thread.sleep(1000);
       driver.findElement(By.xpath("//*[@name='map(lastName)']")).sendKeys("Dmitrov");
       Thread.sleep(1000);
       driver.findElement(By.xpath("//*[@name='map(terms)']")).click();
       Thread.sleep(1000);
       driver.findElement(By.xpath("//*[@id='form']")).submit();

       // validation message with " This field is reqired " under DOB checkbox
       String actualerror = driver.findElement(By.xpath("//*[@class=\"error\"]")).getText();
       String expextederror = "This field is required";
        if(actualerror.startsWith(expextederror)){
            System.out.println("Validation is Passed!");
        }
       Thread.sleep(1500);
       driver.close();







    }
    public static void setup(){

    }
    public static void selectByText(){

    }
}
