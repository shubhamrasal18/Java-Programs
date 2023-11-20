
class removeDuplicate
{
    public static String removeDuplicate(String s)
    {
        char[] c = s.toCharArray();
        for(int i = 0; i < c.length; i++)
        {
            for(int j = i+1; j < c.length-1; j++)
            {
               if(c[i] == c[j])
               {
                c[j] = ' ';
               }
            }
        }

        String result =new String(c);
        result = result.replace(" ","");
        return result;
    }
    public static void main(String[] args) {
        String input="aaabcccd";
        System.out.println(removeDuplicate(input));
    }
}