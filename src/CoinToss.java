
import java.util.*;
public class CoinToss
{
    public static boolean flip()
    {
        String[] choices = {"1","2"};
        int length = choices.length;
        int rand1 = (int) (Math.random()*length);
        boolean result = false; // Default Tails
        String num = choices[rand1];
        if(num == "1")
        {
            result = true; //Heads
        }
        return result;
    }

    public static void main(String[] args)
    {
        int input = 0;
        while (input != -1)
        {
            System.out.println("Enter the number of times to toss or -1 to quit:");
            Scanner scanner = new Scanner(System.in);
            input=scanner.nextInt();
            System.out.println();
            int count_heads = 0;
            int count_tails = 0;
            for (int i=0; i< input; i++)
            {
                if(flip())
                    count_heads++;
                else
                    count_tails++;
            }
            if(input > 0)
                System.out.println(count_heads + " Heads " + count_tails + " Tails ");
            System.out.println();

        }
        return;
    }
}