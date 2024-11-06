public class Q046 {
    private static int i;
    private static int[] primes = { 2, 3, 5, 7 };
    private static String result = "";

    public static void main(String[] args) {
        while (i < primes.length) {
            if (i == 3) {
                break;
            }
            i++;
            result += primes[i];
        }
        System.out.println(primes.length); //長度: 4
        System.out.println(primes[0]); // 2
        System.out.println(primes[1]); // 3
        System.out.println(primes[2]); // 5
        System.out.println(primes[3]); // 7

        System.out.println(result); //注意!!! result是字串，所以是往後面串接成357
        /*
        序號0進去 i=0，0 < primes.length =4，0+1=1，prime[1]=3，放到String result = 3;
        序號1進去 i=1，1 < primes.length =4，1+1=2，prime[2]=5，放到String result = 35;
        序號2進去 i=2，2 < primes.length =4，2+1=3，prime[3]=7，放到String result = 357;
        序號3進去 i=3，3 < primes.length =4，但i==3，跳出迴圈
        */
    }
}
