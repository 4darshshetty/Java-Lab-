class StringBufferMethodsDemo {
    public static void main(String args[]) {

        StringBuffer sb = new StringBuffer("Hello");

        System.out.println("Initial StringBuffer: " + sb);
        System.out.println("Length: " + sb.length());
        System.out.println("Capacity: " + sb.capacity());

        sb.append(" world");
        System.out.println("After append(): " + sb);

        sb.insert(6, "Java ");
        System.out.println("After insert(): " + sb);

        sb.replace(6, 10, "Programming");
        System.out.println("After replace(): " + sb);

        sb.delete(6, 18);
        System.out.println("After delete(): " + sb);

        sb.deleteCharAt(5);
        System.out.println("After deleteCharAt(): " + sb);

        sb.reverse();
        System.out.println("After reverse(): " + sb);

        sb.reverse();

        System.out.println("Character at index 4: " + sb.charAt(4));

        sb.setCharAt(0, 'h');
        System.out.println("After setCharAt(): " + sb);

        System.out.println("Substring(0,5): " + sb.substring(0, 5));

        sb.ensureCapacity(50);
        System.out.println("Capacity after ensureCapacity(): " + sb.capacity());

        sb.setLength(5);
        System.out.println("After setLength(): " + sb);

        char ch[] = new char[5];

        sb.getChars(0, 5, ch, 0);

        System.out.print("Characters copied using getChars(): ");

        for (char c : ch) {
            System.out.print(c + " ");
        }

        System.out.println();
    }
}
