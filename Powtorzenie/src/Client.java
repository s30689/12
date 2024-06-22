public class Client extends User {
    private static int licznikKlientow = 0;
    private int idKlienta;
    private BankAccount konto;

    public Client(String firstName, String lastName) {
        super(firstName, lastName);
        this.idKlienta = ++licznikKlientow;
        this.konto = new BankAccount();

    }

    public int getIdKlienta() {
        return idKlienta;

    }

    public BankAccount getKonto() {
        return konto;

    }
}