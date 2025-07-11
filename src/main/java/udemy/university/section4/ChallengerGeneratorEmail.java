package udemy.university.section4;

import java.lang.constant.DynamicCallSiteDesc;
import java.util.SplittableRandom;

public class ChallengerGeneratorEmail {
    private String nameComplete;
    private String company;
    private String domain;

    public ChallengerGeneratorEmail() {
        this.nameComplete = "Yan Pizarro";
        this.company = "    Global Mentoring";
        this.domain = "com.mx";
    }

    public String generateEmail() {
        //normalizeData();
        var nameComplete = this.nameComplete.toLowerCase().replace(' ', '.');
        var company = this.company.trim().toLowerCase();
        var domain = this.domain.trim().toLowerCase();
        var domainComplete = String.join(".", company, domain);
        return """
                email: %s
                """.formatted( nameComplete.concat("@").concat(domainComplete));

    }
}
