package Runner1;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = {"src/test/resources/login1/login1.feature"},glue = {"Defination1"},tags ="@PositiveTesting")
public class Test_run extends AbstractTestNGCucumberTests
{

}
