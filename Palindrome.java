class Palindrome
{
    public static String revserseString(String value)
    {
        String result = "";
        for (int i = value.length()-1; i >=0; i--)
        {
            result = result + value.charAt(i);

        }
        return result;
    }
    
    public static boolean palindromeString(String value,String input)
    {
        return value.equals(input);

    }
    public static void main(String[] args)
    {
        String input ="nitin";
        String res=revserseString(input);
        boolean b=palindromeString(res,input);

        String result=(b)?"PALINDROME":"NOT PALINDROME";
        System.out.println(result);
    }
}