public class PrintedBook extends Title{

    private int pages;

    public PrintedBook(String title, String literatureType, int copies, int pages){
        super(title, literatureType, copies);
        this.pages = pages;
    }

    @Override
    protected double calculatePoints() {

         switch (literatureType){
            case "BI":
                return pages * 3;
            case "TE":
                return pages * 3;
            case "LYRIK":
                return pages * 6;
            case "SKØN":
                return pages * 1.7;
            case "FAG":
                return pages * 1;
            default:
                System.out.println("Fejl. Skriv en gyldig litteraturtype");
                return 0;
        }
    }


    @Override
    protected double calculateLiteraturePoints() {
        return calculatePoints() * copies;
    }
}
