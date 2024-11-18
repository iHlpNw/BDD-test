import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.platform.engine.Cucumber;
import org.junit.platform.suite.api.Suite;
import org.junit.platform.suite.api.IncludeEngines;
import org.junit.runner.RunWith;

//@Suite
//@IncludeEngines("cucumber")
//@RunWith(Cucumber.class)
//@CucumberOptions(
//        features = "features",  // Путь к .feature файлам
//        glue= {"stepDefinition"},
//        plugin = {"pretty", "html:target/cucumber-reports"}  // Плагины для отчетности
//)
@Cucumber
public class TestRunner {
}