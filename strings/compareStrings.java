package strings;

public class compareStrings {
    public static void main(String[] args) {
        String fruits[] = {"apple","mango","banana"};

      String largest = fruits[0];
      for(int i=1; i<fruits.length; i++){
        if(largest.compareTo(fruits[i])<0){   //compareToIgnoreCase for comparison this is case insensitive and compareTo is case sensitive
            largest = fruits[i];
        }
      }
      System.out.println(largest);
    }
    
}
