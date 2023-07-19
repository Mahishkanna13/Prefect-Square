import java.util.Scanner;

public class PerfectSquare {
    public static boolean Square(int number)
    {
        if(number==1)
        {
            return true;
        }
        for(int i=1;i<number;i++)
        {

            if(number/i==i)
            {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int number= scanner.nextInt();
        System.out.println(Square(number));
    }
}
