public class Transaction {
    private double kwota;
    private BankAccount kontoZrodlowe;
    private BankAccount kontoDocelowe;


    public Transaction(double kwota, BankAccount kontoZrodlowe, BankAccount kontoDocelowe) {
        this.kwota = kwota;
        this.kontoZrodlowe = kontoZrodlowe;
        this.kontoDocelowe = kontoDocelowe;

    }

    public double getKwota() {
        return kwota;

    }

    public BankAccount getKontoZrodlowe() {
        return kontoZrodlowe;

    }

    public BankAccount getKontoDocelowe() {
        return kontoDocelowe;

    }
}
