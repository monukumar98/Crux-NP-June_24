package Lec20;

public class sieve_of_eratosthenes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 100;
		System.out.println(PrimeSieve(n));

	}

	// 0 means prime
	public static int PrimeSieve(int n) {
		int[] prime = new int[n + 1];
		prime[0] = 1;// marked not prime
		prime[1] = 1;// marked not prime
		for (int i = 2; i * i <= prime.length; i++) {
			if (prime[i] == 0) {// ye ith index prime number
				for (int j = 2; i * j < prime.length; j++) {
					prime[i * j] = 1;
				}

			}
		}
		int c = 0;
		for (int i = 2; i < prime.length; i++) {
			if (prime[i] == 0) {
				c++;
			}
		}
		return c;

	}

}
