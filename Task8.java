public class Task8 {
    public static int cumulativeArgs(int... numbers){
        int total =0;

        for(int n: numbers){
            int cumulative = 0;

            for (int i = 1; i <= n; i++){
                cumulative +=i;
            }

            System.out.println("Cumulative sum for "+ n  + " = " + cumulative);
            total += cumulative;
        }
        return total;
    }
    public static void main(String[] args) {
        int result = cumulativeArgs(4,5,10);
        System.out.println("The total sum of all cumulative values :" + result);
        
    }
    
}
