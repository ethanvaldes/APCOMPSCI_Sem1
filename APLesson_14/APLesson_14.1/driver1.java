import java.util.ArrayList;
public class driver1
{
   public static void main(String[]args)
   {
       ArrayList<location1> locate = new ArrayList<>();
       double[] honLoc = {5, 6};
       locate.add(new honda1(honLoc));
       locate.add(new toyota1("8, 9"));
       locate.add(new GMC1(3, 8));

       double[] home = {0, 0};

       String printout = "\n\n" + "==========================" + "\nStarting locations...";

       for (location1 l : locate)
       {
           printout += "\nLocation for " + l.getID() + ": (" + getLocation(l.getLoc()) + ")";
       }

       printout += "\n\n" + "==========================" + "\nDistance from home...";
 
       for (location1 l : locate)
       {
           printout += "\nDistance for " + l.getID() + ": (" + getDistance(l.getLoc(), home)+ ")";
       }

       System.out.println(printout);
   }

   public static double getDistance(double[] car, double[] home)
   {
       return Math.sqrt((Math.pow(car[0] - home[0], 2)+ Math.pow(car[1] - home[1], 2)));
   }

   public static String getLocation(double[] loc)
   {
       return loc[0] + ", " + loc[1];
   }
}