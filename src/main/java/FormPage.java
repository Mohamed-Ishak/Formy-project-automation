import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class FormPage {

    public static void submitForm(WebDriver driver){

        driver.findElement(By.id("first-name")).sendKeys("Mohamed");
        driver.findElement(By.id("last-name")).sendKeys("Ishak");
        driver.findElement(By.id("job-title")).sendKeys("QA Engineer");

        driver.findElement(By.cssSelector("input[value='radio-button-2']"));
        driver.findElement(By.cssSelector("input[value='checkbox-1']"));
        driver.findElement(By.id("select-menu")).click();

        driver.findElement(By.cssSelector("option[value='2']"));

        driver.findElement(By.id("datepicker")).sendKeys("01/19/2022");
        driver.findElement(By.id("datepicker")).sendKeys(Keys.RETURN);


        driver.findElement(By.cssSelector(".btn.btn-lg.btn-primary")).click();
    }
}
