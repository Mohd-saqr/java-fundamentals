package inheritance;

import java.util.Random;

public class App {
    public static void main(String[] args) {
        Restaurant mac = new Restaurant("Mac");
        mac.addReview("this is amazing resturant","mohammed",4);
        mac.addReview("this is amazing ","saleem",5);

Restaurant test = new Restaurant("ooo");
        test.addReview("this is amazing ","saleem",5);
        test.addReview("this is amazing ","saleem",5);
        test.getReviews().toString();
        test.updateStars((short) 4.5,10);

        test.toString();
        mac.toString();











    }
}
