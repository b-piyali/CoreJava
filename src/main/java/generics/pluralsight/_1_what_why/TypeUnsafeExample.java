package generics.pluralsight._1_what_why;

public class TypeUnsafeExample {
    public static void main(String[] args) {
        StringCircularBuffer buffer = new StringCircularBuffer(10);
        buffer.offer("a");
        buffer.offer("b");
        buffer.offer("c");

        String value = concatenate(buffer);
        System.out.println(value);
    }

    private static String concatenate(StringCircularBuffer buffer) {
        StringBuilder str = new StringBuilder();
        String value;
        while((value = buffer.poll()) != null)
            str.append(value);
        return str.toString();
    }
}
