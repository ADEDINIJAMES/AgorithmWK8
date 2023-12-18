public class PerfectSquare {
        public static boolean isPerfectSquare(int n){
            int r=(int) Math.sqrt(n);
            System.out.println(r);
            if((r * r) == n){
                return true;
            }
            return false;

        }
        public static void main(String[] args) {
            System.out.println(isPerfectSquare(70));


        }

}
