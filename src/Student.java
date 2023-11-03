import java.time.LocalDate;

public class Student {

    String firstName;
    String lastName;
    LocalDate dateOfBirth;

    public Student(String firstName,String lastName ,LocalDate dateOfBirth){
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
    }
}
