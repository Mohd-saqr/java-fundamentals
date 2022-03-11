package inheritance;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;


public class Restaurant extends Review {
    private String name;
    private String star ="0.0";
    private String priceCategory ="0.0" +"$";
    private List<Review> reviews= new ArrayList<>();


    public Restaurant(String Name ) {
        this.name = Name;


    }

    public Restaurant(String Name,double priceCategory ) {
        this.name = Name;
        DecimalFormat format = new DecimalFormat("#.###$");
        this.priceCategory = format.format(priceCategory);
    }



    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getStar() {
        return star;
    }

    public String getPriceCategory() {
        return priceCategory;
    }





    @Override
    public String toString() {
        String t ="Restaurant{" +
                "name='" + name + '\'' +
                ", star=" + star +
                ", priceCategory=" + priceCategory +

                '}';
        System.out.println(t);
        return t;
    }

    public void addReview(String Body, String Author, double numberOfStars) {

        if (numberOfStars > 5 || numberOfStars<0) {
            System.out.println("the number of stars should under or equal 5");
        }else {

            Review newReview = new Review(Body, Author, numberOfStars, this);
            this.reviews.add(newReview);
            setStars();
        }

    }

    public List<Review> getReviews() {
        return reviews;
    }

    public void setReviews(List<Review> reviews) {
        this.reviews = reviews;
    }

    @Override
    public void updateStars(double NewNumberOfStars , int id){
        if (NewNumberOfStars > 5 || NewNumberOfStars<0) {
            System.out.println("the number of stars should under or equal 5");
        }else {
            for (Review review : reviews) {
                if (review.getID() == id) {
                    super.setNumberOfStars(NewNumberOfStars);
                    review.setNumberOfStars(NewNumberOfStars);

                }

            }
            setStars();
        }
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






