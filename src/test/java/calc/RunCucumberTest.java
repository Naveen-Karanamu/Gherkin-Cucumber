package calc;

import org.junit.platform.suite.api.ConfigurationParameter;
import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.SelectClasspathResource;
import org.junit.platform.suite.api.Suite;

import static io.cucumber.junit.platform.engine.Constants.PLUGIN_PROPERTY_NAME;

@Suite
@IncludeEngines("cucumber")
//specific folders to include in the tests
//@SelectClasspathResource("calc/math")
//@SelectClasspathResource("calc/math/addition.feature")
@SelectClasspathResource("calc")
@SelectClasspathResource("other")
//HTML file to generate the cucumber report
@ConfigurationParameter(key = PLUGIN_PROPERTY_NAME, value = "pretty, html:target/CucumberHtmlReports.html, json:target/CucumberJsonReports.json")
//specific tags to include in the tests
//@ConfigurationParameter(key = "cucumber.filter.tags", value="@calculator")
//@ConfigurationParameter(key = "cucumber.filter.tags", value="@outline or @add and not @sub")
//@ConfigurationParameter(key = "cucumber.filter.tags", value="@outline or @add and not @sub or @imp")
@ConfigurationParameter(key = "cucumber.filter.tags", value="")
public class RunCucumberTest {
}
