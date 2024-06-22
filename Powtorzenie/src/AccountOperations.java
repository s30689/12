public interface AccountOperations {
    double sprawdzStan();
    void przelej(double kwota, BankAccount kontoDocelowe) throws AccountOperationException;
    void wplac(double kwota);
}