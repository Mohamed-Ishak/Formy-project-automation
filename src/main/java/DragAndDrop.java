import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class DragAndDrop {

    public static void main(String[] args)  {
        System.setProperty("webdriver.chrome.driver"
                ,"C:\\Users\\IshakM\\OneDrive - Vodafone Group\\Documents\\drivers\\chromedriver.exe") ;

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/dragdrop");
        WebElement image = driver.findElement(By.id("image"));
        WebElement box = driver.findElement(By.id("box"));

        Actions actions = new Actions(driver);
        actions.dragAndDrop(image,box).build().perform();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.quit();
    }
}