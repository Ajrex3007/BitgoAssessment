package atmosol.Runner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags = "@BitGo", features = {"src/test/java/atmosol/Features"}, glue = {"atmosol.StepDef"},
        plugin = {})

public class Runner extends AbstractTestNGCucumberTests {

}

