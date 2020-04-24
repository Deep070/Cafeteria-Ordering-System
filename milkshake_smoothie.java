import java.util.*;
class milkshake_smoothie
{
    static int total;
    void milkshake_smoothie_1()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println('\u000C');
        int size;
        int SMOOTHIE_AND_MILKSHAKE;
        System.out.println("\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582"); 
        System.out.println("         WHICH SMOOTHIE & MILKSHAKE YOU WANT      ");
        System.out.println("\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582"); 
        System.out.println("NO\u2551                       \u2551 TALL  \u2551  GRANDE \u2551  VENTI");
        System.out.println("\u278a \u2551 MIXED FRUIT SMOOTHIE  \u2551  80   \u2551   100   \u2551   120");
        System.out.println("\u278b \u2551  MANGO SMOOTHIE       \u2551  80   \u2551   100   \u2551   120");
        System.out.println("\u278c \u2551  STRAWBERRY SMOOTHIE  \u2551  80   \u2551   100   \u2551   120");
        System.out.println("\u278d \u2551  CANTALOUPE SMOOTHIE  \u2551  80   \u2551   100   \u2551   120");
        System.out.println("\u278e \u2551  BANANA MILKSHAKE     \u2551  80   \u2551   100   \u2551   120");
        do{
            System.out.println("\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582"); 
            System.out.print("\u2735    Input an option number 1-5 = ");
            SMOOTHIE_AND_MILKSHAKE = sc.nextInt();
            if(SMOOTHIE_AND_MILKSHAKE>5)
            {
                System.out.println("WRONG INPUT \nPLEASE ENTER RIGHT CHOICE");
            }
        }while(SMOOTHIE_AND_MILKSHAKE>5);
        System.out.println("\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582"); 
        do{
            System.out.println("\u272a Enter which one would YOU LIKE TO HAVE = \n1.TALL\n2.GRANDE\n3.VENTI ");
            size = sc.nextInt();
            System.out.println("\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582");
            if(size>3)
            {
                System.out.println("WRONG INPUT \nPLEASE ENTER RIGHT SIZE");
            }
        }while(size>3);
        int price1 = 80;
        int price2 = 100;
        int price3 = 120;
        System.out.print("\u272a ENTER QUANTITY YOU WANT =  ");
        int quantity = sc.nextInt();
        System.out.println("\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582"); 
        System.out.println('\u000C');
        System.out.println("                          CAFETERIA                           ");
        System.out.println("                  FOR THE PEOPLE AND OF THE PEOPLE                      ");       
        System.out.println("**************************YOUR BILL********************************");
        System.out.println("\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582"); 
        switch(SMOOTHIE_AND_MILKSHAKE)
        {
            case 1 :  System.out.println("NAME OF THE PRODUCT PURCHASED:                MIXED FRUIT SMOOTHIE   ");
            break; 
            case 2 :  System.out.println("NAME OF THE PRODUCT PURCHASED:                MANGO SMOOTHIE ");
            break;  
            case 3 :  System.out.println("NAME OF THE PRODUCT PURCHASED:                STRAWBERRY SMOOTHIE ");
            break;
            case 4 :  System.out.println("NAME OF THE PRODUCT PURCHASED:                CANTALOUPE SMOOTHIE ");
            break;
            case 5 :  System.out.println("NAME OF THE PRODUCT PURCHASED:                BANANA MILKSHAKE ");
            break;
            default : System.out.println("WRONG INPUT");
        }
        if(size == 1)
        {
            System.out.println("COST OF 1 TALL SMOOTHIE & MILKSHAKE IS   =    "+price1);
            System.out.println("QUANTITY                                 =    "+quantity);
            total = price1 * quantity;
            System.out.println("\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582"); 
            System.out.println("TOTAL                                    =    "+total);                        
        }
        else if(size == 2)
        {
            System.out.println("COST OF 1 GRANDE SMOOTHIE & MILKSHAKE  IS=    "+price2);
            System.out.println("QUANTITY                                 =    "+quantity);
            total = price2 * quantity;
            System.out.println("\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582"); 
            System.out.println("TOTAL                                    =    "+total);
        }

        else if(size == 3)
        {
            System.out.println("COST OF 1 VENTI SMOOTHIE & MILKSHAKE IS  =    "+price3);
            System.out.println("QUANTITY                                 =    "+quantity);
            total = price3 * quantity;
            System.out.println("\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582"); 
            System.out.println("TOTAL                                    =    "+total);
        }

    }
}
