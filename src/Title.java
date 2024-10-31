public abstract class Title {
    private String title;
    protected String literatureType;
    protected int copies;
    protected double rate = 0.067574;

  public Title (String title, String literatureType, int copies){
      this.title = title;
      this.literatureType = literatureType;
      this.copies = copies;
    }

    protected abstract double calculatePoints();
    protected abstract double calculateLiteraturePoints();

    public double calculateRoyalties() {
        return calculateLiteraturePoints() * rate;
    }
}
