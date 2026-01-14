import java.util.Scanner;
public class CheckPrime {
   public static boolean check(int n){
            if(n<=1){
                return false;
               }
             
                for(int i=2;i<=(int)Math.sqrt(n);i++){
                     if(n%i==0){
                           return false;
                            }
                      }
                 return true;
                 
             }
  public static void main(String args[]){
               Scanner sc =new Scanner(System.in);
               int num=sc.nextInt();
               
               if(check(num)){
                       System.out.println("Prime");
                           }
                 else{
                System.out.println(" Not Prime");
                  }
             }
        
    
}
