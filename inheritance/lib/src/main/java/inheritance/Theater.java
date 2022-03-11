package inheritance;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class Theater extends Review {
    private String name;
    private String star ="0.0";
    List<String> movies = new ArrayList<>();
    List<Review> reviews = new ArrayList<>();
    List<String> reviewsMovie =new ArrayList<>();

    public String getStar() {
        return star;
    }

    public Theater(String name ) {
        this.name = name;


    }


    public String getName() {
        return name;
    }

    public List<String> getMovies() {
        return movies;
    }

    public List<Review> getReviews() {
        return reviews;
    }

    public void addMovie(String movie){
       movies.add(movie);
    }


    @Override
    public String toString() {

        String t ="Theater{" +
                "name='" + name + '\'' +
                ", stars=" + star +
                ", movies=" + movies +
                ", reviews=" + reviews +
                '}';
        System.out.println(t);
        return t;
    }

    public void removeMovie(String movie){
        for (String m:movies){
            if (m==movie){
                movies.remove(m);
                setStars();
                break;
            }
        }
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

    public void addReview(String Body, String Author, float numberOfStars,String movie) {
        if (numberOfStars > 5 || numberOfStars<0) {
            System.out.println("the number of stars should under or equal 5");
        }else {
            Review newReview = new Review(Body, Author, numberOfStars, this);
            String m = newReview + movie;
            newReview.setMovie(movie);
            this.reviews.add(newReview);
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
