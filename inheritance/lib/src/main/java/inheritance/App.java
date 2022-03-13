package inheritance;

import java.util.Random;

public class App {
    public static void main(String[] args) {
//        Restaurant mac = new Restaurant("Mac",10);
//        mac.addReview("this is amazing resturant","mohammed",4);
//        mac.addReview("this is amazing ","saleem",5);

Restaurant test = new Restaurant("ooo",0);
        test.addReview("this is amazing ","saleem",5);
        test.addReview("this is amazing ","saleem",-1);
        test.getReviews().toString();
        test.updateStars((short) 4.5,10);

        test.toString();
//        mac.toString();


//        //-------------------------------------------------------------------

//        Shop shop = new Shop("shope","bookShop",10);
//        shop.addReview("this is amazing","mohammed",5);
//        shop.addReview("this is amazing","mohammed",4.5);
//        shop.toString();
//
//
//
//        Theater theater = new Theater("Alabdaly theater ");
//        theater.addMovie("spiderman");
//        theater.addReview("d","gg",10);
//        theater.addReview("ok","paled",3,"ghfhfgfhfg");
//        theater.removeMovie("spiderman");
//
//        theater.toString();













    }
}
