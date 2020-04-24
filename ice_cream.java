import java.util.*;
class ice_cream
{
    static int total;
    void ice_cream_1()
    {
        System.out.println('\u000C');
        int ice_cream;
        int size;
        Scanner sc = new Scanner(System.in);
        System.out.println("\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582"); 
        System.out.println("         WHICH ICE-CREAM YOU WANT      ");
        System.out.println("\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582"); 
        System.out.println("NO \u2551                       \u2551 1 SCOOP  \u2551  2 SCOOP\u2551  3 SCOOP");
        System.out.println("\u278a  \u2551  SAFFRON ICE-CREAM    \u2551  80      \u2551   120   \u2551   140");
        System.out.println("\u278b  \u2551  CHOCO-CHIPS          \u2551  80      \u2551   120   \u2551   140");
        System.out.println("\u278c  \u2551  ROASTED ALMOND       \u2551  80      \u2551   120   \u2551   140");
        System.out.println("\u278d  \u2551  PISTACHIO ALMOND     \u2551  80      \u2551   120   \u2551   140");
        System.out.println("\u278e  \u2551  VANILA               \u2551  80      \u2551   120   \u2551   140");
        do{
            System.out.println("\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582"); 
            System.out.print("\u2735    Input an option number 1-5 = ");
            ice_cream = sc.nextInt();
            if(ice_cream>5)
            {
                System.out.println("WRONG INPUT \nPLEASE ENTER RIGHT CHOICE");
            }
        }while(ice_cream>5);
        System.out.println("\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582"); 
        do{
            System.out.println("\u272a ENTER WHAT WILL YOU LIKE TO HAVE =  \n1.1 SCOOP\n2.2 SCOOP\n3.3 SCOOP ");
            size = sc.nextInt();
            System.out.println("\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582"); 
             if(size>3)
            {
                System.out.println("WRONG INPUT \nPLEASE ENTER RIGHT SIZE");
            }
        }while(size>3);
        int price1 = 80;
        int price2 = 120;
        int price3 = 140;
        System.out.print("\u272a ENTER QUANTITY YOU WANT = ");
        int quantity = sc.nextInt();
        System.out.println("\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582"); 
        System.out.println('\u000C');
        System.out.println("                          CAFETERIA                           ");
        System.out.println("                  FOR THE PEOPLE AND OF THE PEOPLE                      ");       
        System.out.println("**************************YOUR BILL********************************");
        System.out.println("\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582"); 
        switch(ice_cream)
        {
            case 1 :  System.out.println("NAME OF THE PRODUCT PURCHASED:                SAFFRON ICE-CREAM   ");
            break; 
            case 2 :  System.out.println("NAME OF THE PRODUCT PURCHASED:                CHOCO-CHIPS ");
            break;  
            case 3 :  System.out.println("NAME OF THE PRODUCT PURCHASED:                ROASTED ALMOND ");
            break;
            case 4 :  System.out.println("NAME OF THE PRODUCT PURCHASED:                PISTACHIO ALMOND ");
            break;
            case 5 :  System.out.println("NAME OF THE PRODUCT PURCHASED:                VANILA  ");
            break;
            default : System.out.println("WRONG INPUT");
        }
        if(size == 1)
        {
            System.out.println("COST OF 1 SCOOP ICE-CREAM  IS            =    "+price1);
            System.out.println("QUANTITY                                 =    "+quantity);
            total = price1 * quantity;
            System.out.println("\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582"); 
            System.out.println("TOTAL                                    =    "+total);                        
        }
        else if(size == 2)
        {
            System.out.println("COST OF 2 SCOOP ICE-CREAM   IS           =    "+price2);
            System.out.println("QUANTITY                                 =    "+quantity);
            total = price2 * quantity;
            System.out.println("\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582"); 
            System.out.println("TOTAL                                    =    "+total);
        }

        else if(size == 3)
        {
            System.out.println("COST OF 3 SCOOP ICE-CREAM  IS            =    "+price3);
            System.out.println("QUANTITY                                 =    "+quantity);
            total = price3 * quantity;
            System.out.println("\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582"); 
            System.out.println("TOTAL                                    =    "+total);
        }
    }
}
