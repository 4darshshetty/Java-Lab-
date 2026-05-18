public class StringConstructorDemo {
    public static void main(String[] args) {

        String s1 = new String();
        System.out.println("Empty String: " + s1);

        String s2 = new String("Hello");
        System.out.println("2 From String literal: " + s2);

        char[] charArray = {'J', 'A', 'V', 'A'};
        String s3 = new String(charArray);
        System.out.println("3 From char array: " + s3);

        String s4 = new String(charArray, 1, 2);
        System.out.println("4 From char array (offset, length): " + s4);

        byte[] byteArray = {65, 66, 67, 68};
        String s5 = new String(byteArray);
        System.out.println("5 From byte array: " + s5);

        String s6 = new String(byteArray, 1, 2);
        System.out.println("6 From byte array (offset, length): " + s6);

        String s7 = new String(s2);
        System.out.println("7 Copy of another string: " + s7);

        StringBuilder sb = new StringBuilder("Builder");
        String s8 = new String(sb);
        System.out.println("8 From StringBuilder: " + s8);
    }
}
