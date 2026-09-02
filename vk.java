import java.util.*;
public class vk {
    public static void main(String[] args) {
       Scanner sc = new Scanner (System.in);
       System.out.print("Enter the value for a and b :");
       int a=sc.nextInt();
       int b=sc.nextInt();
       int button=sc.nextInt();
       switch(button){
         case 1:System.out.println("sum "+(a+b));
         break;
         case 2:System.out.println("difference "+(a-b));
         break;
         case 3:System.out.println("product "+(a*b));
         break;
         case 4:
         if (b==0){
         System.out.println("divisible by 0 is not possible");  
         }else{System.out.println("div "+(a/b));
         break;
      }
         case 5: System.out.println("modulus"+(a%b));
         break;
         default:System.out.println("invalid choice");

       }
      sc.close(); 
       }
}

   