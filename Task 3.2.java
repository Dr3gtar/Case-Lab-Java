import java.util.Scanner;
import java.util.Locale;

public class Main {
    
    static boolean palindromeCheck(String word)
    {
        int len = word.length();
        
        for (int i = 0; i < (len/2); i++) {
            if (word.charAt(i) != word.charAt(len-i-1)) {
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите слово: ");  
        String word = scan.nextLine(); 
        word = word.toLowerCase(); //Убрал чувствительность к регистру. В задании про это ничего не написано, но я решил сделать на всякий случай
        boolean result = palindromeCheck(word);
        if (result) {
            System.out.println("Слово " + word + " является палиндромом");
        }
        else {
        System.out.println("Слово " + word + " не является палиндромом");
        }
    }
}
