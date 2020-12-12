
package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\PC User1\\Desktop\\SeleniumFiles\\GitMavenNexusTest2\\src\\main\\java\\Features\\LetsKodeIt.feature",

		glue = { "stepDefinitions" }, plugin = { "pretty", "html:test-outout", "json:json_output/cucumber.json",
				"junit:junit_xml/cucumber.xml" },
		monochrome = true,
		strict = true,
		dryRun = false)

public class LetKodeItRunner {

}