public class Main {
    static final long MOD = 1000000007;

    // n! (save to memory)
    static long[] factorial = new long[3000];
    static void initFactorial() {
        factorial[0] = 1;
        for (int i=1; i<3000; i++) {
            factorial[i] = (factorial[i-1] * i) % MOD;
        }
    }

    // x^n
    static long pow(long x, long n) {
        long ans = 1;
        while (n != 0) {
            if (n % 2 == 1) ans = (ans * x) % MOD;
            x = (x * x) % MOD;
            n = n / 2;
        }
        return ans;
    }

    // nCk = n! * (k!)^(MOD-2) * ((n-k)!)^(MOD-2)
    static long combination(int n, int k) {
        if (n == 0 && k == 0) return 1;
        if (n < k || n < 0) return 0;
        long ans = ((factorial[n] * pow(factorial[k], MOD-2)) % MOD * pow(factorial[n-k], MOD-2)) % MOD;
        return ans;
    }

    public static void main(String[] args) {
        // initialize
        initFactorial();
    }
}
