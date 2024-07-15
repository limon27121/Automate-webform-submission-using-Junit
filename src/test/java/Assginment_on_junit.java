import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class Assginment_on_junit {
    WebDriver driver;

    @BeforeAll
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

    }

  @Test
    public void Submit_form() throws InterruptedException {
        String Name="Limon";
        String Number="01623692274";
        String Date="7/09/2024";
        String Mail="limon@gmail.com";
        driver.get("https://www.digitalunite.com/practice-webform-learners");

        //click to accept cookies
        driver.findElement(By.id("onetrust-accept-btn-handler")).click();

        Utlis.scroll(driver,100);
        Actions action=new Actions(driver);

        //click name field and fill up the field
        WebElement element2=driver.findElement(By.id("edit-name"));
        action.click(element2).perform();
        driver.findElement(By.id("edit-name")).sendKeys(Name);

        //click the number field and fill up the field
        WebElement element3= driver.findElement(By.id("edit-number"));
        action.click(element3).perform();
        driver.findElement(By.id("edit-number")).sendKeys(Number);

        //fill up the date
        WebElement element4= driver.findElement(By.id("edit-date"));
        action.click(element4).perform();
        driver.findElement(By.id("edit-date")).sendKeys(Date);

        //fill up the email field
        WebElement element5= driver.findElement(By.id("edit-email"));
        action.click(element5).perform();
        driver.findElement(By.id("edit-email")).sendKeys(Mail);

        //fill up the  textfield
        String dummy_test="Hello i am Limon";
        WebElement element6= driver.findElement(By.id("edit-tell-us-a-bit-about-yourself-"));
        action.click(element6).perform();
        driver.findElement(By.id("edit-tell-us-a-bit-about-yourself-")).sendKeys(dummy_test);
        Utlis.scroll(driver,500);

        //upload the file
        driver.findElement(By.id("edit-uploadocument-upload")).sendKeys(System.getProperty("user.dir")+"./src/test/resources/pic02.png");
        Thread.sleep(2000);

        //check the checkbox after fill up the form
        WebElement element =driver.findElement(By.id("edit-age"));
        action.click(element).perform();

        // click the submit button
        WebElement element1=driver.findElement(By.id("edit-submit"));
        action.click(element1).perform();

        Thread.sleep(3000);

        //check the message after submit the form
        String expected_text="Thank you for your submission!";
        String actual_text=driver.findElement(By.id("block-pagetitle-2")).getText();
        System.out.println(actual_text);
        Assertions.assertEquals(expected_text,actual_text);


    }

    @AfterAll
    public void close(){
        driver.quit();
    }

}