class reverseString
{
    public static String reverse(String input)
    {
        String rev="";
       for(int i=input.length()-1;i>=0;i--)
       {
        rev=rev+input.charAt(i);
       }
       return rev;
    }
    public static void main(String[] args)
    {
        String input="shubham";
        String res=reverse(input);
        System.out.println("Reverse String is: " + res);
    }
}