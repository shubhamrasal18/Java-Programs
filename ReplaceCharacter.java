import java.util.Scanner;
class ReplaceCharacter
{
    public static String replceMethod(String input,char oldchar, char newchar)
    {
        return input.replace(oldchar,newchar);
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String=");
        String input=sc.nextLine();
        System.out.println("Enter charater to replace=");
        char a=sc.next().charAt(0);
        System.out.println("Enter charcter to replace with=");
        char b=sc.next().charAt(0);

        String res=replceMethod(input, a, b);
        System.out.println("Ater replacing="+res);
    }
}