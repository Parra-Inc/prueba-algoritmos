//Solucion numero 3
public class IsPalindro {
	
	public static boolean isPalindrome(String phrase) {
		String word = phrase.replaceAll("\\s+","");
		StringBuilder sb = new StringBuilder();
		return (word.equalsIgnoreCase(sb.append(word).reverse().toString()));
	}

	public static void main(String[] args) {
		System.out.println(isPalindrome("Ana")); //true
		System.out.println(isPalindrome("se van sus naves")); //true
		System.out.println(isPalindrome("15151")); //true
		System.out.println(isPalindrome("palindro")); //false
		System.out.println(isPalindrome("time")); //false
	}
}
