package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        plugin = {"html:target/cucumber-report_smoke.html",
                "json:target/json-reports/cucumber.json",
                "junit:target/xml-report/cucumber.xml"
        },

        features="src/test/resources/features",
        glue="stepDefinitions",
        tags="@config",//istediğimiz testcase i yazarak çalıştırırız
        dryRun = false //true yazarsak eksik adımları verie false yazarsak testleri çalıştırır



)


public class TestRunner {
}
