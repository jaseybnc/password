import java.util.Random;


public class PasswordGenerator 
{
    public static void main(String[] args)
    {
        int length = 12; // our password length
        System.out.println(generatePswd(length));
    }
    static char[] generatePswd(int len)
    {
        System.out.println("Your Password: ");
        String charsCaps = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"; // our capital letters for inclusion
        String chars = "abcdefghijklmnopqrstuvwxyz";  // lowercase letters
        String nums = "0123456789";  // numbers
        String symbols = "!@#$%^&*_=+-/€.?<>)"; // symbols included in our random password

        String passSymbols = charsCaps + chars + nums + symbols;
        Random rnd = new Random();
        
        char[] password = new char[len];
        int index = 0;
        for (int i = 0; i < len; i++) 
        {
            password[i] = passSymbols.charAt(rnd.nextInt(passSymbols.length()));
            
        }
        return password;
    }
}
