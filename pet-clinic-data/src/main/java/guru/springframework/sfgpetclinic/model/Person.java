package guru.springframework.sfgpetclinic.model;

/**
 * Created by gjorgi.hristovski on 29-Oct-18 in 13:17
 * Created in guru.springframework.sfgpetclinic.model for sfg-pet-clinic
 */
public class Person {

    private String firstName;
    private String lastName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
