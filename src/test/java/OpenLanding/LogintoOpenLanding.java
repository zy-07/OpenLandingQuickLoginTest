package OpenLanding;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogintoOpenLanding {

    public static void main(String[] args) throws InterruptedException {
// This is the my eproach hovewer testing is failed , reason is from the deader logo .Please correct me if I am wrong
        // Verify tagline in Linked --> "Say YES to more automotive loans."
        // 1-setting the driver
        WebDriverManager.chromedriver().setup();
        //2-Creating instance of ChromeDriver to be able to do action on Chromebrowser
        WebDriver driver = new ChromeDriver();
        //3-I got google.com
        driver.get("https://www.google.com");
        driver.manage().window().maximize();
        //4-search "Open Lending "
        driver.get("https://www.openlending.com/");
        driver.manage().window().maximize();
        // 5-search login to Linkedin accaunt
        driver.get("https://www.linkedin.com/company/open-lending-inc./");
        Thread.sleep(2000);
        driver.manage().window().maximize();
        // Verify logo of Header  --->Say YES to more automotive loans. should display in the landing page
        driver.findElement(By.xpath("//*[@class=\"top-card-layout__second-subline\"]"));
        String actualTitle = driver.getTitle();
        String expectedInTitle = "Say YES to more automotive loans";
        if(actualTitle.startsWith(expectedInTitle)){
            System.out.println("Verification is Passed!");
        }else{
            System.out.println("Verification is Failed!");
        }
        driver.quit();
    }
}
