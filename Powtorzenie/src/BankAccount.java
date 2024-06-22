import java.util.ArrayList;
import java.util.List;

public class BankAccount implements AccountOperations {
    private double saldo;
    private List<Transaction> transakcje;

    public BankAccount() {
        this.saldo = 0;
        this.transakcje = new ArrayList<>();

    }

    @Override
    public double sprawdzStan() {
        return this.saldo;

    }

    @Override
    public void przelej(double kwota, BankAccount kontoDocelowe) throws AccountOperationException {
        if (kwota <= 0) {
            throw new AccountOperationException("Nieprawidl;owa kwota");
        }
        if (this.saldo < kwota) {
            throw new AccountOperationException("Brak srodkow na wykonanie tej operacji");
        }
        this.saldo -= kwota;
        kontoDocelowe.wplac(kwota);
        Transaction transakcja = new Transaction(kwota, this, kontoDocelowe);
        this.transakcje.add(transakcja);
        kontoDocelowe.dodajTransakcje(transakcja);

    }

    @Override
    public void wplac(double kwota) {
        if (kwota > 0) {
            this.saldo += kwota;
            Transaction transakcja = new Transaction(kwota, null, this);
            this.transakcje.add(transakcja);

        }
    }

    public void dodajTransakcje(Transaction transakcja) {
        this.transakcje.add(transakcja);

    }

    public List<Transaction> getTransakcje() {
        return this.transakcje;

    }
}
