/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package inheritance;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {
    @Test void someLibraryMethodReturnsTrue() {
        Library classUnderTest = new Library();
        assertTrue(classUnderTest.someLibraryMethod(), "someLibraryMethod should return 'true'");
    }


    @Test
    void instance(){
        Restaurant mac = new Restaurant("MAC");
        mac.toString();
       assertEquals("0.0",mac.getStar());

    }
    @Test
    void AddReview(){
        Restaurant mac = new Restaurant("MAC");
        mac.addReview("this is expensive resturant","Moahmmed",4);
        mac.addReview("this is expensive resturant","Moahmmed",3.5f);
        assertEquals("3.75",mac.getStar());

    }

    @Test
    void instanceOf(){
        Restaurant mac = new Restaurant("MAC");
        if (mac instanceof Restaurant){
            mac.toString();
        }
    }
    @Test
    void  Review(){
        Review review = new Review("Amazing resturant","Saleem",5);
        review.toString();
    }

    @Test
    void MultiReview(){
        Restaurant mac = new Restaurant("MAC");
        Restaurant pizzaHut = new Restaurant("pizza hut");
        mac.addReview("Burger resturant","ahmad",5);
        mac.addReview("good resturant","sameer", 3.50F);
        pizzaHut.addReview("good pizaa","khalil",4);
        pizzaHut.addReview("good pizaa","khalil",2);
        assertEquals("4.25",mac.getStar());
        assertEquals("3",pizzaHut.getStar());
    }
    @Test
    void updateStars (){
        Restaurant ShawrmaSAGE = new Restaurant("ShawrmaSAGE");

        ShawrmaSAGE.addReview("BEST resturant","ahmad",5);
        ShawrmaSAGE.addReview("good SHAWRMA","sameer", 2);
        assertEquals("3.5",ShawrmaSAGE.getStar());
        ShawrmaSAGE.updateStars(4,2);
        assertEquals("4.5",ShawrmaSAGE.getStar());
    }


    @Test
    void Shop(){

        Shop shop = new Shop("NAME","book shop",10);
        assertNotNull(shop);
    }

    @Test
    void addMovie(){
        Theater theater = new Theater("Alabdaly theater ");
        theater.addMovie("spiderman");
        String result =theater.movies.get(0);
        assertEquals(result,"spiderman");
    }
    @Test
    void removeMovie(){
        Theater theater = new Theater("Alabdaly theater ");
        theater.addMovie("spiderman");
        theater.removeMovie("spiderman");
        int result =theater.movies.size();
        assertEquals(0,0);
    }

    @Test
    void addReviewToMovie(){
        Theater theater = new Theater("Alabdaly theater ");
        theater.addReview("amazing movie","mohammed",5,"Spider Man");
        String result =theater.reviews.get(0).toString();
        assertEquals("Review{body='amazing movie', author='mohammed', NumberOfStars=5.0, ID=1, Movie=Spider Man}",result);

    }
    @Test
    void addReviewToTheater(){
        /// if you go to Theater for the popcorn ^~^
        Theater theater = new Theater("Alabdaly theater ");
        theater.addReview("amazing movie","mohammed",5);
        String result =theater.reviews.get(0).toString();
        assertEquals("Review{body='amazing movie', author='mohammed', NumberOfStars=5.0, ID=1}",result);
    }
    @Test
    void addReviewToShop(){
        Shop shop = new Shop("NAME","book shop",10);
        shop.addReview("the number of book is amazing but the design need some fix","mohammed",4.5);
        String result =shop.reviews.get(0).toString();

        assertEquals("Review{body='the number of book is amazing but the design need some fix', author='mohammed', NumberOfStars=4.5, ID=1}",result);
    }
    @Test
    void CheckStars(){
        Shop shop = new Shop("NAME","book shop",10);
        shop.addReview("the number of book is amazing but the design need some fix","mohammed",4.5);
        shop.addReview("the number of book is amazing but the design need some fix","mohammed",5);
        shop.addReview("the number of book is amazing but the design need some fix","mohammed",3);
        shop.addReview("the number of book is amazing but the design need some fix","mohammed",3.5);
        assertEquals("4",shop.getStar()); ///////// for shop
       // -------------------------------------------------------------------------------------------------------------------------------
        Theater theater = new Theater("Alabdaly theater ");
        theater.addReview("amazing movie","mohammed",5);
        theater.addReview("amazing movie","mohammed",4);
        theater.addReview("amazing movie","mohammed",3.5);
        theater.addReview("amazing movie","mohammed",5);
        assertEquals("4.38",theater.getStar());  // for Theater
    }

}
