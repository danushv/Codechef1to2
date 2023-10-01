import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); 
        
        for (int testCase = 0; testCase < t; testCase++) {
            int n = sc.nextInt();
            int[] speeds = new int[n]; 

            for (int i = 0; i < n; i++) {
                speeds[i] = sc.nextInt();
            }

            int cnt = 0;
            int maxSpeed = Integer.MAX_VALUE;
            
            for (int i = 0; i < n; i++) {
                if (speeds[i] <= maxSpeed) {
                    cnt++; 
                    maxSpeed = speeds[i]; 
                }
            }

            System.out.println(cnt); 
        }
    }
}
