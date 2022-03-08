# Inheritance and Interfaces
in this task i create Restaurant class that contain NAME of Restaurant and List for reviews and Star and priceCategory
and create Review class that contain body numberOfStars restaurant object  and in task 7 update my work and add shop class and Theater class

How to use My code Example :

```
Restaurant pizzaHut = new Restaurant("pizza hut"); // create new resturant 
mac.addReview("Burger resturant","ahmad",5); // add review to pizzaHut // it take id 1 and add it i List reviews for this Restaurant
mac.addReview("Burger resturant","ahmad",5); // / add review to pizzaHut // it take id 2 and add it i List reviews for this Restaurant
pizzaHut.updateStars(new stars,id of review ); // it update the review that hase id ==id
pizzaHut.updateStars(4.5,2);pizzaHut.updateStars(new stars,id of review ); // it will update second review

///////////////////////////// FOR TASK 7
Shop shop = new Shop("NAME","book shop",10); // it create new shpe for you
shop.addReview("the number of book is amazing but the design need some fix","mohammed",4.5); it add new review for the shop and update stars
the stars become 4.5
///note that if the last element is number if you get it -- shop.getNumber it return for you 10$

Theater theater = new Theater("Alabdaly theater "); it create new theater for you 
 theater.addReview("amazing movie","mohammed",5); it add new review for you and update strs the stars become 5
 
 //////if you want to review to theater and the movie you was watch it 
 theater.addReview("amazing movie","mohammed",5,"Spider Man"); it add review and update stars
 
///// if you want to add movie  
theater.addMovie("spiderman"); it add to you new movie 

/// if you want to remove movie 

theater.removeMovie("spiderman"); // it remove spiderman movie for you 

```

## Notes AND QUESTIONS{

previous i put the data type of stars byte but when i pass it in main method give me error "Provide Double and require byte "

i feel not good way to put number grater number on it is 5 to Double how i fix it ? ???

in the Stretch Goals **Some Restaurants are part of a chain, and it would be nice to capture, for example, that all the McDonald’s locations are McDonaldses.
Choose an implementation for this, and implement it.
Add tests for this functionality.** i must create interface ? or create class for Restaurants ? or what ?

## update no QUESTIONS **




