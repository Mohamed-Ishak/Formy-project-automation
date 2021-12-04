import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker {

    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver"
                ,"C:\\Users\\IshakM\\OneDrive - Vodafone Group\\Documents\\drivers\\chromedriver.exe") ;

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/datepicker");

        WebElement dateFiled = driver.findElement(By.id("datepicker"));
        dateFiled.sendKeys("01/19/2022");
        dateFiled.sendKeys(Keys.RETURN);

    }
}
