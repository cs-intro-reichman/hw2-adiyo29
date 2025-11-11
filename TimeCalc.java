public class TimeCalc {
    public static void main(String[] args) {
        
        int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
        int OrigMin = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
        int AddMin = Integer.parseInt(args[1]);

        int TotalMin = 60 * hours + OrigMin + AddMin;
        int TotalHour = TotalMin / 60;
        int NewHours = TotalHour % 24;
        int NewMinutes = TotalMin - (TotalHour * 60);

        String NewHoursF = String.format("%02d", NewHours);          
            String NewMinutesF = String.format("%02d", NewMinutes);          

       System.out.println(NewHoursF + ":" + NewMinutesF);

      //  System.out.println(TotalMin);
        //System.out.println(AddMin);
          //      System.out.println(NewHours + "....." + NewMinutes);	
 }
	
}

