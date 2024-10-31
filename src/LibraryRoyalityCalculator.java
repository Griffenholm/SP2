public class LibraryRoyalityCalculator {
    public static void main(String[] args) {

        Author sussi = new Author("Sussi Bech");

            sussi.addTitle(new PrintedBook("Nofred", "TE", 250, 60));
            sussi.addTitle(new AudioBook("De vilde Svaner", "SKØN", 10, 50));
            sussi.addTitle(new PrintedBook("Lær at tegne tegneserier", "FAG", 50, 70));

        Author pernille = new Author("Pernille Jensen");
            pernille.addTitle(new AudioBook("Lær at programmere", "FAG", 50, 350));

            sussi.calculateTotalPay();
            pernille.calculateTotalPay();

        System.out.println(sussi.getNameAndFormattedTotalPay());
        System.out.println(pernille.getNameAndFormattedTotalPay());

    }
}
