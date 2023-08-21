package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin ={"pretty",
                "json:target/cucumber.json"},

        features = "src/test/resources/features",  // resources bir klasor. dolayisiyla icindeki dosyalarda bilgiler gezebilir.
                        // suslu parantez arasina virgul ile baska bir dosya yolu ekleyebiliriz

        glue = "stepdefinitions", // features lari java ile birlestiren dosya gibi dusun
        tags = "@deneme",
        dryRun = false

)





public class Runner {
}
