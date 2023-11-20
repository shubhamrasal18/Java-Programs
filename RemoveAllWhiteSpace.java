class RemoveAllWhiteSpace
{
     public static String removeAllWhiteSpace(String input)
     {
        String res="";
        for(int i = 0; i < input.length(); i++)
        {
            if(input.charAt(i) != ' ')
            {
                res=res+input.charAt(i);
            }
            
        }
        return res;
     }
    public static void main(String[] args)
    {
        String input ="My name is shubham rasal";
       String result= removeAllWhiteSpace(input);
       System.out.println(result);
    }
}