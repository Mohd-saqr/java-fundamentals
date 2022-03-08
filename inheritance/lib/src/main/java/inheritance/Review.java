package inheritance;


public  class Review  {
    private String body;
    private String author;
    private double NumberOfStars;
    private  int ID ;
    private String movie;





    public Review(String body, String author, double numberOfStars , Restaurant restaurant ) {
        this.body = body;
        this.author = author;
        NumberOfStars = numberOfStars;
        this.ID=restaurant.getReviews().size()+1;
    }




    public Review(String body, String author, double numberOfStars ) {
        this.body = body;
        this.author = author;
        NumberOfStars = numberOfStars;
        this.ID=0;
    }


    public Review() {

    }

    public Review(String body, String author,double numberOfStars, Shop shop) {
        this.body = body;
        this.author = author;
        this.NumberOfStars=numberOfStars;
        this.ID=shop.getReviews().size()+1;
    }

    public Review(String body, String author, double numberOfStars,Theater theater) {
        this.body = body;
        this.author = author;
        this.NumberOfStars=numberOfStars;
        this.ID=theater.getReviews().size()+1;
    }






    public double getNumberOfStars() {
        return NumberOfStars;
    }

    public void setNumberOfStars(double numberOfStars) {
        NumberOfStars = numberOfStars;
    }

    public void setMovie(String movie) {
        this.movie = movie;
    }

    @Override
    public String toString() {
        String m="Review{" +
                "body='" + body + '\'' +
                ", author='" + author + '\'' +
                ", NumberOfStars=" + NumberOfStars +
                ", ID=" + ID +", Movie=" + movie+
                '}';
        String t = "Review{" +
                "body='" + body + '\'' +
                ", author='" + author + '\'' +
                ", NumberOfStars=" + NumberOfStars +
                ", ID=" + ID +
                '}';

        if (movie!=null){
            return m;
        }
        return t;
    }

    public void updateStars(double NewNumberOfStars, int id){

    }

    public int getID() {
        return ID;
    }



}
