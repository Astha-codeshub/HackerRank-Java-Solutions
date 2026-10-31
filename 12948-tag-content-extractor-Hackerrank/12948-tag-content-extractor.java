import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        
        // Regex explanation:
        // <(.+)> matches an opening tag and captures the tag name in group 1.
        // ([^<]+) matches the content inside the tags (anything except another '<').
        // </\\1> matches the exact same closing tag captured in group 1.
        String regex = "<(.+)>([^<]+)</\\1>";
        Pattern pattern = Pattern.compile(regex);
        
        while (testCases > 0) {
            String line = in.nextLine();
            
            Matcher matcher = pattern.matcher(line);
            boolean matchFound = false;
            
            while (matcher.find()) {
                // matcher.group(2) contains the inner text content
                System.out.println(matcher.group(2));
                matchFound = true;
            }
            
            if (!matchFound) {
                System.out.println("None");
            }
            
            testCases--;
        }
        in.close();
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna