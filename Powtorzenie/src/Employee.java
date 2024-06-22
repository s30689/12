public class Employee extends User {
    private static int licznikPracownikow = 0;
    private int idPracownika;

    public Employee(String firstName, String lastName) {
        super(firstName, lastName);
        this.idPracownika = ++licznikPracownikow;

    }

    public int getIdPracownika() {

        return idPracownika;
    }

    public Client dodajKlienta(String firstName, String lastName) {
        return new Client(firstName, lastName);

    }


    public void przyjmijWplate(BankAccount account, double amount) {
        account.wplac(amount);

    }
}
