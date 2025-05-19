//2 a. Develop a java program for performing various string operations with different string
//handling functions directed as follows
//String Creation and Basic Operations, Length and Character Access, String Comparison, String
//Searching, Substring Operations , String Modification, Whitespace Handling, String
//Concatenation, String Splitting, StringBuilder Demo, String Formatting , Validate Email with
//contains( ) and startsWith() and endsWith()

package stringoperation;
public class StringOperationsDemo {
    public static void main(String[] args) {
        // 1. String Creation and Basic Operations
        String str1 = "Hello";
        String str2 = "World";
        System.out.println("String 1: " + str1);
        System.out.println("String 2: " + str2);

        // 2. Length and Character Access
        System.out.println("Length of str1: " + str1.length());
        System.out.println("Character at index 1 of str1: " + str1.charAt(1));

        // 3. String Comparison
        String str3 = "hello";
        System.out.println("str1 equals str3: " + str1.equals(str3));
        System.out.println("str1 equalsIgnoreCase str3: " + str1.equalsIgnoreCase(str3));

        // 4. String Searching
        System.out.println("Index of 'l' in str1: " + str1.indexOf('l'));
        System.out.println("Last index of 'l' in str1: " + str1.lastIndexOf('l'));

        // 5. Substring Operations
        System.out.println("Substring from index 1 to 4 in str1: " + str1.substring(1, 4));

        // 6. String Modification
        String str4 = "  Welcome to Java Programming  ";
        System.out.println("Original with spaces: '" + str4 + "'");
        System.out.println("Trimmed: '" + str4.trim() + "'");
        System.out.println("Replace 'Java' with 'Python': " + str4.replace("Java", "Python"));

        // 7. Whitespace Handling
        String str5 = "   Trim me   ";
        System.out.println("Before trim: '" + str5 + "'");
        System.out.println("After trim: '" + str5.trim() + "'");

        // 8. String Concatenation
        String full = str1.concat(" ").concat(str2);
        System.out.println("Concatenated string: " + full);

        // 9. String Splitting
        String fruits = "Apple,Banana,Orange";
        String[] fruitArray = fruits.split(",");
        System.out.println("Split fruits:");
        for (String fruit : fruitArray) {
            System.out.println(fruit);
        }

        // 10. StringBuilder Demo
        StringBuilder sb = new StringBuilder("Start");
        sb.append(" Middle");
        sb.append(" End");
        System.out.println("StringBuilder content: " + sb.toString());

        // 11. String Formatting
        String name = "Alice";
        int age = 30;
        String formatted = String.format("Name: %s, Age: %d", name, age);
        System.out.println("Formatted string: " + formatted);

        // 12. Email Validation with contains(), startsWith(), and endsWith()
        String email = "user@example.com";
        boolean isValid = email.contains("@") && email.startsWith("user") && email.endsWith(".com");
        System.out.println("Email: " + email);
        System.out.println("Is email valid? " + isValid);
    }
}
