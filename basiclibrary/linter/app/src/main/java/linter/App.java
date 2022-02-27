package linter;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;



public class App {
    public String getGreeting() {
        return "";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
        ReaderJS();

    }


    public  HashSet AnalyzingWeatherData(int[][] arr){
        int maxValue = 0;
       HashSet<Integer> arr1 = new HashSet<>();
   HashSet result = new HashSet<>();
        int MinValue= arr[0][0];


        for(int i=0;i< arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
                if (arr[i][j]>maxValue){
                    maxValue =arr[i][j];
                }
            }
        }

        for(int i=0;i< arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
                if (arr[i][j]<MinValue){
                    MinValue =arr[i][j];
                }
            }
        }
        result.add("High :" +maxValue);
        result.add("Low :" +MinValue);

        for(int i=0;i< arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
              arr1.add(arr[i][j]);
            }
        }

        for (int index =MinValue ;index<=maxValue;index++){
            if (!arr1.contains(index)){

                result.add("Never saw temperature: " + index);
            }


        }
//





return result;

    }

    public  String tally(List<String> votes) {


        HashMap<Integer,String> result = new HashMap<>();
        int count = 0;
        int keyBig=0;
        for (int index =0;index<votes.size();index++){
            String person = votes.get(index);
            for (int index1 =0;index1<votes.size();index1++){
                if (votes.get(index1)==person){
                    count++;
                }
            }
            result.put(count,person);

            if(count>keyBig){
                keyBig=count;
            }
            count=0;

        }

        System.out.println(result);

        System.out.println();
        String winner = result.get(keyBig) + "  received the most votes!";



        return winner;
    }

    public static void ReaderJS()  {
        int line=1;
        File files = new File("app/src/main/resources/gates.js");
        ClassLoader classloader = Thread.currentThread().getContextClassLoader();
        InputStream is = classloader.getResourceAsStream("gates.js");

        Scanner scanner = new Scanner(is);
       while (scanner.hasNextLine()){
           String test = scanner.nextLine();
           if (test.lastIndexOf(";")==-1 && test.length()!=0 && test.lastIndexOf("{")==-1 && test.lastIndexOf("}")==-1 && test.indexOf("if")==-1&&test.indexOf("else")==-1 && test.indexOf("//")==-1){
               System.out.println("Line " + line + ": Missing semicolon.");

           }
           line++;
       }
    }


}
