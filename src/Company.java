import java.time.LocalDate;

import static java.lang.StringTemplate.STR;

public class Company {
    String companyName;
    String country;
    LocalDate yearOfFound;
    String founder;
    Group[] groups;

    public Company(String companyName,String country,LocalDate yearOfFound,String founder,Group []groups){
        this.companyName = companyName;
        this.country = country;
        this.yearOfFound = yearOfFound;
        this.founder = founder;
        this.groups = groups;





    }
    public String getInfoCompany (){
        return  STR."""
                    INFO:
                CompanyName : \{companyName}
        System.out.println("Hello world!");
                COUNTRY : \{country}
                YearOFBirth : \{yearOfFound}
                Founder : \{founder}
                """;
    }
}
