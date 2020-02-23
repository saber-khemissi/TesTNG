package cucumberTest;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.*;
@RunWith(Cucumber.class)
@CucumberOptions(
		features= {"Feature"},
		//tags= {("@Form")}
		//monochrome=true,
		glue={"stepDefinition"}
		)
public class RunnerTest {

}
