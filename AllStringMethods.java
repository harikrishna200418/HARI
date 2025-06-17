public class AllStringMethods {
    public static void main(String[] args) {
        String original = "viratkohli";

        System.out.println("Original: " + original);
        System.out.println("Length: " + original.length());
        System.out.println("Uppercase: " + original.toUpperCase());
        System.out.println("Lowercase: " + original.toLowerCase());
        System.out.println("Character at index 0: " + original.charAt(0));
        System.out.println("Substring (0 to 5): " + original.substring(0, 5));
        System.out.println("Contains 'kohli': " + original.contains("kohli"));
        System.out.println("Starts with 'vir': " + original.startsWith("vir"));
        System.out.println("Ends with 'li': " + original.endsWith("li"));
        System.out.println("Replace 'kohli' with 'abdvilliers': " + original.replace("kohli", "abdvilliers"));
        System.out.println("Equals 'VIRATKOHLI': " + original.equals("VIRATKOHLI"));
        System.out.println("Equals Ignore Case 'VIRATKOHLI': " + original.equalsIgnoreCase("VIRATKOHLI"));
    }
}
