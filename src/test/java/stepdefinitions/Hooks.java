package stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.Driver;

public class Hooks {
    //@Before TestNg'deki @BeforeMethod gibi calisir.
    //Her scenario'dan once calisir
    //GLOBAL Hooks annotation
    @Before(order = 1)
    public void setUp(){
        System.out.println("Hooks Class- Setup Method");
    }

    //TAGGED Hooks annotation
    //Her ozel(spesific) scenario'dan once calisir
    @Before(value = "@iphone",order = 2)
    public void searchIphone(){
        System.out.println("Hooks Class- Iphone method");
    }

    //her scenario'dan sonra calisir
    @After
    public void tearDown(Scenario scenario){
        System.out.println("Hooks Class - tearDown Method");

        //screenshot almak icin
        final byte[] screenshot =((TakesScreenshot)Driver.getDriver()).getScreenshotAs(OutputType.BYTES);

        //Her fail olan scenario'dan sonra screenshot almaliyiz.
        //Scenario fail olursa image ekleyelim
        if(scenario.isFailed()){
            scenario.embed(screenshot,"image/png");
        }

       // Driver.closeDriver();
    }


}
