package Problems.Easy;

import java.io.ObjectInputStream.GetField;
import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {

    public static void main(String[] args) {
        
        String roman = "MCMXCIV";
        System.out.println(romanToInt(roman));
        
    }

    public static int romanToInt(String s) {
        int result = 0;

        int countOnes = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int val = getValue(c);
            if (i + 1 < s.length()) {
                int nextCharVal = getValue(s.charAt(i + 1));
                if (val >= nextCharVal) {
                    result += val;
                } else {
                    result += (nextCharVal - val);
                    i++;
                }

            } else {
                result += val;
            }
        }


        return result;
        
    }


    public static int getValue(char c)  {
        int val = -1;
        switch(c){
            case 'I':
                val = 1;
                break;
            case 'V':
                val = 5;
                break;
            case 'X':
                val = 10;
                break;
            case 'L':
                val = 50;
                break;
            case 'C':
                val = 100;
                break;
            case 'D':
                val = 500;
                break;
            case 'M':
                val = 1000;
                break;
            default:
                val = -1;
                break;
        }
        return val;
    }
    
}
