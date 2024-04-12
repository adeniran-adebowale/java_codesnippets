package src.org.fedemyanor.codesnippets;
import java.util.*;


public class Main{
    
    public static void main(String[] args){
        String name="Main method";
        StringBuilder s = new StringBuilder("Main method");
        float x = 3.14E2F;
        float y =19e10F;
        float z =19E10F;
        Counter counter = new Counter();
        int[] arr = {3,7,8,9,10,11,12,13,14,15};
        int [] newarr = new int[arr.length];
        Scanner scanner = new Scanner(System.in);
         int guess;
        do {
            System.out.println("Unlock Your Door");
            guess = scanner.nextInt();
        } while (guess != 67);
        int count=0;
        
        for (int i : arr) {

            newarr[count]=(int) (i+ Math.random()*100);
            count++;
        }
        System.out.println(counter.getCount());
        name="Some new strings";
        counter.increment();
        counter.decrement(5);

        System.out.println(counter.getCount());

        System.out.println("The value in args is: "+args+"  "+name);
        
        s.setCharAt(7, 'S');
        System.out.println(s);

        s.insert(8, name);
        s.reverse();


        System.out.println(x + ", Y:  " + y+", Z: " + z);
        System.out.print("[");
        count=0;
        for (int j = 0; j < newarr.length; j++) {
            if (count==(newarr.length-1)){
                System.out.print(newarr[j]);
            }else{
                System.out.print(newarr[j] + ", ");
            }
            count++;
        }
        System.out.print("]");
    }

    
   
    


}

