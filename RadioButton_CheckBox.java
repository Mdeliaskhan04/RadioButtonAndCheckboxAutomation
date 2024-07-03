import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class RadioButton_CheckBox {
    public static void main(String[] args) {
        //Browser Open
        WebDriverManager.firefoxdriver().clearDriverCache().setup();
        WebDriver driver= new FirefoxDriver();
        driver.manage().window().maximize();
        //Open Url
        driver.get("https://demo.guru99.com/test/radio.html");
        //TimeWait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        //RadioButton selecting?
        WebElement element= driver.findElement(By.id("vfb-7-1"));

        //RadioButton existing?
        driver.findElement(By.id("vfb-7-1")).isDisplayed();

       if(!element.isSelected()) {
           //Click on the RadioButton
           driver.findElement(By.id("vfb-7-1")).click();
       }

        //Checkbox selected?
       WebElement checkbox= driver.findElement(By.id("vfb-6-0"));
        //Checkbox existing?
        driver.findElement(By.id("vfb-6-0")).isDisplayed();

       if(!checkbox.isSelected()) {
           //Click on the Checkbox
           driver.findElement(By.id("vfb-6-0")).click();
       }

    }
}
