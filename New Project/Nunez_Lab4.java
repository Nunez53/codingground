//Debugged Method

public class Nunez_Lab4
{
   public static void main(String[] args)
   {	
       System.out.println("The number of different paths from (1,1) to (4,4) is " + numPaths(1, 1, 4));
   }
   public static int numPaths(int row, int col, int n) {
   if (row == n)
	   return 1;
   
   else if(col == n)
	   return 1;
   
   else
	   return (numPaths(row + 1, col, n) + numPaths(row, col + 1, n));
   }
}