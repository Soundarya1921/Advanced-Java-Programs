//3a. Develop a java program for performing various string operations with different string
//handling functions directed as follows:
//String Creation and Basic Operations, Length and Character Access, String Comparison, String
//Searching, Substring Operations , String Modification, Whitespace Handling, String Concatenation,
//String Splitting, StringBuilder Demo, String Formatting , Validate Email with contains( ) and
//startsWith() and endsWith()

package stringhandlingfunction;
public class StringOperationsDemo3a {
    public static void main(String[] args) {
        // 1. String Creation and Basic Operations
        String str1 = "Hello";
        String str2 = "World";
        System.out.println("String 1: " + str1);
        System.out.println("String 2: " + str2);

        // 2. Length and Character Access
        System.out.println("Length of str1: " + str1.length());
        System.out.println("Character at index 2 of str1: " + str1.charAt(2));

        // 3. String Comparison
        String str3 = "hello";
        System.out.println("str1 equals str3: " + str1.equals(str3));
        System.out.println("str1 equalsIgnoreCase str3: " + str1.equalsIgnoreCase(str3));

        // 4. String Searching
        System.out.println("Index of 'l' in str1: " + str1.indexOf('l'));
        System.out.println("Contains 'lo': " + str1.contains("lo"));

        // 5. Substring Operations
        System.out.println("Substring from index 1 to 4: " + str1.substring(1, 4));

        // 6. String Modification
        String str4 = "Welcome to Java Programming";
        System.out.println("Original: " + str4);
        System.out.println("Replace 'Java' with 'Python': " + str4.replace("Java", "Python"));

        // 7. Whitespace Handling
        String str5 = "   Trim me   ";
        System.out.println("Before trim: '" + str5 + "'");
        System.out.println("After trim: '" + str5.trim() + "'");

        // 8. String Concatenation
        String full = str1.concat(" ").concat(str2);
        System.out.println("Concatenated: " + full);

        // 9. String Splitting
        String colors = "Red,Green,Blue,Yellow";
        String[] colorArray = colors.split(",");
        System.out.println("Colors:");
        for (String color : colorArray) {
            System.out.println(color);
        }

        // 10. StringBuilder Demo
        StringBuilder sb = new StringBuilder("AIET");
        sb.append(" College");
        sb.insert(4, " - ");
        sb.replace(0, 4, "Engineering");
        System.out.println("StringBuilder content: " + sb.toString());

        // 11. String Formatting
        String name = "Alice";
        int marks = 90;
        String formatted = String.format("Student: %s, Marks: %d", name, marks);
        System.out.println("Formatted: " + formatted);

        // 12. Email Validation with contains(), startsWith(), endsWith()
        String email = "student@aiet.org";
        boolean isValid = email.contains("@") && email.startsWith("student") && email.endsWith(".org");
        System.out.println("Email: " + email);
        System.out.println("Is valid email? " + isValid);
    }
}

