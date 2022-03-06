package inheritance;

import java.util.ArrayList;
import java.util.List;


public class Restaurant extends Review {
    private String name;
    private float star;
    private float priceCategory;
    private List<Review> reviews= new ArrayList<>();


    public Restaurant(String Name ) {
        this.name = Name;

    }


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public float getStar() {
        return star;
    }

    public float getPriceCategory() {
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

    public void addReview(String Body, String Author, float numberOfStars) {

        if (numberOfStars > 5) {
            numberOfStars = 5;
        }

        Review newReview = new Review(Body, Author, numberOfStars,this);
        this.reviews.add(newReview);
        setStars();


    }

    public List<Review> getReviews() {
        return reviews;
    }

    public void setReviews(List<Review> reviews) {
        this.reviews = reviews;
    }

    @Override
    public void updateStars(float NewNumberOfStars , int id){
        if (NewNumberOfStars > 5) {
            NewNumberOfStars = 5;
        }
        for (Review review :reviews){
            if (review.getID()==id){
                super.setNumberOfStars(NewNumberOfStars);
                review.setNumberOfStars(NewNumberOfStars);

            }

        }
        setStars();
    }

    private void setStars(){
        float total =0;
        for (Review review :reviews){
         total+=review.getNumberOfStars();

            }
        this.star=total/reviews.size();
    }



    }






