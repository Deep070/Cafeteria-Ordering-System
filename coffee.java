import java.util.*;
class coffee
{
    static int total;
    void coffee_1()
    {
        System.out.println('\u000C');
        int coffee;
        int size;
        Scanner sc = new Scanner(System.in);
        System.out.println("\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582"); 
        System.out.println("            WHICH COFFE YOU WANT      ");
        System.out.println("\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582"); 
        System.out.println("NO\u2551                  \u2551 TALL  \u2551  GRANDE \u2551  VENTI");
        System.out.println("\u278a \u2551  ESPRESSO        \u2551  80   \u2551   100   \u2551   120");
        System.out.println("\u278b \u2551  TURKISH  COFFE  \u2551  80   \u2551   100   \u2551   120");
        System.out.println("\u278c \u2551  AMERICANO       \u2551  80   \u2551   100   \u2551   120");
        System.out.println("\u278d \u2551  CAPPUCCINO      \u2551  80   \u2551   100   \u2551   120");
        System.out.println("\u278e \u2551  CAFFE MOCHA     \u2551  80   \u2551   100   \u2551   120");
        System.out.println("\u2790 \u2551  CAFFE LATE      \u2551  80   \u2551   100   \u2551   120");
        System.out.println("\u2791 \u2551  HOT CHOCLATE    \u2551  80   \u2551   100   \u2551   120");
        System.out.println("\u2792 \u2551  BREWED COFFE    \u2551  80   \u2551   100   \u2551   120");
        do{
            System.out.println("\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582"); 
            System.out.print("\u2735    Input an option number 1-8 = ");
            coffee = sc.nextInt();
            if(coffee>5)
            {
                System.out.println("WRONG INPUT \nPLEASE ENTER RIGHT CHOICE");
            }
        }while(coffee>8);
        System.out.println("\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582"); 
        do{
            System.out.println("\u272a Enter WHAT WILL YOU LIKE TO HAVE = \n1.TALL\n2.GRANDE\n3.VENTI ");
            size = sc.nextInt();
            if(size > 3)
            {
                System.out.println("WRONG INPUT \nPLEASE ENTER RIGHT SIZE");
            }
        }while(size>3);
        int price1 = 80;
        int price2 = 100;
        int price3 = 120;
        System.out.println("\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582"); 
        System.out.print("\u272a ENTER QUANTITY YOU WANT = ");
        int quantity = sc.nextInt();
        System.out.println("\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582"); 
        System.out.println('\u000C');
        System.out.println("                          CAFETERIA                           ");
        System.out.println("                  FOR THE PEOPLE AND OF THE PEOPLE                      ");       
        System.out.println("**************************YOUR BILL********************************");
        System.out.println("\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582"); 
        switch(coffee)
        {
            case 1 :  System.out.println("NAME OF THE PRODUCT PURCHASED: ESPRESSO");
            break; 
            case 2 :  System.out.println("NAME OF THE PRODUCT PURCHASED: TURKISH  COFFE");
            break;  
            case 3 :  System.out.println("NAME OF THE PRODUCT PURCHASED: AMERICANO");
            break;
            case 4 :  System.out.println("NAME OF THE PRODUCT PURCHASED: CAPPUCCINO");
            break;
            case 5 :  System.out.println("NAME OF THE PRODUCT PURCHASED: CAFFE MOCHA");
            break;
            case 6 :  System.out.println("NAME OF THE PRODUCT PURCHASED: CAFFE LATE ");
            break;
            case 7 :  System.out.println("NAME OF THE PRODUCT PURCHASED: HOT CHOCLATE ");
            break;
            case 8 :  System.out.println("NAME OF THE PRODUCT PURCHASED: BREWED COFFE");
            break;                                                       
            default : System.out.println("WRONG INPUT");
        }

        if(size == 1)
        {
            System.out.println("COST OF 1 TALL  COFFE IS  =    "+price1);
            System.out.println("QUANTITY                  =    "+quantity);
            total = price1 * quantity;
            System.out.println("\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582"); 
            System.out.println("TOTAL                     =    "+total);                        
        }
        else if(size == 2)
        {
            System.out.println("COST OF 1 GRANDE COFFE IS =    "+price2);
            System.out.println("QUANTITY                  =    "+quantity);
            total = price2 * quantity;
            System.out.println("\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582"); 
            System.out.println("TOTAL                     =    "+total);
        }

        else if(size == 3)
        {
            System.out.println("COST OF 1 VENTI COFFE IS  =    "+price3);
            System.out.println("QUANTITY                  =    "+quantity);
            total = price3 * quantity;
            System.out.println("\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582"); 
            System.out.println("TOTAL                     =    "+total);
        }

    }
}
