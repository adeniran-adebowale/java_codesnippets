package src.org.fedemyanor.codesnippets;

import java.text.SimpleDateFormat;
import java.util.*;


public class TimeDifference {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        long diff=0L;
        Scanner s = new Scanner(System.in);
        String firstHr=s.next();
        String firstMin=s.next();
        String firstSS=s.next();
        String secondHr=s.next();
        String secondMin=s.next();
        String secondSS=s.next();
        s.close();
        firstHr= formatTotime(firstHr);
        firstMin= formatTotime(firstMin);
        firstSS= formatTotime(firstSS);
        secondHr= formatTotime(secondHr);
        secondMin= formatTotime(secondMin);
        secondSS= formatTotime(secondSS);

        String txt1=firstHr+":"+firstMin+":"+firstSS;
        String txt2=secondHr+":"+secondMin+":"+secondSS;;


        //System.out.println(sdf.format(cal.getTime()));
       
        //Date d2=sdf.parse(txt2);
        //Date d1=sdf.parse("01:12:34");
        try {
            Date d1=sdf.parse(txt1);
            System.out.println(sdf.format(d1));
            Date d2=sdf.parse(txt2);
            System.out.println(sdf.format(d2));


            diff=(d2.getTime()-d1.getTime())/1000;


        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
        }
        
        System.out.println(diff);

        

    }


   public static String formatTotime(String txt){
        String t="";
      t=  txt.length()==1 ?"0"+txt:txt;
      return t;
    }
}
