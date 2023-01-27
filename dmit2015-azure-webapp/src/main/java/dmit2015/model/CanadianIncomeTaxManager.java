package dmit2015.model;

import lombok.Getter;

import java.net.URISyntaxException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class CanadianIncomeTaxManager {

    //define a private constructor to implement Single pattern
    private CanadianIncomeTaxManager() {

    }

    //define a single instance of this class
    private static CanadianIncomeTaxManager INSTANCE;

    //define a static-class level to access the singleton
    public static CanadianIncomeTaxManager getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new CanadianIncomeTaxManager();
            return INSTANCE;
        }
        return null;
    }

    @Getter
    private List<CanadianPersonalIncomeTaxRate> incomeTaxRates;

    public void loadDataFromFile() {

        List<String> incomeTaxData = new ArrayList<>();
        try {
            Path csvPath = Path.of(
                    getClass()
                            .getClassLoader()
                            .getResource("data/CanadianPersonalIncomeTaxRates.csv").toURI());
            //  incomeTaxRates = Files.readAllLines(csvPath);
        } catch (URISyntaxException e) {
            throw new RuntimeException(e);
        }

    }


}
