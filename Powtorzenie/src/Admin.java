import java.util.ArrayList;
import java.util.List;

public class Admin extends Employee {
    private List<Employee> pracownicy;

    public Admin(String firstName, String lastName) {
        super(firstName, lastName);
        this.pracownicy = new ArrayList<>();

    }

    public void dodajPracownika(Employee pracownik) {
        pracownicy.add(pracownik);

    }

    public void usunPracownika(Employee pracownik) {
        pracownicy.remove(pracownik);

    }


    public List<Employee> getPracownicy() {
        return pracownicy;

    }
}