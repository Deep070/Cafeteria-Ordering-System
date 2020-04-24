import java.util.*;
class juice
{ 
    static int total;
    void juice_1()
    {
        int juice;
        int size;
        System.out.println('\u000C');
        Scanner sc = new Scanner(System.in);
        System.out.println("\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582"); 
        System.out.println("         WHICH JUICE DO YOU WANT      ");
        System.out.println("\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582"); 
        System.out.println("NO \u2551                   \u2551 TALL  \u2551  GRANDE \u2551  VENTI");
        System.out.println("\u278a  \u2551  CARROT JUICE     \u2551  80   \u2551   100   \u2551   120");
        System.out.println("\u278b  \u2551  CANTALOUPE JUICE \u2551  80   \u2551   100   \u2551   120");
        System.out.println("\u278c  \u2551  POMEGRENATE JUICE\u2551  80   \u2551   100   \u2551   120");
        System.out.println("\u278d  \u2551  LEMONADE         \u2551  80   \u2551   100   \u2551   120");
        System.out.println("\u278e  \u2551  FLIXWELD         \u2551  80   \u2551   100   \u2551   120");
        do{
            System.out.println("\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582"); 
            System.out.print("\u2735    Input an option number 1-5 = ");
            juice = sc.nextInt();
            if(juice>5)
            {
                System.out.println("WRONG INPUT \nPLEASE ENTER RIGHT CHOICE");
            }
        }while(juice>5);
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
        System.out.print("\u272a ENTER QUANTITY YOU WANT  = ");
        int quantity = sc.nextInt();
        System.out.println("\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582"); 
        System.out.println('\u000C');
         System.out.println("                          CAFETERIA                           ");
        System.out.println("                  FOR THE PEOPLE AND OF THE PEOPLE                      ");       
        System.out.println("**************************YOUR BILL********************************");
        System.out.println("\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582"); 
        switch(juice)
        {
            case 1 :  System.out.println("NAME OF THE PRODUCT PURCHASED:CARROT JUICE ");
            break; 
            case 2 :  System.out.println("NAME OF THE PRODUCT PURCHASED:CANTALOUPE JUICE ");
            break;  
            case 3 :  System.out.println("NAME OF THE PRODUCT PURCHASED:POMEGRENATE JUICE");
            break;
            case 4 :  System.out.println("NAME OF THE PRODUCT PURCHASED:LEMONADE ");
            break;
            case 5 :  System.out.println("NAME OF THE PRODUCT PURCHASED:FLIXWELD ");
            break;
            default : System.out.println("WRONG INPUT");
        }
        if(size == 1)
        {
            System.out.println("COST OF 1 TALL JUICE IS   =    "+price1);
            System.out.println("QUANTITY                  =    "+quantity);
            total = price1 * quantity;
            System.out.println("\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582"); 
            System.out.println("TOTAL                     =    "+total);                        
        }
        else if(size == 2)
        {
            System.out.println("COST OF 1 GRANDE JUICE  IS=    "+price2);
            System.out.println("QUANTITY                  =    "+quantity);
            total = price2 * quantity;
            System.out.println("\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582"); 
            System.out.println("TOTAL                     =    "+total);
        }

        else if(size == 3)
        {
            System.out.println("COST OF 1 VENTI JUICE IS  =    "+price3);
            System.out.println("QUANTITY                  =    "+quantity);
            total = price3 * quantity;
            System.out.println("\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582"); 
            System.out.println("TOTAL                     =    "+total);
        }

    }
}
