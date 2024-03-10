package com.surya.patterns;

public class One {

	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {// rows
			for (int j = 1; j <= 5; j++) {// columns

				System.out.print("*" + " ");
			}
			System.out.println();

		}

		System.out.println();

		for (int i = 1; i <= 5; i++) {// rows
			for (int j = 1; j <= 5; j++) {// columns

				System.out.print(i + " ");
			}
			System.out.println();

		}

		System.out.println();

		for (int i = 1; i <= 5; i++) {// rows
			for (int j = 1; j <= 5; j++) {// columns

				System.out.print(j + " ");
			}
			System.out.println();

		}

		System.out.println();

		int k = 5;
		for (int i = 1; i <= k; i++) {// rows
			for (int j = 1; j <= k; j++) {// columns

				if (i == 1 || i == k || j == 1 || j == k)
					System.out.print("*" + " ");
				else {
					System.out.print("  ");
				}
			}
			System.out.println();

		}
		System.out.println();

		for (int i = 1; i <= 5; i++) {// rows
			int key = i;
			for (int j = 1; j <= 5; j++) {// columns

				System.out.print(key++ + " ");
			}
			System.out.println();

		}
		System.out.println();

		for (int i = 1; i <= 5; i++) {// rows
			for (int j = 1; j <= i; j++) {// columns

				System.out.print("*" + " ");
			}
			System.out.println();

		}
		System.out.println();

		for (int i = 1; i <= 5; i++) {// rows
			for (int j = 1; j <= i; j++) {// columns

				System.out.print(j + " ");
			}
			System.out.println();

		}
		System.out.println();

		for (int i = 1; i <= 5; i++) {// rows
			for (int j = 1; j <= i; j++) {// columns

				System.out.print(i + " ");
			}
			System.out.println();

		}
		System.out.println();

		for (int i = 1; i <= 5; i++) {// rows

			for (int p = 1; p <= 5 - i; p++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {// columns

				System.out.print("*");
			}

			System.out.println();

		}
		System.out.println();

		for (int i = 1; i <= 5; i++) {// rows

			for (int p = 1; p <= 5 - i; p++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {// columns

				System.out.print("*" + " ");
			}

			System.out.println();

		}
		System.out.println();

		for (int i = 1; i <= 5; i++) {// rows

			for (int p = 1; p <= 5 - i; p++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {// columns

				System.out.print(j);
			}

			System.out.println();

		}
		System.out.println();

		for (int i = 1; i <= 5; i++) {// rows

			for (int p = 1; p <= 5 - i; p++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {// columns

				if (i == 5 || j == 1||j==i||i==1)
					System.out.print("*"+" ");
				else
					System.out.print("  ");
			}

			System.out.println();

		}
		System.out.println();

		for (int i = 1; i <= 5; i++) {// rows

			for (int j = 1; j <= i; j++) {// columns

				if (i == 1 || i == 5 || j == 1 || j == i)
					System.out.print("*");
				else
					System.out.print(" ");
			}

			System.out.println();

		}
		System.out.println();

		

		for (int i = 1; i <= 5; i++) {// rows

			for (int e = 1; e <= 5 - i; e++) {
				System.out.print(" ");
			}

			for (int j = 1; j <= i; j++) {// columns

				if (i == 1 || i == 5 || j == 1 || j == i) {
					System.out.print("*");
				}

				else {
					System.out.print(" ");
				}
			}

			System.out.println();

		}
		System.out.println();
		
		

	}

}
