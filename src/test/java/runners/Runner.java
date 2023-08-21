package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin ={"pretty",
                "json:target/cucumber.json"},

        features = "src/test/resources/features",
                                     // resources bir klasor. dolayisiyla icindeki dosyalarda bilgiler gezebilir.
                                     // suslu parantez arasina virgul ile baska bir dosya yolu ekleyebiliriz

        glue = "stepdefinitions",   // features lari java ile birlestiren dosya gibi dusun
        tags = "@aile",
        dryRun = false

        // Eger featureslarda bizim eksik yani daha once tanimlanmamis(turuncu olarak gozukenler)senaryolari belirlemek icin
        // eksik adim olup olmadigini dryRun i TRUE yaparak kontrol etmis oluyoruz.

        // Eger testlerimiz passed olursa bu testlerimizin basarili oldugunu degil, eksik adim olmadigini gosterir.
        //Yani testlerimiz run edilmeye hazirdir.

        //Eger eksik adim yok ise tum islemleri tamamladigimizda TESTLERIMI RUN ETMEK ICIN  dryRun i FALSE yapiyoruz.
)

public class Runner {

}
