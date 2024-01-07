package strpractice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class StrSpclChar {

    public static void main(String[] args) {
        // validation for the special character
        String strOfMsg = "234rfdfertr3ed#%$FREFE%@#";
        strOfMsg = strOfMsg.replaceAll("[^a-z]","");
        System.out.println("SPECAL CHAR REMOVED "+ strOfMsg);

        // Remove the whitespace from the string

        String whiteSpaceMessage = "   HI I AM WHITE SPCAE MESSAGE DUE YOU WANT T  O REMOVE IT  ";
        whiteSpaceMessage = whiteSpaceMessage.trim();
        System.out.println("WHITE SPACES REMOVED :::---- "+whiteSpaceMessage);
        whiteSpaceMessage = whiteSpaceMessage.replaceAll("\\s","");
        System.out.println("HCE " +whiteSpaceMessage);
        whiteSpaceMessage = whiteSpaceMessage.trim();
        System.out.println("WHITE SPACES REMOVED :::---- "+whiteSpaceMessage);



        /// REMOVE THE DUPLICATE VALUES
        String dupStrMessage = "DSDSDSIIIIIUUU";
StringBuilder stringBuilder = new StringBuilder();

        dupStrMessage.chars().distinct().forEach(i->stringBuilder.append((char)i));
        System.out.println(stringBuilder);
        Set<Character> charSet = new HashSet<>();
        StringBuilder stringBuilder1 = new StringBuilder();
        for(char r :dupStrMessage.toCharArray())
        {
            charSet.add(r);
        }
        System.out.println(charSet);
        for (Character c : charSet)
        {
            stringBuilder1.append(c);

        }
        System.out.println(stringBuilder1);

        // Sorting of String in alphabetic order

        String givenStrForSorting = "rock";
        char unsortedcharArr[] = givenStrForSorting.toCharArray();
        char temp;
        for(int i = 0 ; i<unsortedcharArr.length; i++)
        {
            for (int k=i+1; k<unsortedcharArr.length; k++)

                if (unsortedcharArr[i]>unsortedcharArr[k])
                {
                    System.out.println(i +" "+k +" "+unsortedcharArr.length);
                     temp = unsortedcharArr[i];
                    unsortedcharArr[i]=unsortedcharArr[k];
                    unsortedcharArr[k]=temp;
                }
        }
        System.out.println(Arrays.toString(unsortedcharArr));

//        sortTheStringInAlphabatically(whiteSpaceMessage);
        sortTheStringInAlphabaticallyCustome(givenStrForSorting);
    }
static String sortTheStringInAlphabatically(String value)
{
    char[]  chArray = value.toCharArray();
    Arrays.sort(chArray);
    System.out.println(chArray);
return chArray.toString();
}
    static String sortTheStringInAlphabaticallyCustome(String value)
    {
        char[]  chArray = value.toCharArray();

        char temp;
        for (int i =0; i< chArray.length; i++)
        {

            for (int j = i+1; j< chArray.length; j++)
            {    System.out.println(i +" "+j+" "+chArray.length);
                if(chArray[i]>chArray[j])
                {
                    temp = chArray[i];
                    chArray[i]= chArray[j];
                    chArray[j]=temp;
                }

            }
        }
        System.out.println(chArray);
        StringBuilder sb = new StringBuilder();
        for (Character c: chArray)
        {
            sb.append(c);

        }
        System.out.println(sb);
        return chArray.toString();
    }
}
