import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class Form {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver"
                ,"C:\\Users\\IshakM\\OneDrive - Vodafone Group\\Documents\\drivers\\chromedriver.exe") ;

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/form");


        FormPage.submitForm(driver);


        ConfirmationPage.waitForAlertBanner(driver);

        assertEquals("The form was successfully submitted!",ConfirmationPage.getAlertBannerText(driver));

        driver.quit();





    }




}
