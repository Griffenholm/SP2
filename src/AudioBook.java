public class AudioBook extends Title {
    private final int durationInMinutes;

    public AudioBook(String title, String literatureType, int copies, int durationInMinutes) {
       super(title, literatureType,copies);
       this.durationInMinutes = durationInMinutes;

    }

    @Override
    protected double calculatePoints() {

        switch (literatureType){
            case "BI":
                return durationInMinutes * 1.5;
            case "TE":
                return durationInMinutes * 1.5;
            case "LYRIK":
                return durationInMinutes * 3;
            case "SKØN":
                return durationInMinutes * 0.85;
            case "FAG":
                return durationInMinutes * 0.5;
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
