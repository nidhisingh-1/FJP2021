package Lec14;

public class AnyBaseSubtraction {

    public static void main(String[] args) {

    }

    public static int subtract(int b, int n1, int n2) {

        int ans = 0;
        int borrow = 0;
        int mul = 1;

        while (n1 > 0 || n2 > 0) {
            int r1 = n1%10;
            int r2 = n2%10;

            n1 = n1/10;
            n2 = n2/10;

            int d = n1 - borrow - n2;

            if(d < 0){
                borrow = 1;
                d = d + b;
            } else {
                borrow = 0;
            }

            ans = ans + d * mul;
            mul = mul * 10;
        }

        return ans;

    }

}
