package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions (
		features = "src//test/resources//taggedFeatures//",
		glue= {"stepDefs"},
		monochrome=true,
		plugin = {
				"html:target//Reports//HtmlReport.html"},
		//tags = "@SmokeTest"
		//tags = "@RegressionTest"
//		tags ="@SmokeTest or @RegressionTest"
//		tags ="@SmokeTest and @RegressionTest"
//		tags ="@PhaseTwo"
//		tags = "@PhaseOne and @SmokeTest"
//		tags = "@PhaseOne and not @SmokeTest"
//		tags= "@PhaseOne and not (@SmokeTest or @RegressionTest)"
//		tags = "@PhaseOne and @SmokeTest and @RegressionTest"
		tags = "@Phase2 and @SmokeTest or @RegressionTest"
)
public class CRMRunner extends AbstractTestNGCucumberTests {

}
