package cucumberOptions;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

public class TestNgRunner 
{
	@CucumberOptions(features="src/test/java/features",
			glue="stepDefinition",monochrome=true,
			plugin= {"html:target/cucumber.html","json:target/cucumber.json"
					})
			public class TestNGTestRunner extends AbstractTestNGCucumberTests
			{
				@Override
				@DataProvider(parallel=true)
				//scenarios() helps to run scenarios parallel
				public Object[][] scenarios()
				{
					return super.scenarios();
				}
				
			}
}
