import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Student student = new Student("Ali","Temirbekov", LocalDate.of(2003,06,14));
        Student student1 = new Student("Abu","Zamirbekov", LocalDate.of(2009,05,14));

        Group group = new Group("KUT",LocalDate.of(2009,11,12),student);
        Group group1 = new Group("KUT",LocalDate.of(2009,11,12),student1);
        Group [] groups = {group,group1};

        Company company = new Company("Samsung","Korea",LocalDate.of(2000,11,3),"Menmin",groups);
        Company company1 = new Company("Apple","USA",LocalDate.of(2007,9,3),"Sensin",groups);

        Company [] company2 = {company,company1};
        for (Company com : company2){
            System.out.println(com.getInfoCompany());
            for (Group gr:company.groups) {
                System.out.println(gr.getInfoGroup());
            }
        }

    }
}