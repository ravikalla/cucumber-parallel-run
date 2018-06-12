package runner;

import org.testng.annotations.Test;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

//https://github.com//freeautomationlearning/cucumberframework
//https://www.youtube.com/watch?v=RoNgPp_I9TU&list=PLXbcghgSZDrrTBLVTbeaUxR2et2XhTZL2&index=7
//TestNG Parallel Execution
//https://www.youtube.com/watch?v=crrfQ8e-uUk
/**
 * @author CHIRAG
 *
 */

// Uncomment @RunWith if you are using Junit to run Test 
// @RunWith(Cucumber.class)

@CucumberOptions(features={"src//test//java//features"}
					,glue={"stepdefinations"}
					,plugin = {"pretty", "html:target/cucumber"}
					, tags ={"@web"}
		)
@Test
public class TestNGTest extends AbstractTestNGCucumberTests{

}
