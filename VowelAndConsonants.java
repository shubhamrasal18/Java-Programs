class VowelAndConsonants
{
    public static void vowelAndConsonants(String input)
    {
        int vowel=0;
        int consonant=0;
        for(int i = 0; i < input.length(); i++)
        {
            if(input.charAt(i)=='a' || input.charAt(i)=='e' || input.charAt(i)=='i' || input.charAt(i)=='o' || input.charAt(i)=='u')
            {
                vowel++;
            }
            else
            {
                consonant++;
            }
        }
        System.out.println("Number of vowel="+vowel);
        System.out.println("Number of consonants="+consonant);
    }
    public static void main(String[] args)
    {
        String input ="shubham";
        vowelAndConsonants(input);
    }
}