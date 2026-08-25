import java.util.Scanner;
public class VowelCosa {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Character: ");
		char ch=sc.nextLine().charAt(0);
		switch(ch) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
		System.out.println("Vowel"); break;
		default: System.out.println("Consonant"); break;
		}
	}
}
