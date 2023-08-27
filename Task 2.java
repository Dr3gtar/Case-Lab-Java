import java.util.Scanner;

public class Main {
    
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите первое число: ");  
        int a = scan.nextInt();  
        System.out.print("Введите второе число: ");  
        int b = scan.nextInt();  
        
 
        a = a * b;
        b = a / b;
        a = a / b;
  
        System.out.println("Результат:");
        System.out.println("Первое число: " + a);
        System.out.println("Второе число: " + b);
    }
}
