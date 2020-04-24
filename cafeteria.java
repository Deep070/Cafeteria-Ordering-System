import java.util.*;
import java.io.*;
import java.lang.*;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
class cafeteria
{
    public static void main()
    {
        System.out.println("\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582");
        System.out.println("********    ***      ********  ********   ********  ********   ********  ********    ***            ");
        System.out.println("********   *****     ********  ********   ********  ********   ********  ********   *****          ");
        System.out.println("**        **   **    **        **            **     **         **    **     **     **   **        ");
        System.out.println("**        *******    ******    ********      **     ********   ********     **     *******        ");
        System.out.println("**        **   **    **        **            **     **         ********     **     **   **          ");
        System.out.println("********  **   **    **        ********      **     ********   ** ***    ********  **   **      ");
        System.out.println("********  **   **    **        ********      **     ********   **   ***  ********  **   **            ");
        Scanner sc = new Scanner(System.in);
        double total=0 , total2,discount,cash_back;
        System.out.println("\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582");
        System.out.println("\t\t\t\tWELCOME TO THE CAFETERIA ");
        System.out.println("\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582"); 
        int d = (int)(Math.random()*10);
        int option,choice;
        System.out.println("!!!!!!!!!!!BEFORE YOU PLACE YOUR ORDER LETS PLAY A GAME!!!!!!!!!!!!");
        System.out.println("Enter your lucky one digit number\nIF your lucky number matches with our lucky number You will get 50% discount");
        int s = sc.nextInt();
        System.out.println('\u000C');
        System.out.println("\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582"); 
        System.out.println("YOUR FORTUNE = ");
        if(s==d )
        {
            System.out.println("\nYOU ARE LUCKY!!!\n");
        }
        else
        {
            System.out.println("\nOPPS !! BETTER LUCK NEXT TIME\n");
        }
        System.out.println("\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582"); 
        System.out.println("HELLO !! WHAT YOU WILL LIKE TO HAVE \n1.BEVERAGES \n2.SNACKS ");
        do{
            choice = sc.nextInt();
            if(choice>2)
            {
                System.out.println("WRONG INPUT \nPLEASE ENTER RIGHT CHOICE");
            }
        }while(choice>2);
        switch(choice)
        {
            case 1:
            System.out.println('\u000C');
            System.out.println("\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582"); 
            System.out.println("HELLO !! WHAT YOU WILL LIKE TO HAVE =   ");
            System.out.println("\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582"); 
            System.out.println("COFFE                      \u278a");
            System.out.println("TEA                        \u278b");
            System.out.println("JUICE                      \u278c");
            System.out.println("SMOOTHIE   &  MILKSHAKE    \u278d");
            System.out.println("ICE CREAM                  \u278e");
            do{
                System.out.println("PLEASE ENTER YOUR CHOICE:(1-5)");
                option = sc.nextInt();
                if(option>2)
                {
                    System.out.println("WRONG INPUT \nPLEASE ENTER RIGHT CHOICE");
                }
            }while(option>5);
            coffee obj1 = new coffee();
            tea obj2 = new tea();
            juice obj3 = new juice();
            milkshake_smoothie obj4 = new milkshake_smoothie();  
            ice_cream obj5 = new ice_cream();

            switch(option)
            {
                case 1: obj1.coffee_1();
                total = obj1.total;

                break;
                case 2:obj2.tea_1();
                total = obj2.total;
                break;
                case 3:obj3.juice_1();
                total = obj3.total;
                break;
                case 4:obj4.milkshake_smoothie_1();
                total = obj4.total;
                break; 
                case 5:obj5.ice_cream_1();
                total = obj5.total;
                break; 
            }
            break;
            case 2: 
            System.out.println('\u000C');
            snacks obj6 = new snacks();
            obj6.snacks_1();
            total = obj6.total;
            break;
            case 3: 
        }
        if(s == d)
        {
            discount = (total*50)/100;
            total = discount;
            System.out.println("DISCOUNT                  =    "+discount);
            System.out.println("\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582"); 
            System.out.println("NEW TOTAL                 =    "+total);
        }
        System.out.println(" HOW WOULD YOU LIKE TO PAY BY \n 1.CASH \n 2.CARD");  
        int c = sc.nextInt();

        if(c==1)
        {
            do
            {
                System.out.print("PLEASE ENTER AMOUNT YOU ARE PAYING = ");
                total2 = sc.nextInt();

                System.out.println("AMOUNT ENTERED                    ="+total2);  
                cash_back = total2 - total;
                System.out.println("AMOUNT RETURNED                   ="+cash_back);  
                if(total2<total)
                {
                    System.out.println("PLEASE ENTER RIGHT AMOUNT");
                }
            }while(total2<total);
        }
        else if(c ==2)
        {
            int x = (int)(Math.random() * 1000000);
            System.out.print("ENTER YOUR PIN NO                      =");
            int p = sc.nextInt();
            System.out.println("BALANCE                               =" +x+ "-" +total);
            System.out.println("                                      ="+(x-total));
        }

        System.out.println("\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582"); 
        System.out.println("                       CASHIER = JACK                                ");    
        DateFormat df = new SimpleDateFormat("dd/MM/yy ");
        Calendar calobj = Calendar.getInstance();
        System.out.println("                      DATE = " +df.format(calobj.getTime()));
        System.out.println("                     THANKYOU FOR SHOPPING                              ");
        System.out.println("                  HOPE SO YOU LIKE OURSERVICE                            ");
        System.out.println("                       DO VISIT AGAIN                                    ");
        System.out.println("           CAFETERIA, NEAR WESTERN EXPRESS HIGHWAY ,        ");
        System.out.println("                  MALAD EAST , MUMBAI 400097                        ");
        System.out.println("                   1234567890 / 0987654321                           ");
        System.out.println("\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582"); 
        System.out.println("DO YOU WANT TO CONTINUE ?");
        recontinue obj = new recontinue();
        System.out.println("1.Yes \n2.No");
        int rc = sc.nextInt();
        if( rc == 1)  
        {
            obj.recontinue1();
        }
        else
            System.out.println("");
    }
}
