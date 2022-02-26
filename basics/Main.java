 import java.time.format.DateTimeFormatter;
 import java.util.Random;
 import java.time.LocalDateTime;
 import java.util.Timer;
 import java.util.TimerTask;


 class Main {

    public static void main(String[] args){
        int dogCount = 1;
        System.out.println("I own " + dogCount + " " + pluralize("dog", dogCount) + ".");
        int catCount = 2;
        System.out.println("I own " + catCount + " " + pluralize("cat", catCount) + ".");
        int turtleCount = 0;
        System.out.println("I own " + turtleCount + " " + pluralize("turtle", turtleCount) + ".");
        flipNHeads(1);


        Timer timer = new Timer();
        TimerTask timerTask = new TimerTask() {
            @Override
            public void run() {
         clock();
            }
        };
        timer.scheduleAtFixedRate(timerTask,1000,1000);
    }

    public static String pluralize (String name,int count){
        if(count==0 || count>1){
            return name + "s";
        }
       return name;
    }



    public static void flipNHeads(double n){
        int flip =0;
        int heads=0;
        Random ran = new Random();
        float randomNumber =ran.nextFloat();
        for(float index =randomNumber;index<=n;index+=0.1){
            if (index<0.5){
                flip++;
                System.out.println("tails");
            }else if (index>0.5){
                heads ++;
                flip++;
                System.out.println("heads");
            }

        }
        System.out.println("It took " + flip + " flip to flip " + heads +" head in row");
    }



    public static void clock() {
        LocalDateTime now = LocalDateTime.now();
        int hour = now.getHour();
        int minute = now.getMinute();
        int second = now.getSecond();
        String time = now.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
            System.out.println(time );
    }

}