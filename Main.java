import java.util.Scanner;

public class Main 
{
    public static void main(String[] args) 
    {
        Scanner sScan = new Scanner(System.in);
        
        String sOne = sScan.nextLine();
        int iOne = Integer.parseInt(sOne);

        String sTwo = sScan.nextLine();
        int iTwo = Integer.parseInt(sTwo);
        
        System.out.println(sum(iOne, iTwo));
        sScan.close();
    }
    public static int sum(int iOne, int iTwo) 
    {
        return (iOne + iTwo);
    }
}