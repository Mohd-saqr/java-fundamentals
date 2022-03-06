package inheritance;


public  class Review  {
    private String body , author;
    private float NumberOfStars;
    private  int ID ;



    public Review(String body, String author, float numberOfStars ,Restaurant restaurant ) {
        this.body = body;
        this.author = author;
        NumberOfStars = numberOfStars;

        this.ID=restaurant.getReviews().size()+1;
    }



    public Review(String body, String author, float numberOfStars ) {
        this.body = body;
        this.author = author;
        NumberOfStars = numberOfStars;

        this.ID=0;
    }

    public Review() {

    }


    public double getNumberOfStars() {
        return NumberOfStars;
    }

    public void setNumberOfStars(float numberOfStars) {
        NumberOfStars = numberOfStars;
    }

    @Override
    public String toString() {
        String t = "Review{" +
                "body='" + body + '\'' +
                ", author='" + author + '\'' +
                ", NumberOfStars=" + NumberOfStars +
                ", ID=" + ID +
                '}';
        System.out.println(t);
        return t;
    }

    public void updateStars(float NewNumberOfStars, int id){

    }

    public int getID() {
        return ID;
    }
}
