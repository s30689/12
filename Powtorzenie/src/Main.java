public class Main {
    public static void main(String[] args) {
        try {
            Admin admin = new Admin("Admin", "Admin");

            Employee p1 = new Employee("Ben", "Dover");

            Employee p2 = new Employee("Moe", "Lester");

            admin.dodajPracownika(p1);
            admin.dodajPracownika(p2);
            Client klient1 = p1.dodajKlienta("a", "a");
            Client klient2 = p1.dodajKlienta("b", "b");
            Client klient3 = p2.dodajKlienta("c", "c");
            Client klient4 = p2.dodajKlienta("d", "d");
            p1.przyjmijWplate(klient1.getKonto(), 100);
            p1.przyjmijWplate(klient2.getKonto(), 200);
            p2.przyjmijWplate(klient3.getKonto(), 300);
            p2.przyjmijWplate(klient4.getKonto(), 400);
            klient1.getKonto().przelej(10, klient2.getKonto());
            klient2.getKonto().przelej(11, klient3.getKonto());
            klient3.getKonto().przelej(12, klient4.getKonto());
            klient4.getKonto().przelej(13, klient4.getKonto());
            klient1.getKonto().przelej(14, klient2.getKonto());
            klient2.getKonto().przelej(15, klient1.getKonto());
            klient4.getKonto().przelej(16, klient2.getKonto());
            klient4.getKonto().przelej(17, klient3.getKonto());
            klient1.getKonto().przelej(18, klient2.getKonto());
            klient2.getKonto().przelej(19, klient1.getKonto());
            System.out.println("Stan klient1:" + klient1.getKonto().sprawdzStan());
            System.out.println("Stan klient2:" + klient2.getKonto().sprawdzStan());
            System.out.println("Stan klient3:" + klient3.getKonto().sprawdzStan());
            System.out.println("Stan klient4:" + klient4.getKonto().sprawdzStan());
        } catch (AccountOperationException e) {
            System.err.println(e.getMessage());
        }
    }
}