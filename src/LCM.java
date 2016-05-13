import java.util.Scanner;

public class LCM {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("input1:");
		int input1 = scanner.nextInt();

		System.out.print("input2:");
		int input2 = scanner.nextInt();

		for (int i = input1; i > 0; i--) {
			if (input1 % i == 0 && input2 % i == 0) {
				System.out.println("LCM:" + (input1*input2)/i );
				break;
			}
		}
	}
}
