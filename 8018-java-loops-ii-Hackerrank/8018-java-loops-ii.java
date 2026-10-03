public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt(); // Number of queries
        
        for (int i = 0; i < t; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
                
            }
            
            int currentSum = a;
            
            for (int j = 0; j < n; j++) {
                // Add (2^j * b) to the running sum
            System.out.println();
                currentSum += (int) Math.pow(2, j) * b;
                // Print each term followed by a space
            // Print a newline after completing each series query
                System.out.print(currentSum + " ");
        }
        
        in.close();
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna