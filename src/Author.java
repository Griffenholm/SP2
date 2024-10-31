import java.text.DecimalFormat;
import java.util.ArrayList;

public class Author {

    //initialize the titles arraylist
    private final String name;
    private final ArrayList<Title> titles;

    public Author (String name){
        this.name = name;
        this.titles = new ArrayList<>();
    }

    //Add titles to a writer
    public void addTitle(Title title){
        titles.add(title);
    }

    // Add the payment for all titles together
    public float calculateTotalPay(){
        float totalPay = 0;
        for (Title title : titles){
            totalPay += (float) title.calculateRoyalties();
        }
        return totalPay;
    }

    // Get name and formatted payment with two decimals
    public String getNameAndFormattedTotalPay(){
        double totalPay = calculateTotalPay();
        DecimalFormat df = new DecimalFormat("#.00");
        return name + ": " + df.format(totalPay) + " kr";
    }
}
