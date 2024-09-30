package AUTOMATION_TEST.Test;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = { "src/test/resources/features" }
        , glue = { "AUTOMATION_TEST.Definition_Steps" }
        ,tags={"@BuyTest"}
)

public class Runners {

}
