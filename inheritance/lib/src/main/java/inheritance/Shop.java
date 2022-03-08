package inheritance;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class Shop extends Review{
    private String name,description;
    private String star="0.0";
   private String number;
    List<Review> reviews = new ArrayList<>();

    public Shop(String name, String description, double number) {
        this.name = name;
        this.description = description;

        DecimalFormat format = new DecimalFormat("#.###$");
        this.number = format.format(number);
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getNumber() {
        return Integer.getInteger(number);
    }

    public List<Review> getReviews() {
        return reviews;
    }

    public void addReview(String Body, String Author, double numberOfStars) {
        if (numberOfStars > 5) {
            numberOfStars = 5;
        }
        Review newReview = new Review(Body, Author, numberOfStars,this);
        this.reviews.add(newReview);
        setStars();
    }

    public String getStar() {
        return star;
    }

    @Override
    public String toString() {
        String t ="Shop{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", star=" + star +
                ", number=" + number +
                ", reviews=" + reviews +
                '}';
        System.out.println(t);
        return t;
    }

    private void setStars(){
        double total =0;
        for (Review review :reviews){
            total+=review.getNumberOfStars();

        }
        DecimalFormat format = new DecimalFormat("#.##");
        total=total/reviews.size();
        this.star=format.format(total);
    }
}
