package epam.introduction.module3.string_n_stringbuilder;

//3. Проверить, является ли заданное слово палиндромом.
public class Task3 {
    public static void main(String[] args) {
        String word = "aaddsaa";
        boolean isPalindrome = true;
        int n = word.length();
        for (int i = 0; i < (n / 2); i++) {
            if (word.charAt(i) != word.charAt(n - i - 1)) {
                isPalindrome = false;
            }

        }

        if (isPalindrome)
            System.out.println(word + " is palindrome");
        else
            System.out.println(word + " is not palindrome");
    }

}
