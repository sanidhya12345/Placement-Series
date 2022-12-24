import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Lab {
    private static boolean isContainsOtherCharacters(String plain){
        Pattern pattern = Pattern.compile("[^a-z]");
        Matcher matcher = pattern.matcher(plain);
        return matcher.find();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int choice=sc.nextInt();
        String plain;
        boolean val=true;
        while(val){
            switch (choice){
                case 1:
                    plain=sc.next();
                    while(isContainsOtherCharacters(plain)){
                        System.out.println("Re-Enter the plain text:-");
                        plain=sc.next();
                        if(!isContainsOtherCharacters(plain)){
                            System.out.println("Enter the choice:-");
                            choice=sc.nextInt();
                            break;
                        }
                    }
                    break;
                case 2:
                    System.out.println("hi");
                    break;
                case 3:
                    System.out.println("helllo");
                    break;
                case 4:
                    System.exit(0);
            }
        }
    }
}
