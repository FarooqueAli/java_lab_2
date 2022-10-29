import java.util.*;
class Menu{
    public static void main(String[] args) {
        int sno;

        Scanner sc=new Scanner(System.in);

        System.out.println("Welcome to Memon Restaurant, Enter the item Sno: to know the price.");
        System.out.println("1.Chicken Zinger Burger");
        System.out.println("2.Chicken Roll");
        System.out.println("3.Chicken Tikka");
        System.out.println("4.Chicken Seekh Kabab");
        sno=sc.nextInt();

        switch(sno)
        {
            case 1:
            System.out.println("The Price for Chicken Zinger Burger is:290/-");
            break;

            case 2:
            System.out.println("The Price for Chicken Roll is:130/-");
            break;

            case 3:
            System.out.println("The Price for Chicken Tikka is:300/-");
            break;

            case 4:
            System.out.println("The Price for Chicken Seekh Kabab is:300/-");
            break;

            default:
            System.out.println("Please Enter a valid number");
        }
    }
}