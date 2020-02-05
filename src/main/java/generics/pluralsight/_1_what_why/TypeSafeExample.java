package generics.pluralsight._1_what_why;

public class TypeSafeExample {
    public static void main(String[] args) {
        CircularBuffer<String> buffer = new CircularBuffer(10);
        buffer.offer("a");
        buffer.offer("b");
        buffer.offer("c");

        String value = concatenate(buffer);
        System.out.println(value);
    }

    private static String concatenate(CircularBuffer<String> buffer) {
        StringBuilder str = new StringBuilder();
        String value;
        while((value = buffer.poll()) != null)
            str.append(value);
        return str.toString();
    }
}
