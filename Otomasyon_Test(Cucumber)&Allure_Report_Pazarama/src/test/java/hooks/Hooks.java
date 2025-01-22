package hooks;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.qameta.allure.Allure;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.Driver;
import java.io.ByteArrayInputStream;


public class Hooks {

    @Before
    public void setUpScenarios(){ System.out.println("Before Metodu");}

    @After
    public void tearDownScenarios(Scenario scenario){
        System.out.println("After Metodu");
        //fail senaryolar için Screenshot
        if(scenario.isFailed()){
            byte[] screen= ((TakesScreenshot)Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            Allure.addAttachment("Failed Screenshot",new ByteArrayInputStream(screen));
        }
        Driver.quitDriver();
        System.out.println("Driver kapatıldı.");
    }
}
