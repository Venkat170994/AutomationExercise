package StepDefs;

import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyStepdefs {

    WebDriver driver;
    @When("Hit Google on your browser")
    public void HitGoogleonyourbrowser() throws Throwable
    {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\IdeaProjects\\AutomationExercise\\src\\Driver\\chromedriver.exe");
        driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://demo.guru99.com/v4");
    }

    @When("^Enter the Username and Password$")
    public void entertheUsernameandPassword() throws Throwable
    {
        driver.findElement(By.name("uid")).sendKeys("username12");
        driver.findElement(By.name("password")).sendKeys("password12");
    }

    @Then("^Reset the credential$")
    public void Resetthecredential() throws Throwable
    {
        driver.findElement(By.name("btnReset")).click();
    }

    @Then("Click login")
    public void clickLogin() {
        driver.findElement(By.name("btnLogin")).click();
    }

}
